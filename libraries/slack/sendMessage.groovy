@AfterStep({context.step in ["deploy_to"]})
void call(context){
    println "sending a slack notification after the ${context.step} step"
}
