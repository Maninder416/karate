pipeline {
    agent any
    tools {
            maven 'maven-test'
            'org.jenkinsci.plugins.docker.commons.tools.DockerTool' 'docker-test'
    }
    stages {

        stage('maven spring test case') {
            steps {
            withCredentials([usernamePassword(credentialsId: '8b688f9b-c143-4bcf-9eb5-7c0a2edf2d70', passwordVariable: 'p', usernameVariable: 'u')]) {
                sh 'mvn test'
            }

            }
        }

    }
}