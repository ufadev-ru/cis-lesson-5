pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                // Команды для сборки
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                // Команды для тестирования
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                // Команды для развертывания
            }
        }
    }
}