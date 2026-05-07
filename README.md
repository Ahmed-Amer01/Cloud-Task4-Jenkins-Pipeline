## **Cloud Computing – Task 4: CI/CD and Jenkins Pipeline**

## Project Overview
This project is developed as part of the Cloud Computing (Task 4).
It demonstrates the use of:
- Git for version control
- Unit testing using JUnit
- CI pipeline implementation using Jenkins

The project includes a simple Calculator application with multiple unit tests and a Jenkins pipeline.

## Project Structure
The workspace is organized as follows:

```
CalculatorProject/
│
├── src/
│   ├── main/
│   │   ├── Calculator.java        # Calculator logic
│   │   └── Main.java              # Main file
│   │
│   └── test/
│       └── CalculatorTest.java    # JUnit test cases
│
├── Jenkinsfile                    # Jenkins pipeline script
└── README.md                      # README file
```

## Unit Testing
Unit tests are implemented using JUnit
Covers all major calculator operations:
- Addition
- Subtraction
- Multiplication
- Division
- Power function
- Square root function

## CI/CD with Jenkins
The project includes a Jenkins pipeline (Jenkinsfile) with the following stages:
1. Clone/Pull Repository
2. Build Project
3. Run Unit Tests