pipeline {
    agent any
    tools{
        maven 'Maven'
        dockerTool 'Docker'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building application'
                withMaven() {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Deploy') {
            steps {
                withMaven() {
                    sh 'ls'
                    sh 'sudo usermod -a -G docker ${USER}'
                    sh 'docker cp target/customer-service-0.0.1.jar reverent_thompson:/usr/local/tomcat/webapps'
                }
            }
        }
    }
}
