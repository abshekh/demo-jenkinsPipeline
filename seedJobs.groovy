pipelineJob('all-jobs') {
 definition {
   cps {
     script(readFileFromWorkspace('Jenkinsfile'))
     sandbox()
   }
 }
}
pipelineJob('job1') {
 definition {
   cps {
     script(readFileFromWorkspace('./job1/Jenkinsfile'))
     sandbox()
   }
 }
}
pipelineJob('job2') {
 definition {
   cps {
     script(readFileFromWorkspace('./job2/Jenkinsfile'))
     sandbox()
   }
 }
}
pipelineJob('job3') {
 definition {
   cps {
     script(readFileFromWorkspace('./job3/Jenkinsfile'))
     sandbox()
   }
 }
}