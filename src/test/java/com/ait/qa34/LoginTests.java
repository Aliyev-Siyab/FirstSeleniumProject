package com.ait.qa34;

import com.project.UserData;
import com.project.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnLogOutLink();
        }
    }

    @Test
    public void loginPositiveTest() {
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm(new User().setEmail(UserData.EMAIL)
                .setPassword(UserData.PASSWORD));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isLogOutLinkPresent());
    }

    @Test
    public void loginNegativeTestWithOutEmail() {
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm( new User().setPassword("Sa12345!"));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isValidationSummaryErrorsPresent());
    }

}
