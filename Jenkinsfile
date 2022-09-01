pipeline {
    agent any
    
    parameters {
        choice(name: 'ENVIRONMENT',
            choices: ['DEVELOPMENT', 'STAGING', 'PRODUCTION'],
            description: 'Environment')
        
        password(name: 'APIKEY',
            defaultValue: '123ABC',
            description: 'The api kex')
            
        text(name: 'CHANGELOG',
            defaultValue: 'This is the changelog',
            description: 'Changelog')
    }

    stages {
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage('Deploy to production') {
            when {
                expression {
                    params.ENVIRONMENT == 'PRODUCTION'
                }
            }
            steps {
                echo 'Deploy to PRODUCTION'
            }
        }
        stage('Report') {
            steps {
                sh "printf \"${params.CHANGELOG}\" > ${params.ENVIRONMENT}.txt"
                archiveArtifacts allowEmptyArchive: true, 
                    artifacts: '*.txt',
                    fingerprint: true,
                    followSymlinks: false,
                    onlyIfSuccessful: true
            }
        }
    }
}
