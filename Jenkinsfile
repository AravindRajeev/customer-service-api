pipeline {
    agent any
    tools{
        maven 'Maven'
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
                    sh 'docker cp ~/target/customer-service-0.0.1.jar bold_clarke:/usr/local/tomcat/webapps'
                }
            }
        }
    }
}
