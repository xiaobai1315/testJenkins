pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '63d16572-c14a-49f4-8b20-0cd9e539609d', url: 'https://github.com/xiaobai1315/testJenkins.git']]])
            }
        }
        stage('build') {
            steps {
                sh label: '', script: 'mvn clean package'
            }
        }
        stage('deploy') {
            steps {
                deploy adapters: [tomcat9(credentialsId: '398505d1-7128-4779-a2d9-f19f067fde4e', path: '', url: 'http://localhost:8080/')], contextPath: null, war: 'target/*.war'
            }
        }
    }
}