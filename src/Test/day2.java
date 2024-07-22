package Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@Parameters({"personal"})
	@Test
	public void ploan(String personalloanURL)
	{
		System.out.println("Hi");
		System.out.println(personalloanURL);
	}
	
	@BeforeTest
	
		
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}
	
	@AfterTest
	public void postrequiste()
	{
		System.out.println("I will execute Last");
		
	}


}
