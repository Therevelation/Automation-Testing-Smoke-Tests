package smoketests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import org.junit.Test;  //   Used a different version of Junit // import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class PageTitleJUnit {
	
	//Declare Var and Obj at CLASS level in order to access in multiple methods through out program
	
	WebDriver driver;  // Declaring this variable. Making this available through out the program
	String webURL = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
		
	@Test  //Then we are going to open the browser and run the TEST
	public void PageTitleTest()	{
		System.out.println("Running the test");
		driver.get(webURL);
		String actualTitle = driver.getTitle();
		String expectedTitle = "SDET Training | Account Management";
		
		Assert.assertEquals(expectedTitle, actualTitle);
		//Assert.fail("Intentionally failed this test"); //Good to use as print out when using if else statements
		
	}
	
	@Before  // Start with selecting the browser type.
	public void setUp() {
		System.out.println("Initializing the driver");
		driver = utilities.DriverFactory.open("Chrome"); //Initializing or assigning  the value to that variable. 
	}
	@After //Then we are going to SHUT IT DOWN.
	public void tearDown() {
		System.out.print("Closing the driver");
		driver.close();
	}
	
}