pipeline {
    agent any
    
    stages {
      stage('Git Checkout') {
            steps {
                script {
                   // git url: 'https://github.com/rajeshkit/employeeapp.git'
                      echo 'git checkout is done code pulled from github to jenkins workspace'
                }
            }
        }
        stage('Mvn Build') {
            steps {
                script {
                    sh 'mvn clean install'
                      echo 'maven build is done'
                }
            }
        }
        stage('docker image'){
            steps{
             
                sh 'docker build -t 9894851315/ticketapp:${BUILD_NUMBER} .'
                echo 'docker image is created'
            }
        }
        stage('docker deploy'){
            steps{
                sh 'docker container rm -f ticketapp'
                sh 'docker run --name employeeapp -itd -p 8686:8686 9894851315/ticketapp:${BUILD_NUMBER}'
                echo 'docker container is created'
                echo 'docker container is running'
            }
        }
        
    }
 }
