def call(){
    withSonarQubeEnv(credentialsId: 'SonarQube') {
   sh "mvn clean package sonar:sonar"
}
    
}