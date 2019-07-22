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


libraries{
  scheduled_builds{
    branches = ["develop", "jenkins-scm-test"]
    cron_exp = 'H/5 * * * *'
    commit_window = 330
  }
}

