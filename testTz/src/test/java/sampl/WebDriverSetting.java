package sampl;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSetting {
    public ChromeDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void closedBrowser(){
        System.out.println("Browser close");
        driver.quit();
    }



}
