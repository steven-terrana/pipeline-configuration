@AfterStep
def call(context){
  println "this should be executed after every step. ${context.step}"
}
