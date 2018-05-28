package sampl;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class EnterPage {

    By buttonAuthAndEnter = By.xpath(".//*[@id='userbar']/div/div[1]");
    By buttonAccept = By.xpath(".//*[@id='auth-container__forms']/div/div[2]/form/div[3]/div/button");
    By loginForm = By.xpath(".//*[@id='auth-container__forms']/div/div[2]/form/div[1]/div[1]/input");
    By passwordForm = By.xpath(".//*[@id='auth-container__forms']/div/div[2]/form/div[1]/div[2]/input");
    By buttonEnter = By.xpath(".//*[@id='auth-container__forms']/div/div[2]/form/div[3]/div/button");

    String password = "12345678Ss";
    String login = "s.kviatkovsky@egartech.com";

}
