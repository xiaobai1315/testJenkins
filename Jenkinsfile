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
         always {
         emailext(
            emailext body: '${FILE,path="email.html"}', subject: '构建通知:${PROJECT_NAME} - Build # ${BUILD_NUMBER} - ${BUILD_STATUS}!', to: '463799562@qq.com'
         )
        }
    }
}
