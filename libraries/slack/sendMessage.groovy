@AfterStep
def call(context){
    println "sending a slack notification after the ${context.step} step"
}
