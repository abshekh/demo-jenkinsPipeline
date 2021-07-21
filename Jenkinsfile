pipeline{
  agent any

  stages {
    stage('seed-jobs') {
      steps {
        build job: 'seedJobs'

      }

    }

    stage('Running all the jobs in parallel') {


      parallel {
        stage('job1') {
          steps {
            build job: 'job1'
          }
        }

        stage('job2') {
          steps {
            build job: 'job2'
          }
        }

        stage('job3') {
          steps {
            build job: 'job3'
          }
        }

      }
    }
  }

  

}
