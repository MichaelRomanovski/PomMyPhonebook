import Model.AddContactmodel;
import Model.Auth_model;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.AddContacts;
import screens.ContactListScreen;
import screens.SplashScreen;

public class ADDnewContacts extends AppiumConfiguration{



    @BeforeMethod
    public void beforeADD() {

        new SplashScreen(mobileDriver).goAuthenticationscreen().login_model(

                Auth_model.builder()
                        .email("abc@def.com")
                        .password("$Abcdef12345")
                        .build()
        ).isContactListActivityPresent();

    }


    @Test
    public void positiveAddContacts() {
new ContactListScreen(mobileDriver).toaddContactFOrm()
        .fillcontact(
                AddContactmodel.builder()
                        .name("Petr")
                        .lastName("Pupkin")
                        .address("Moscow")
                        .phone("123123233")
                        .email("abh@def.com")
                        .description("123233333")
                        .build()

        ).btn_create_Contact();


}






}
