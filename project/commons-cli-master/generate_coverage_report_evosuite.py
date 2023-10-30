import subprocess
import os
import argparse
import xml.etree.ElementTree as ET

# variable declaration
java_executable = "java"
jacoco_executable = "/Users/florianmende/Documents/Development/thesis/evaluation/dependencies/jacoco-0.8.11/lib/jacococli.jar"
java_project_jar = "/Users/florianmende/Documents/Development/thesis/evaluation/project/commons-cli-master/out/artifacts/commons_cli_jar/commons-cli.jar"
jacoco_exec = '/Users/florianmende/Documents/Development/thesis/evaluation/project/commons-cli-master/target/jacoco.exec'
classfiles = '/Users/florianmende/Documents/Development/thesis/evaluation/project/commons-cli-master/target/commons-cli-1.6.0-SNAPSHOT.jar'

output_dir = os.path.abspath(os.path.join(os.getcwd(), '../../coverage_reports_evosuite/'))
output_filename = f'coverage_report_evosuite.csv'
output_path = os.path.join(output_dir, output_filename)
jacoco_report_command = [java_executable, "-jar", jacoco_executable, "report", jacoco_exec, "--classfiles", classfiles, "--csv", output_path]

tests_command = "mvn test"
clean_command = ["mvn", "clean"]
compile_command = ["mvn", "compile"]
package_command = ["mvn", "package"]

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

