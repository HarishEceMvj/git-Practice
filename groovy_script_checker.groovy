pipeline {
    agent any

    stages {
        stage('build_status_checker') {
            steps {
                sh '''python3 jenkins_build_failure_manually_checker.py -n $number'''
                sh ''' 
                if [ $? -eq 0 ]; then
                    currentBuild.currentResult = 'SUCCESS'
                else
                    currentBuild.currentResult = 'FAILURE'
                fi
                '''
            }
        }
    }
}
