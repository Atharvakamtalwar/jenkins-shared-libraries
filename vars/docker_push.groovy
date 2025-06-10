def call(String name, String tag, String user){
  withCredentials([usernamePassword(credentialsId: "dockerHubCred", passwordVariable: "dockerHubPassword", usernameVariable: "dockerHubUser")]){
    sh "echo ${dockerHubPassword} | docker login -u ${dockerHubUser} -p --password-stdin"
  }
  sh "docker push ${dockerHubUser}/${name}:${tag}"
}
