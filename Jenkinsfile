pipeline {
  agent any

   environment {
      REGIO = "EMEA"
      BRANCH = "PROD"
      CONFIG = "TestConf/${REGION}/TestConfigs_${BRANCH}"
   }

  stages {
   stage ("clean") {
     steps {
       echo "clean"
     }
   }

   stage ("test") {
     steps {
       script {
         for (f in findFiles(glob: '${CONFIG}/*.properties')) {
	    echo """${f.name}"""	
	 }
       }
     }
   }
  }
}
