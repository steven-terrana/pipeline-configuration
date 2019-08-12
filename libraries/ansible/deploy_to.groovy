void call(app_env){
	println "performing a deployment through ansible to ${app_env.long_name}"
	if(config.customMessage){
		println config.customMessage
	} 
}