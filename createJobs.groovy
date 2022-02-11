pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/velizarvel/spring-boot-api-for-docker-jenkins-awt.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}