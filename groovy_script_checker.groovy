node {
    stage('Stage') {
        
       def result = sh (returnStandardout: true, script: 'python3 jenkins_build_failure_manually_checker.py -n $number;echo $?')
       println(result)
        
    }
}
