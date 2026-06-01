pipeline {
    agent any
    tools {
        maven 'Maven-3.9'
    }
    stages {
        stage('1 - Git Checkout') {
            steps {
                git credentialsId: 'git_credentials',
                    url: 'https://github.com/kelly-alphador/Projet_TP2.git',
                    branch: 'master'
            }
        }
        stage('2 - Build Maven') {
            steps {
                bat 'mvn clean install -DskipTests'
            }
        }
        stage('3 - Tests unitaires') {
            steps {
                bat 'mvn test'
            }
        }
        stage('4 - Build image Docker') {
            steps {
                bat 'docker build -t kellyalphador/formes-geo:1.0.0 .'
            }
        }
        stage('5 - Push DockerHub') {
            steps {
                withCredentials([string(credentialsId: 'dockerhubpass',
                                        variable: 'dockerHubPass')]) {
                    bat 'docker login -u kellyalphador -p %dockerHubPass%'
                    bat 'docker push kellyalphador/formes-geo:1.0.0'
                }
            }
        }
    }
    post {
    failure {
        emailext body: "Le build #${BUILD_NUMBER} a echoue. Verifiez les logs.",
                 subject: "Jenkins - Build echoue",
                 to: 'kellyalphador@gmail.com'
    }
    success {
        echo 'Pipeline termine avec succes !'
    }
}
}