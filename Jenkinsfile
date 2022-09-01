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
        
        stage('Release to prod') {
            steps {
                echo 'Released to prod...'
            }
        }
        stage('Report') {
            steps {
                sh "printf \"${params.BUILD_TOOL}\" > ${params.BUILD_TOOL}.txt"
                archiveArtifacts allowEmptyArchive: true, 
                    artifacts: '*.txt',
                    fingerprint: true,
                    followSymlinks: false,
                    onlyIfSuccessful: true
            }
        }
    }
}
