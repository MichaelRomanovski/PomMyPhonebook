import Model.Auth_model;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.BaseScreen;
import screens.ContactListScreen;
import screens.SplashScreen;

import java.util.Random;

public class NegativeRegistration extends AppiumConfiguration {
    int i;
    @BeforeMethod
    public void beforeMethod(){
        i=new Random().nextInt(1000) +1000;





    }
@Test
    public void negativeRegistrationWrongEmail(){
    new SplashScreen(mobileDriver)
            .goAuthenticationscreen()
            .registrationNegative(
                    Auth_model.builder().email("abn" + i +"def.com").password("$Abcdef12345")
                            .build()
            ).isErrorMessageContainsTextInAlert("email");



}
@Test
    public void negativeRegistrationWrongPassword(){
    new SplashScreen(mobileDriver)
            .goAuthenticationscreen()
            .registrationNegative(
                    Auth_model.builder().email("abn" + i +"@def.com").password("Abcdef12345")
                            .build()).isErrorMessageContainsTextInAlert("password");

}


    @AfterMethod
    public void postConditions(){
        new ContactListScreen(mobileDriver).logout();
    }

}
