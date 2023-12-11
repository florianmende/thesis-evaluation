import subprocess
import os
import argparse
import xml.etree.ElementTree as ET

# Argument parsing
parser = argparse.ArgumentParser(description='Generate code coverage report for a Java project.')
parser.add_argument('--run_id', type=str, default=None, help='Run ID that should be used for the naming of the output file.')
parser.add_argument('--run_ids', type=str, default=None, help='Run IDs used to name the output file (uses length of list).')
args = parser.parse_args()
run_id = args.run_id
run_ids = args.run_ids

# variable declaration
# TODO: adjust paths to your system
java_executable = "java"
jacoco_executable = "/Users/florianmende/Documents/Development/thesis/evaluation/dependencies/jacoco-0.8.11/lib/jacococli.jar"
java_project_jar = "/Users/florianmende/Documents/Development/thesis/evaluation/project/commons-cli-master/out/artifacts/commons_cli_jar/commons-cli.jar"
jacoco_exec = '/Users/florianmende/Documents/Development/thesis/evaluation/project/commons-cli-master/target/jacoco.exec'
classfiles = '/Users/florianmende/Documents/Development/thesis/evaluation/project/commons-cli-master/target/commons-cli-1.6.0-SNAPSHOT.jar'

output_dir = os.path.abspath(os.path.join(os.getcwd(), '../../coverage_reports/'))
if run_id is not None:
    output_filename = f'coverage_report_{run_id}.csv'
else:
    output_filename = f'coverage_report_sample_{run_ids}.csv'
output_path = os.path.join(output_dir, output_filename)
jacoco_report_command = [java_executable, "-jar", jacoco_executable, "report", jacoco_exec, "--classfiles", classfiles, "--csv", output_path]

tests_command = "mvn test"
clean_command = ["mvn", "clean"]
compile_command = ["mvn", "compile"]
package_command = ["mvn", "package"]


def add_jacoco_includes(pom_file: str, package_name: str, class_list: list):
    # Read the pom.xml file as a string
    with open(pom_file, 'r') as file:
        xml_data = file.read()

    class_str = ""
    for class_name in class_list:
        class_str += f"<include>{package_name}.{class_name}</include>\n"

    text_to_insert = '<configuration>\n<includes>\n' + class_str + '</includes>\n</configuration>\n'

    # Find the position to insert the <configurations> section
    insert_position = xml_data.find('<artifactId>maven-surefire-plugin</artifactId>')

    xml_data = xml_data[:insert_position] + text_to_insert + xml_data[insert_position:]

    # Write the modified XML data back to the pom.xml file
    with open(pom_file, 'w') as file:
        file.write(xml_data)

    print(f"Modified {pom_file} to include specific classes in the Jacoco configuration.")

    return text_to_insert


def remove_jacoco_includes(pom_file, inserted_text):
    # Read the pom.xml file as a string
    with open(pom_file, 'r') as file:
        xml_data = file.read()

    # Check if the inserted text exists in the XML data
    if inserted_text in xml_data:
        # Remove the inserted text and any surrounding whitespace
        xml_data = xml_data.replace(inserted_text, '')

    # Write the modified XML data back to the pom.xml file
    with open(pom_file, 'w') as file:
        file.write(xml_data)

    print(f"Removed the previously inserted text from {pom_file}.")


print("Modifying pom.xml to include specific classes in the Jacoco configuration...")
test_classes = []
for root, dirs, files in os.walk("src/test/java"):
    for file in files:
        if file.endswith(".java"):
            test_classes.append(file[:-5])
inserted_text = add_jacoco_includes('pom.xml', "org.apache.commons.cli", test_classes)

print("Cleaning project...")
subprocess.run(clean_command)

print("Compiling Java code...")
subprocess.run(compile_command)

print("Packaging Java code into a JAR file...")
subprocess.run(package_command)

print("Running tests...")
subprocess.run(tests_command, shell=True)

print("Generating code coverage report...")
subprocess.run(jacoco_report_command)

print("Removing the <includes> section in pom.xml for the Jacoco configuration...")
remove_jacoco_includes("pom.xml", inserted_text)
