def call(String name, String tag, String user){
  withCredentials([usernamePassword(credentialsId: "dockerHubCred", passwordVariable: "dockerHubPassword", usernameVariable: "dockerHubUser")]){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPassword}"
  }
  sh "docker push ${user}/${name}:${tag}"
}
