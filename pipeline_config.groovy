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

application_environments{
  dev{
    short_name = "dev"
    long_name = "Develop"
    openshift_url = "https://master.ocpa.grants-itts.net:8443"
    tiller_credential = "grants-tiller"
  }
  stg{
    short_name = "stage"
    long_name = "Staging"
    openshift_url = "https://master.stage.grants-itts.net:8443"
    tiller_credential = "grants-tiller-staging"
  }
  test2{
    short_name = "test2"
    long_name = "Testing2"
    openshift_url = "https://master.ocpa.grants-itts.net:8443"
    tiller_credential = "grants-tiller"
  }
  test{
    short_name = "test"
    long_name = "Testing"
    openshift_url = "https://master.ocpa.grants-itts.net:8443"
    tiller_credential = "grants-tiller"
  }
  eph{
    short_name = "eph"
    long_name = "Ephemeral"
    openshift_url = "https://master.ocpa.grants-itts.net:8443"
    tiller_credential = "grants-tiller"
  }
  eph_infra{
    short_name = "eph-infra"
    long_name = "Ephemeral Infrastructure"
    openshift_url = "https://master.ocpa.grants-itts.net:8443"
    tiller_credential = "grants-tiller"
  }
}
keywords{
  master = /^[Mm]aster$/
  develop = /^[Dd]evelop$/
  staging = /^[Ss]taging$/
  testing = /^[Tt]esting$/
}
libraries{
  github_enterprise
  sonarqube
  docker{
    merge = true
    registry = "docker-registry.default.svc:5000"
    repo_path_prefix = "grants-images"
    cred = "openshift-docker-registry"
  }
  slack
  openshift{
    merge = true
    image_repository_project = "grants-images"
    tiller_namespace = "grants-tiller"
    helm_configuration_repository = "https://github.boozallencsn.com/Grants/helm-configuration-repository.git"
    helm_configuration_repository_credential = "github-enterprise"
  }
  sdp{
    images{
      registry = "https://docker-registry.default.svc:5000"
      cred = "openshift-docker-registry"
    }
  }
// Using config per app
//
//  openshift{
//    merge = true
//    url = "https://master.ocpa.grants-itts.net:8443"
//    tiller_namespace = "grants-tiller"
//    tiller_credential = "grants-tiller"
//    helm_configuration_repository = "https://github.boozallencsn.com/Grants/helm-configuration-repository.git"
//    helm_configuration_repository_credential = "github"
//    image_repository_project = "grants-images"
//  }
  owasp_zap{
    merge = true
  }
  a11y{
    merge = true
  }
  scheduled_builds{
    branches = ['develop', 'jenkins-scm-test']
    cron_exp = 'H/5 * * * *'
    commit_window = 330
  }
}
template_methods{
    unit_test
    static_code_analysis
    build
    scan_container_image
    penetration_test
    accessibility_compliance_test
    performance_test
    functional_test
    static_dependency_check_analysis
    scheduled_builds
}
