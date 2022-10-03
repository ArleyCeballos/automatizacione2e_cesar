pipeline {
   agent any
    stages {
        stage('build') {
            steps {
                bat 'gradlew.bat clean build -x test'
            }
        }
        stage('test') {
            steps {
                   bat 'gradlew.bat test'
                   }
            }
        stage('aggregate') {
            steps {
                bat 'gradlew.bat aggregate'
            }
        }
        stage('publish report'){
            steps {
                publishHTML([
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target/site/serenity',
                    reportFiles: 'index.html',
                    reportName: 'SerenityBDD',
                    reportTitles: ''
                ])
            }
        }
    }
}