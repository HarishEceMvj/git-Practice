node {
    stage('Stage') {
        environment {
        RESULT = sh (returnStdout: true, script: 'python3 jenkins_build_failure_manually_checker.py -n $number').trim()
        }
        echo "${env.RESULT}"
        
       }
    }
}
