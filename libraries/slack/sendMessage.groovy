@Notify({ !context.step && config.email_on_complete == true })
def call(context){
    println "sending a slack notification at the end of the pipeline"
}
