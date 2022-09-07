pipeline {
    agent any

    stages {
        stage('build_status_checker') {
            steps {
                script{
                    try {
                sh '''python3 jenkins_build_failure_manually_checker.py -n $number'''
                currentBuild.currentResult = 'SUCCESS'
                    }
                    catch (Exception e) {
        currentBuild.currentResult = 'FAILURE'
                 }
            }     
        }
    }
}
