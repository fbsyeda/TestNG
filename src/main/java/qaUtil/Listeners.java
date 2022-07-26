//package qaUtil;
//
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//import org.testng.Reporter;
//
//public class Listeners  extends TestBase implements ITestListener {
//    @Override
//    public void onTestStart(ITestResult result) {
//        Reporter.log("Method name is -" + result.getName());
//        System.out.println("Test Starting");
//
//        }
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult result) {
//        //get the passed test case name from TestBase.test for the message
//       Reporter.log("Status of execution is "+ result.getStatus());
//
//    }
//
//    @Override
//    public void onTestFailure(ITestResult arg0) {
//        // for hyperlinks in testng reports
//        System.setProperty("org.uncommons.reportng.escape-output","false");
//        TestUtil.captureScreenshot();
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        //on failure log the failure to extent, then pass on the throwed exception
//        test.log(LogStatus.FAIL, arg0.getName().toUpperCase()+" Failed with exception : " + arg0.getThrowable());
//        test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotName));
//        rep.endTest(test);
//        rep.flush();
//
//        //Show image link & image
//        Reporter.log("Capturing Screenshot");
//        Reporter.log("<a target=\"_blank\" href=\"" + TestUtil.screenshotName +"\">Screenshot</a><br/>");
//        Reporter.log("<a href=\""+TestUtil.screenshotName+"\"><img height=\"50%\" width=\"50%\" src=\""+TestUtil.screenshotName +"\"/></a>");
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult arg0) {
//        test.log(LogStatus.SKIP, arg0.getName().toUpperCase() + " : Skipped the test as the Runmode is N");
//        rep.endTest(test);
//        rep.flush();
//    }
//
//    @Override
//    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//        // TODO Auto-generated method stub
//
//    }
//
//    @Override
//    public void onStart(ITestContext context) {
//        // TODO Auto-generated method stub
//
//    }
//
//    @Override
//    public void onFinish(ITestContext context) {
//        // TODO Auto-generated method stub
//
//    }
//
//
//}
//}
