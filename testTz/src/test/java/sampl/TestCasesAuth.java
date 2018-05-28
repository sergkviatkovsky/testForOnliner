package sampl;


import org.testng.annotations.Test;


public class TestCasesAuth extends EnterPage{
    @Test(groups = "auth")
    public void authorization() {
        SampleTest sampleTest = new SampleTest();
        sampleTest.enterPage();
        sampleTest.clickAndWait(buttonAuthAndEnter, buttonAccept);
        sampleTest.insertCharInForm(loginForm,login);
        sampleTest.insertCharInForm(passwordForm,password);
        sampleTest.clickButtonOrLink(buttonEnter);

    }

}
