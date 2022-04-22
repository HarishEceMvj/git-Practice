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

prepareVSASANDeployCCStage("vg_smoke_san").call()
