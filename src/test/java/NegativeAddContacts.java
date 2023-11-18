import Model.AddContactmodel;
import Model.Auth_model;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.Authentification;
import screens.ContactListScreen;

public class NegativeAddContacts extends AppiumConfiguration{

    @BeforeMethod
    public void loginBeforeADDcontcats(){
        new Authentification(mobileDriver).login_model(
                Auth_model.builder().email("michat@def.com")
                        .password("$Romanovski123454")
                        .build()

        ).assertContactListActivityPresent();



    }


   @Test
   public void testNegativeAddContacts(){
       new ContactListScreen(mobileDriver).toaddContactFOrm()
               .fillcontact(
                       AddContactmodel.builder()
                               .name("Petr")
                               .lastName("Pupkin")
                               .address("Moscow")
                               .phone("123123233")
                               .email("abhdef.com")
                               .description("123233333")
                               .build()
               ).negative_btn_create_contact().Errormessage_afterADDcontact().acceptAllert();

   }





}
