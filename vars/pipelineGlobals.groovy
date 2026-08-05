def getAccountID(String environment){
    switch(environment) {
      case 'dev':
          return "390663897550"
      case 'qa':
          return "390663897550"
      case 'uat':
          return "390663897550"
      case 'pre-pod':
          return "390663897550"
      case 'prod':
          return "390663897550"
      default:
          return "nothing"
    }
}
