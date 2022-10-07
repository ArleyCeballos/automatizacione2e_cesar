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
    }
}