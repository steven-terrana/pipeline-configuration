@AfterStep({ throw new Exception("whatever") })
void call(context){
    println "sending a slack notification after the ${context.step} step"
}
