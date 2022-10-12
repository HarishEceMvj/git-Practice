pipeline {
    agent any

    stages {
        stage('build_status_checker') {
            step {
                
                sh '''#!/bin/bash
                python3 jenkins_build_failure_manually_checker.py -n $number
                
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
