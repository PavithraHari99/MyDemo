package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"home"})
	@Test(groups ={"Smoke"})
	public void WebloginHomeLoan(String homeloanurl)
	{
		System.out.println("WEB Home");
		System.out.println(homeloanurl);
	}
	@Test(dataProvider="getData")
	public void MobileloginHomeLoan(String username, String password)
	{
		System.out.println("Mobile Home");
		System.out.println(username);
		System.out.println(password);
	}
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("API Home");
	}
	
	@AfterSuite
	public void Afsuite()
	{
		System.out.println("I am after suite");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1]="password";
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		
		return data;
	}

}
