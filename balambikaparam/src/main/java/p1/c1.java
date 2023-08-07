package p1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//project
//added dependency
// pckag=> clas=s> test case=> test suite
// added code
// test data=> parameters
// parameters
// last step: providing value

public class c1 {
	@Parameters({"U","V"})   // U=us   V=pw
	
	@Test
	public void t1(String us,String pw) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	    //classname objectnmae= new classname();
			ChromeDriver ob= new ChromeDriver();
	     ob.get("http://www.mycontactform.com");
	     
	     //id=user
	     ob.findElementById("user").sendKeys(us);
	     
	     //name=pass
	     ob.findElementByName("pass").sendKeys(pw);
	     
	     //classname= btn_log
	     ob.findElementByClassName("btn_log").click();
	     Thread.sleep(3000);
	     ob.quit();
	}

}
