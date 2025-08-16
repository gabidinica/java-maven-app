#!/usr/bin.env groovy

pipeline {   
    agent any
    stages {
        stage("test") {
            steps {
                script {
                    echo "Testing the application..."

                }
            }
        }
        stage("build") {
            steps {
                script {
                    echo "Building the application..."
                }
            }
        }

        stage("deploy") {
            steps {
                script {
                    def dockerCmd='docker run -d -p 3080:3080 gabiand/demo-app:1.0'
                    echo "Deploying the application..."
                    sshagent(['ec2-server-key']){
                        sh "ssh -o StrictHostKeyChecking=no ec2-user@63.176.92.177 ${dockerCmd}"
                    }
                }
            }
        }               
    }
} 

