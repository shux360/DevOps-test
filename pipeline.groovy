pipeline {
    agent any  // Run on any available agent

    stages {
        stage('Hello') {
            steps {
                echo 'Hello, World!'  // Print "Hello, World!"
            }
        }

        stage('Create Directory') {
            steps {
                // Create the directory using a Windows command
                bat 'mkdir C:\\temp\\my-new-directory'
                echo 'Directory created at C:\\temp\\my-new-directory'
            }
        }

        stage('Set Up Virtual Environment') {
            steps {
                bat 'python -m venv venv'
                bat 'call venv\\Scripts\\activate'
            }
        }

        stage('Run Python Script') {
            steps {
                bat 'python hello_world.py'
            }
        }
    }
}
