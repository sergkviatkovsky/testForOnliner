package sampl;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCasesFindObject extends MainPage{
    @Test(groups = "findObject")
    public void findObject(){
        SampleTest sampleTest = new SampleTest();
        sampleTest.enterPage();
        sampleTest.insertCharInForm(mainfindform,dataString);
        sampleTest.chooseElementInFindForm(mainfindform);
        sampleTest.clickButtonOrLink(buttonOffers);
        sampleTest.clickAndWait(putInBasket,buttonProductInBasket);
        sampleTest.clickAndWait(buttonProductInBasket,buttonRemove);
        sampleTest.clickButtonOrLink(buttonRemove);
        String etalon = sampleTest.getDateForBrowser(elementForAssertInBasket);
        Assert.assertEquals(etalon,dataString);
        String etalonTwo = sampleTest.getDateForBrowser(elementForAssertWhenBasketEmpty);
        Assert.assertEquals(etalonTwo,stringEtalon);

    }
}
