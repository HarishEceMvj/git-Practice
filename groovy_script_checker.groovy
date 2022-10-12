pipeline {
    agent any

    stages {
        stage('build_status_checker') {
            steps {
                
                sh '''#!/bin/bash
                python3 jenkins_build_failure_manually_checker.py -n $number
                echo ${os.environ['check_env']}
                '''
            } 
            steps ("finish") {
                sh'''
            echo ${env.currentBuildStatus}
            '''
            }
        }
    }
}
