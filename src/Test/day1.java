package Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	@Parameters({"personal"})
	@Test

	public void Demo(String personalloanURL)
	{
		System.out.println("Test");
		System.out.println(personalloanURL);
	}
	
	@Test(groups ={"Smoke"})
	public void SecondTest()
	{
		System.out.println("Test");
	}

}
