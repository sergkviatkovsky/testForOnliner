package sampl;

import org.openqa.selenium.By;

public class MainPage {

    By mainfindform = By.xpath(".//*[@id='fast-search']/form/input[1]");
    By buttonOffers = By.xpath(".//*[@id='container']/div/div[2]/div/div/div[2]/div[1]/main/aside/div[2]/div[1]/a");
    By putInBasket = By.xpath(".//tbody/tr[2]/td/a[starts-with(@class, 'button button_orange')]");
    By buttonProductInBasket = By.xpath(".//a[@class='b-top-navigation-cart__link']/span[contains(text(),'товар')]");
    By buttonRemove = By.xpath(".//a[@class='cart-product__remove']");
    By elementForAssertInBasket = By.xpath(".//div[@class='cart-product-title__link cart-product-title__link_name']/span");
    By elementForAssertWhenBasketEmpty = By.xpath(".//p[starts-with(text(),'Ваша корзина пуста')]");

    String dataString = "Apple iPhone 8 64GB (серый космос) ";
    String stringEtalon = "Ваша корзина пуста.Перейдите в каталог и добавьте товары.";
}
