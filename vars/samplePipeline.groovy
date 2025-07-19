def call(Map configMap){
    pipeline {
        agent { label 'AGENT-1' }
        environment { 
            greeting = configMap.get('greeting')
        }
        options {
            disableConcurrentBuilds()
            timeout(time: 30, unit: 'MINUTES')
        }
        parameters{
            booleanParam(name: 'deploy', defaultValue: false, description: 'Toggle this value')
        }
        stages {
            stage('print greeting') {
                steps {
                script{
                    echo "Version is: $greeting"
                }
                }
            }
            
        }
        post { 
            always { 
                echo 'I will always say Hello again!'
                deleteDir()
            }
            failure { 
                echo 'I will run when pipeline is failed'
            }
            success { 
                echo 'I will run when pipeline is success'
            }
        }
    }
}