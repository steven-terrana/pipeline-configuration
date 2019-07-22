/*application_environments{
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
  maven
}
*/


branches = ["develop", "jenkins-scm-test"]
libraries{
  scheduled_builds{
    
    cron_exp = 'H/5 * * * *'
    commit_window = 330
  }
}

