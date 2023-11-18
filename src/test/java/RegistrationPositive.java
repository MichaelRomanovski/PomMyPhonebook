import Model.Auth_model;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.ContactListScreen;
import screens.SplashScreen;

import java.util.Random;

public class RegistrationPositive extends AppiumConfiguration {

    int i;
    @BeforeMethod
    public void beforeMethod(){
        i=new Random().nextInt(1000) +1000;

    }
    @Test
    public void positiveRegistration(){
        Assert.assertTrue(
        new SplashScreen(mobileDriver)
                .goAuthenticationscreen()
                .fillEmail("michat" + i + "@def.com")
                .fillpassword("$Romanovski123454")
                .RegistratonclickBtn()
                .isContactListActivityPresent());


    }


  @Test
    public void positivemodelRegistration(){

        new SplashScreen(mobileDriver)
                .goAuthenticationscreen()
                .registration(
                        Auth_model.builder().email("michat" + i +"@def.com").password("$Romanovski123454")
                                .build()
                ).assertContactListActivityPresent();

    }





@AfterMethod
    public void postRegistration(){
    new ContactListScreen(mobileDriver).logout();

}


}
