def call(String name, String tag, String user){
  sh "docker build -t ${user}/${name}:${tag} ."
}
