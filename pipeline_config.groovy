application_environments{
  dev{
    long_name = "Development" 
  }
}

stages{
  someStage{
    build
  }
}

libraries{
  sonarqube
  maven{
    banana = 4
    x = "option3" 
    notNeeded = true 
  }
  splunk
}
