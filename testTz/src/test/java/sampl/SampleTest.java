package sampl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SampleTest extends WebDriverSetting{


    public void enterPage(){
        setUp();
        String s = "http://www.onliner.by";//
        driver.manage().window().maximize();
        driver.get(s);
    }
    public void clickAndWait(By s,By a){
        driver.findElement(s).click();
        WebElement dynamicElement = (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(a));

    }

    public void insertCharInForm(By element,String stringWhenWeEnter){
        driver.findElement(element).sendKeys(stringWhenWeEnter);
    }

    public void clickButtonOrLink(By button){
        driver.findElement(button).click();
    }

    public void chooseElementInFindForm(By findform){
        driver.findElement(findform).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public String getDateForBrowser(By element){
        driver.findElement(element).getText();
        return null;
    }

}
