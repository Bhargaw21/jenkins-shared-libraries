def clone(String url , String branch){
   echo 'Checking out the code...'
   git url: url, branch: branch
   echo "Code Cloning successful"
}
