package Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	@Parameters({"personal"})
	@Test

	public void Demo(String personalloanURL)
	{
		System.out.println("Test1");
		System.out.println("Test2");
		System.out.println("Test3");
		System.out.println("Test4");
		System.out.println("Test5");
		System.out.println("Test6");
		System.out.println("Test7");
		System.out.println(personalloanURL);
	}
	
	
	@Test(groups ={"Smoke"})
	public void SecondTest()
	{
		System.out.println("Test");
	}

}
