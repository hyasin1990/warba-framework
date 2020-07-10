package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import steps.Hooks;
import util.GeneralUtil;


import java.io.IOException;

import static steps.Hooks.scenarioName;


public class Listeners implements ITestListener{
    public static String updatedScenarioName;
    GeneralUtil generalutil = new GeneralUtil();
    Hooks hooks = new Hooks();
    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub


    }

    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub


        //String s= result.getName();
       // String s=result.getTestContext().getName(); // Hassala test

        try {
            generalutil.getScreenshot(scenarioName);
            updatedScenarioName=scenarioName;

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub

    }



}
