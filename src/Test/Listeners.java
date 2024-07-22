package Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListeners - interface which implements testng listeers
public class Listeners implements ITestListener {
	
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("I successfully executed listeners pass code");
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("I Failed executing listeners pass code" +result.getName());
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	@Override
	public void onStart(ITestContext context)
	{
		
	}

}
