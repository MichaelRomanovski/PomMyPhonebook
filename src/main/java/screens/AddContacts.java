package screens;

import Model.AddContactmodel;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class AddContacts extends BaseScreen{
    public AddContacts(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[id='com.sheygam.contactapp:id/inputName']")
    MobileElement nameEditText;
    @FindBy(xpath = "//*[id='com.sheygam.contactapp:id/inputLastName']")
    MobileElement lastNameEditText;
    @FindBy(xpath = "//*[id='com.sheygam.contactapp:id/inputEmail']")
    MobileElement emailEditText;
    @FindBy(xpath = "//*[id='com.sheygam.contactapp:id/inputPhone']")
    MobileElement phoneEditText;
    @FindBy(xpath = "//*[id='com.sheygam.contactapp:id/inputAddress']")
    MobileElement addressEditText;
    @FindBy(xpath = "//*[id='com.sheygam.contactapp:id/inputDesc']")
    MobileElement descriptionEditText;
    @FindBy(xpath = "//*[id='com.sheygam.contactapp:id/createBtn']")
    MobileElement createButton;
    @FindBy(xpath = "//*[id='\tandroid:id/message']")
    MobileElement uncorrect_email_in_addcontact;

    public AddContacts fillcontact(AddContactmodel add) {
        waitElement(nameEditText,15);
        type(nameEditText, add.getName());
        type(lastNameEditText, add.getLastName());
        type(emailEditText, add.getEmail());
        type(phoneEditText,add.getPhone());
        type(addressEditText, add.getAddress());
        type(descriptionEditText, add.getDescription());
        return this;
    }
    public AddContacts Errormessage_afterADDcontact(){
        waitElement(uncorrect_email_in_addcontact,10);
        shouldHave(uncorrect_email_in_addcontact,"Error",10);
        return this;
    }

public AddContacts negative_btn_create_contact(){

        createButton.click();

        return this;
}


    public ContactListScreen btn_create_Contact(){
        createButton.click();
        return new ContactListScreen(driver);



    }









}
