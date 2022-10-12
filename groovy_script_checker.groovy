pipeline {
    agent any

    stages {
        stage('build_status_checker') {
            steps {
                
                sh "echo ${env.BUILD_NUMBER}"
            } 
        }
    }
}
