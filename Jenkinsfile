pipeline{
  agent any
  stages{
    stage("build master"){
      when {
        branch 'master'
      }
      steps {
        echo 'executing master branch'
      }
    }
    stage('build dev') {
       when {
        branch 'dev'
      }
      steps {
        echo 'executing dev branch'
      }
    }
  }
}
