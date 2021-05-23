pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/${branch}']], extensions: [], userRemoteConfigs: [[credentialsId: 'f2e58725-41b1-4509-bf1b-aecf9a645b91', url: 'https://github.com/xiaobai1315/testJenkins']]])
            }
        }
        stage('build') {
            steps {
                sh label: '', script: 'mvn clean package'
            }
        }
//         stage('deploy') {
//             steps {
//                 deploy adapters: [tomcat9(credentialsId: '398505d1-7128-4779-a2d9-f19f067fde4e', path: '', url: 'http://localhost:8080/')], contextPath: null, war: 'target/*.war'
//             }
//         }
    }
}