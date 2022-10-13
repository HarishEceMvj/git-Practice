node {
    stage('Stage') {
        def result = sh returnStatus: true, script: 'python3 jenkins_build_failure_manually_checker.py -n $number'
        echo "RESULT IS $result"
    }
}
