pipeline {
    agent any

    stages {
        stage('build_status_checker') {
            step {
                
                sh '''#!/bin/bash
                python3 jenkins_build_failure_manually_checker.py -n $number
                echo ${os.environ['check_env']}
                '''
            } 
            step("finish") {
                sh'''
            echo ${env.currentBuildStatus}
            '''
            }
        }
    }
}
