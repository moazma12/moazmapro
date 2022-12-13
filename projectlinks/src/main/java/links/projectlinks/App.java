package links.projectlinks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
public static WebDriver driver;

    public static void main( String[] args ) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\moazm\\eclipse-workspace\\project1\\folder1\\chromedriver.exe");
	driver=new ChromeDriver();  // opening browser	
	driver.get("https://www.facebook.com"); // navigating to website		

driver.manage().window().maximize();
Thread.sleep(5000);


        System.out.println( "Hello World!" );
    }
}
