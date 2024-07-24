package Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void bfclass()
	{
		System.out.println("I am before class Car Loan");
	}
	
	@AfterClass
	public void afclass()
	{
		System.out.println("I am after class Car Loan");
		
	}
	@Parameters({"URL","APIKey"})
	@Test(groups ={"Smoke"})
	public void WebloginCarLoan(String urlname,String key)
	{
		System.out.println("WEB Car");
		
		System.out.println("WEB Car");
		
		System.out.println("WEB Car");
		
		System.out.println(urlname);
		System.out.println(key);
	}
	@Test(enabled=false)
	public void MobileloginCarLoan()
	{
		System.out.println("Mobile login Car");
	}
	@Parameters({"car"})
	@Test
	public void MobileSigninCarLoan(String carloanURL)
	{
		System.out.println("Mobile signin Car");
		System.out.println(carloanURL);
	}
	
	
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am before suite");
	}
	@Test
	public void MobilelogoutCarLoan()
	{
		System.out.println("Mobile Car");
	}
	@Test
	public void APICarLoan()
	{
		System.out.println("API Car");
		Assert.assertTrue(false);
	}
	
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("I am before method");
	}
	
	@AfterMethod
	public void aftereevery()
	{
		System.out.println("I am after method");
	}

}
