pipeline {
    agent any
    
    parameters {
        choice(name: 'BUILD_TOOL',
            choices: ['MAVEN', 'GRADLE'],
            description: 'Build tool')
        }
    
    stages {
        stage('Build with Maven') {
            when {
                expression {
                    params.BUILD_TOOL == 'MAVEN'
                }
            }
            steps {
                echo 'Maven build...'
            }
        }
        
        stage('Build with Gradle') {
            when {
                expression {
                    params.BUILD_TOOL == 'GRADLE'
                }
            }
            steps {
                echo 'Gradle build...'
            }
        }
    }
}
