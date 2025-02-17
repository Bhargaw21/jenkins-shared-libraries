def call(String ProjectName , String ImageTag , String DockerhubUser){
  echo "Building docker image"
  sh "docker build -t ${DockerhubUser}/${ProjectName}:${ImageTag} ."
}
