@AfterStep({ context.step in config.afterSteps })
def call(context){
    println "sending a slack notification at the end of the pipeline"
}
