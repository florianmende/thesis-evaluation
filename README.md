# Evaluation: Automated Unit Test Generation with Large Language Models

This repository contains the evaluation code for the thesis "Automated Unit Test Generation with Large Language Models" by Florian Mende.

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