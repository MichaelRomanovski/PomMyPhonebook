package screens;

import Model.Auth_model;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Authentification extends BaseScreen {
    public Authentification(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/inputEmail']")
    MobileElement emailElement;
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/inputPassword']")
    MobileElement passwordElement;
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/regBtn']")
    MobileElement buttonRegister;
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/loginBtn']")
    MobileElement buttonLogin;
    @FindBy(xpath = "//*[@resource-id='android:id/message']")
    MobileElement errorTextView;

    @FindBy(xpath = "//*[@resource-id='android:id/button1']")
    MobileElement okButton;





    public Authentification fillEmail(String email) {
        waitElement(emailElement, 5);
        type(emailElement, email);
return this;
    }


    public Authentification fillpassword (String password) {
        waitElement(passwordElement, 10);
        type(passwordElement, password);
return this;
    }



public ContactListScreen clickOnLoginButton(){

        buttonLogin.click();
        return new ContactListScreen(driver);

}
public  ContactListScreen  RegistratonclickBtn(){


        buttonRegister.click();
        return new ContactListScreen(driver);

}

public ContactListScreen login_model(Auth_model model){
        fillEmail(model.getEmail());
        fillpassword(model.getPassword());
buttonLogin.click();
return new ContactListScreen(driver);

}
    public ContactListScreen registration(Auth_model model){
        fillEmail(model.getEmail());
        fillpassword(model.getPassword());
        buttonRegister.click();
        return new ContactListScreen(driver);
    }




    public Authentification submitRegistrationNegative(){
        buttonRegister.click();
        return this;
    }
    public Authentification isErrorMessageContainsText(String text){
        return this;
    }




    public Authentification registrationNegative(Auth_model model){
        fillEmail(model.getEmail());
        fillpassword(model.getPassword());
        submitRegistrationNegative();
        return this;
    }
    public Authentification isErrorMessageContainsTextInAlert(String text){
        Alert alert = new WebDriverWait(driver, 3)
                .until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains(text));
        alert.accept();
        return this;
    }
}