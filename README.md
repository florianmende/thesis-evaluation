# Evaluation: Automated Unit Test Generation with Large Language Models

This repository contains the evaluation code for the thesis "Automated Unit Test Generation with Large Language Models" by Florian Mende.

For the code that was used for test generation refer to the [generation repository](https://github.com/florianmende/thesis-llm-test-generation).

## Usage
The evaluation code is written in Python 3.10 requires the following packages:
- pandas
- tree_sitter
- matplotlib
- seaborn

They can be installed using the following command:
```bash
pip install -r requirements.txt
```

If you want to run the code for generating the coverage reports for the test suites generated by the developed tool, you will need to adjust the dependency paths in `generate_coverage_report.py` within `project/commons-cli` to match your local setup. Specifically, you will need to adjust the path to the JaCoCo jar file and the path to the compiled project. The paths are marked with `TODO` comments.

You will need to have Java and Maven installed on your system to run the evaluation. Furthermore, you will need to have the plugins mentioned in the `pom.xml` file installed in your local Maven repository. The easiest way to do this is to run `mvn install` in the `project/commons-cli` folder.


### Steps for reproducing the evaluation

1. Copy the tests generated though [generation repository](https://github.com/florianmende/thesis-llm-test-generation) into the `tests` folder.
2. Copy the logs generated though [generation repository](https://github.com/florianmende/thesis-llm-test-generation) into the `logs` folder.
3. Modify the paths to the Java dependencies in the `project/commons-cli-master/generate_coverage_report.py` file to match your local setup.
4. Run the `run_coverage_report_generation.ipynb` notebook to generate the coverage reports for the test suites generated by the developed tool. The coverage reports will be stored in the `coverage_reports` folder.
5. If you want to evaluate Evosuite coverage, you first need to run Evosuite on the Apache Commons CLI project with coverage collection enabled. (e.g. ) <br/>
    ```bash
    java -jar evosuite/evosuite-1.2.0.jar -target commons-cli-master/target/classes -projectCP commons-cli-master/target/classes -Doutput_variables=TARGET_CLASS,Lines,Covered_Lines,Total_Methods,Covered_Methods,Total_Branches,Covered_Branches,BranchCoverage,MethodCoverage,LineCoverage,OutputCoverage,Total_Time -Duse_separate_classloader=false -Dreport_dir=<directory> -Dtest_dir=<dir>
    ```
   Then copy the coverage report (`statistics.csv`) in a folder `report_[N]` where `[N]` is the number of the run. The folder should be placed in the `evosuite_runs` folder.
   Copy the generated test suite in a folder `tests_[N]` where `[N]` is the number of the run. The folder should be placed in the `evosuite_runs` folder.

6. Run `evaluate_generation.ipynb` to evaluate the generation performance of the developed tool based on the logs files.
7. Run `evaluate_coverage.ipynb` to evaluate the coverage of the generated test suites based on the coverage reports.
8. Run `evaluate_test_quality.ipynb` to evaluate the test quality of the generated test suites.

## Structure
The repository is structured as follows:
- `coverage_reports`: Contains the Jacoco coverage reports for the unit test suites generated by the developed tool.
- `dependencies`: Contains dependencies that are required for the evaluation, specifically JaCoCo.
- `evosuite`: Contains the full evosuite jar file as well as the standalone runtime jar file.
- `evosuite_runs`: Contains the results of 30 runs of EvoSuite on the Apache Commons CLI project including the generated unit test suites and coverage reports.
- `generation_run_info`: Contains a csv file with aggregated information about the 30 runs of the developed tool.
- `img`: Output folder for all generated plots.
- `lang`: Contains the .so file for the tree-sitter Java parser.
- `logs`: Contains the logs for the 30 runs of the developed tool. They are used to evaluate the tool's generation performance.
- `project`: Contains a modified version of the Apache Commons CLI project that is used for the evaluation. The modifications concern the removal of the original test suite, slight modifications of the pom.xml file for automated coverage report generation, and the addition of a script for running compilation and coverage collection.
- `run_scripts`: Contains the results of the evaluation. Specifically, the results of the 30 runs of the developed tool and the 30 runs of EvoSuite.
- `tests`: Contains the valid unit tests that were collected over 30 runs by the developed tool.

Furthermore, the repository contains the following Python notebooks used for the evaluation:
- `evaluate_coverage.ipynb`: Contains the code for evaluating coverage of the test suites based on the corresponding coverage reports produces by JaCoCo and Evosuite.
- `evaluate_test_quality.ipynb`: Contains the code for investigating different qualitative aspects of the generated test suites.
- `evaluate_generation.ipynb`: Contains the code for evaluating the generation performance of the developed tool.
- `run_coverage_report_generation.ipynb`: Contains the code for running the coverage report generation for the test suites generated by the developed tool. There is no seperate notebook for running the coverage report generation for the test suites generated by EvoSuite, since this is done as part of the EvoSuite runs.

## License

This project including the produced figures is licensed under the Apache License Version 2.0 - see the [LICENSE](LICENSE.txt) file for details.
It includes components from a project licensed under the Eclipse Public License (EPL). The original license text is included in the [EPL](EPL.txt) file.

## Notices

This project includes third-party software with its own licensing terms. See the [NOTICE](NOTICE.txt) file for details.