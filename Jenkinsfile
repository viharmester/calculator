pipeline {
    agent any
    
    parameters {
        choice(name: 'BUILD_TOOL',
            choices: ['MAVEN', 'GRADLE'],
            description: 'Build tool')
        }
    
    stages {
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
    }
}
