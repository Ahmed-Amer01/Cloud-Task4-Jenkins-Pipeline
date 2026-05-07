pipeline {
    agent any

    stages {
        // clone repo from github
        stage('Clone Repo') {
            steps {
                echo 'Cloning Repo...'
                // clone repo from a specified URL
                git 'https://github.com/Ahmed-Amer01/Cloud-Task4-Jenkins-Pipeline.git'
            }
        }

        // another way to clone repo using checkout
        // stage('Checkout') {
        //     steps {
        //         // checkout repo
        //         checkout scm
        //     }
        // }

        // clean up old files
        stage('Cleanup') {
            steps {
                echo 'Cleaning up old files...'
                // remove bin folder if it exists
                bat 'if exist bin rd /s /q bin'
            }
        }

        // build project
        stage('Build') {
            steps {
                echo 'Building Project...'
                // using bat instead of sh to run windows commands
                // create bin folder if it doesn't exist
                bat 'if not exist bin mkdir bin'
                // compile java files
                bat 'javac -cp ".;lib/*" -d bin src/main/*.java src/test/*.java'
            }
        }

        // run unit tests
        stage('Test') {
            steps {
                echo 'Running Unit Tests...'
                // using bat instead of sh to run windows commands
                // run JUnit tests
                bat 'java -cp "bin;lib/*" org.junit.runner.JUnitCore test.CalculatorTest'
            }
        }
    }

    post {
        success {
            echo 'Pipeline executed successfully.'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}