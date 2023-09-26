pipeline {
  agent {
    node {
      label 'build'
    }

  }
  stages {
    stage('build-stage') {
      agent {
        node {
          label 'build'
        }

      }
      environment {
        dir = 'C:\\TUTORIALS\\JENKINS\\EXAMPLES\\TestCI_CD.git'
      }
      steps {
        echo 'prova'
      }
    }

  }
  environment {
    dir = 'C:\\TUTORIALS\\JENKINS\\EXAMPLES\\TestCI_CD.git\\spmia-chapter3-master'
  }
}