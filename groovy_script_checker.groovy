pipeline {
    agent any

    stages {
        stage('build_status_checker') {
            steps {
                
                sh '''#!/bin/bash
                python3 jenkins_build_failure_manually_checker.py -n $number
                echo ${env.BUILD_NUMBER}
                echo ${env.CHECK_ENV}
                '''
                sh 'echo ${env.BUILD_NUMBER}'
            } 
        }
    }
}
