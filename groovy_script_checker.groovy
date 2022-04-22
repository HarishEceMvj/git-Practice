pipeline {
    agent any
    stages {
        stage ('groovy_script_checker') {
        try {
            prepareVSASANDeployCCStage("vg_smoke_san").call()
   
        } catch (e) {
            // If there was an exception thrown, the build failed
            currentBuild.result = "FAILED"
            throw e
        } finally {
            // Success or failure, always send notifications
			}
		}
	}
}
	def prepareVSASANDeployCCStage(testSetName) {
  sh('''
          case "${testSetName}" in
             "vsa_smoke_san") echo "./deploy_vsa -d $VTRIDENT_DEPLOY -m block -p ${VSA_PASSWORD} ${VSA_SAN_APPLIANCE_NAMES} VSA"
                ;;
             "vg_smoke_san") echo "./deploy_vsa -d $VTRIDENT_DEPLOY -m block -p ${VSA_PASSWORD} ${VG_APPLIANCE_NAMES} VGA"
                ;;
          esac
        sleep 900
  ''')
  }

