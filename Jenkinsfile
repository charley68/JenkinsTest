pipeline {
  agent any
  stages {

   stage ("clean") {
     steps {
       echo "clean"
     }
   }

   stage ("test") {
     steps {
       def files = findFiles(glob: 'test/*.properties')
       echo """${files[0].name} ${files[0].path}"""
     }
   }
  }
}
