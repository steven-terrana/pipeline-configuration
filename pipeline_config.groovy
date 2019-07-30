application_environments{
  dev{
    long_name = "Development" 
  }
}

stages{
  merge = true 
  someStage{
    build
  }
}

libraries{
  maven
}

