node {
    stage('Stage') {
        def result = sh (returnStdout: true, script: 'python3 jenkins_build_failure_manually_checker.py -n $number').trim()
        echo "RESULT IS $result"
        if (result == 'ERROR') {
            currentBuild.currentResult = "FAILURE"
        }
    }
}
