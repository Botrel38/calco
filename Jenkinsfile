pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1'   // Le nom défini dans Jenkins > Global Tool Configuration
        jdk 'JDK 17'          // Idem
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
