pipeline {
    agent any

    stages {
        stage('build_status_checker') {
            steps {
                
                def result = sh (returnStatus: true, script: 'python3 jenkins_build_failure_manually_checker.py -n $number').trim()
                println("current build status: "+ result)
                 } 
            }
        stage('finish') {
            steps {
            
                sh 'echo BUILD_status = $CHECK_ENV'
            }
        }
    }
}
