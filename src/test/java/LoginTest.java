import Model.Auth_model;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.Authentification;
import screens.ContactListScreen;
import screens.SplashScreen;

import java.util.Random;

public class LoginTest extends  AppiumConfiguration{
int i;
@BeforeMethod
public void beforelogin(){

    i=new Random().nextInt(1000) +1000;


}
    @Test
    public void loginPositive() {
        Assert.assertTrue(
                new SplashScreen(mobileDriver)
                        .goAuthenticationscreen()
                        .fillEmail("michat@def.com")
                        .fillpassword("$Romanovski123454")
                        .clickOnLoginButton()
                        .isContactListActivityPresent()
        );
    }



    @Test
    public void loginModel()
    {
Assert.assertTrue(
        new SplashScreen(mobileDriver)
                .goAuthenticationscreen().login_model(
                      Auth_model.builder().email("michat@def.com").password("$Romanovski123454")
                              .build()
                ).isContactListActivityPresent());
    }

@AfterMethod
    public void postConditions(){
        new ContactListScreen(mobileDriver).logout();
}

}