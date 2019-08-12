void call(app_env){
	stage("Ansible - Deployment"){
		println "performing a deployment through ansible to ${app_env.long_name}"
		if(config.customMessage){
			println config.customMessage
		}
	} 
}