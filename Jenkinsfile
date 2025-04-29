pipeline {
    agent any

    tools {
        maven 'Maven3'       // Nom EXACT de l'outil dans Jenkins
        jdk 'JDK17'          // Nom EXACT du JDK dans Jenkins
    }

    stages {
        stage('Build') {
            steps {
                echo "Compilation de l'application..."
                sh 'mvn clean package'
            }
        }

        stage('Tests') {
            steps {
                echo "Lancement des tests..."
                sh 'mvn test'
            }
        }

        stage('Déploiement') {
            when {
                branch 'main'
            }
            steps {
                echo "Déploiement en production..."
                sh 'java -jar target/calculatrice-1.0-SNAPSHOT.jar'
            }
        }
    }
}
