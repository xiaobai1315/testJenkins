pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
                git branch: 'main', credentialsId: 'github', url: 'https://github.com/xiaobai1315/testJenkins.git'
            }
        }
        stage('maven') {
            steps { // 执行shell脚本
                sh 'mvn clean package'
            }
        }
    }
}
