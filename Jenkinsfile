node{
    
    stage('SCM Checkout testcases')
    
    {
        
        git branch: 'main', url: 'https://github.com/fbsyeda/TestNG.git'
    }
    
    stage ('Testcase Execution')
    {
        bat 'mvn clean test'
    }
    
    stage('email report')
    {
        emailext attachLog: true, attachmentsPattern: 'test-output/emailable-report.html', body: 'Jenkins execution completed ', compressLog: true, subject: 'JenkinsTest1', to: 'fbsyeda@outlook.com'
    }
}
