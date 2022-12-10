package showable.pages;

import configuration.web.WebOperations;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebOperations {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#global-user-trigger")
    private WebElement loginIcon;
    @FindBy(css = "#global-header > div.container > ul > li.user > div > div > ul.account-management > li:nth-child(7) > a")
    private WebElement loginBtn;
    @FindBy(css = "#oneid-iframe")
    private WebElement loginIframe;
    @FindBy(css = "#logo")
    private WebElement ESPNLogo;
    @FindBy(id = "InputLoginValue")
    private WebElement loginInputUserName;

    @FindBy(id = "InputPassword")
    private WebElement loginInputPassword;
    @FindBy(css = "#BtnSubmit")
    private WebElement loginFormBtn;
    @FindBy(id = "BtnCreateAccount")
    private WebElement signUpBtn;
    @FindBy(css = "#Title > span")
    private WebElement signUpTitle;
    @FindBy(id = "InputFirstName")
    private  WebElement firstNameInput;

    @FindBy(id = "InputLastName")
    private  WebElement lastNameInput;

    @FindBy(id = "InputEmail")
    private  WebElement emailInputSignUp;

    @FindBy(id = "password-new")
    private  WebElement passwordInputSignUp;

    @FindBy(id = "BtnSubmit")
    private  WebElement signUpBtnForm;

    @FindBy(id = "close")
    private  WebElement closeBtn;

    @FindBy(css = "#global-nav > ul > li.pillar.watch > a")
    private WebElement watchLink;

    @FindBy(css = "#global-header > div.container > ul > li.user.hover > div > div > ul.account-management > li.display-user > span")
    private WebElement userName;

    @FindBy(css = "#global-header > div.container > ul > li.user > div > div > ul.account-management > li:nth-child(9) > a")
    private WebElement logoutBtn;

    @FindBy(css = "#global-header > div.container > ul > li.user > div > div > ul.account-management > li:nth-child(5) > a")
    private WebElement ESPNProfile;

    @FindBy(css = "#AccountDeleteLink")
    private WebElement deleteAccountBtn;

    @FindBy(css = "#oneid-iframe")
    private WebElement accountIframe;

    @FindBy(css = "#BtnSubmit")
    private WebElement confirmationToDelete;

    @FindBy(css = "#global-header > div.container > ul > li.user > div > div > ul.account-management > li:nth-child(7) > a")
    private WebElement loginButton;

    public void hoverOnLoginIcon(){
        super.hover(loginIcon);
    }

    public void clickOnLoginBtn(){
        super.waitForVisibility(loginBtn);
        super.clickElement(loginBtn);
    }

    public boolean isloginFormDisplayed(){
        super.waitForVisibility(loginIframe);
        return loginIframe.isDisplayed();
    }

    public void switchLoginForm(){
        super.getDriver().switchTo().frame(loginIframe);
    }

    public boolean isESPNLogoDisplayed(){
        super.waitForVisibility(ESPNLogo);
        return ESPNLogo.isDisplayed();
    }

    public boolean isLoginBtnDisplayed(){
        super.waitForVisibility(loginFormBtn);
        return loginFormBtn.isDisplayed();
    }

    public void typeOnInputUsername(String username){
        typeOnInput(loginInputUserName, username);
    }

    public void typeOnInputPassword(String password){
        typeOnInput(loginInputPassword, password);
    }

    public void clickOnLoginFormBtn(){
        super.waitForClickeable(loginFormBtn);
        super.clickElement(loginFormBtn);
    }

    public boolean isSignUpBtnDisplayed(){
        super.waitForVisibility(signUpBtn);
        return signUpBtn.isDisplayed();
    }

    public void clickOnSignUpBtn(){
        super.clickElement(signUpBtn);
    }

    public boolean isSignUpTitleDisplayed(){
        super.waitForVisibility(signUpTitle);
        return signUpTitle.isDisplayed();
    }

    public boolean isFirstNameInputDisplayed(){
        super.waitForVisibility(firstNameInput);
        return firstNameInput.isDisplayed();
    }

    public boolean isLastNameInputDisplayed(){
        super.waitForVisibility(lastNameInput);
        return lastNameInput.isDisplayed();
    }

    public boolean isEmailInputDisplayed(){
        super.waitForVisibility(emailInputSignUp);
        return firstNameInput.isDisplayed();
    }

    public boolean isPasswordInputDisplayed(){
        super.waitForVisibility(passwordInputSignUp);
        return passwordInputSignUp.isDisplayed();
    }

    public boolean isCloseBtnDisplayed(){
        super.waitForVisibility(closeBtn);
        return closeBtn.isDisplayed();
    }

    public void scrollToBottom(){
        JavascriptExecutor js = (JavascriptExecutor) super.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    public boolean isSignUpButtonDisplayed(){
        super.waitForVisibility(signUpBtnForm);
        return signUpBtnForm.isDisplayed();
    }

    public void typeFirstName(String name){
        typeOnInput(firstNameInput, name);
    }

    public void typeLastName(String lastName){
        typeOnInput(lastNameInput, lastName);
    }

    public void typeEmailToSignUp(String email){
        typeOnInput(emailInputSignUp, email);
    }

    public void typePasswordToSignUp(String password){
        typeOnInput(passwordInputSignUp, password);
    }

    public void clickOnSignUp(){
        super.waitForVisibility(signUpBtnForm);
        super.clickElement(signUpBtnForm);
    }

    public boolean isLoginIconDisplayed(){
        super.waitForVisibility(loginIcon);
        return loginIcon.isDisplayed();
    }
    public void clickWatchLink(){
        super.waitForClickeable(watchLink);
        super.clickElement(watchLink);
    }

    public boolean isUserNameCorrect(){
        super.waitForVisibility(userName);
        if(userName.getText() == "Carlos!"){
            return true;
        }
        return false;
    }

    public void clickOnLogout(){
        super.waitForVisibility(logoutBtn);
        super.clickElement(logoutBtn);
    }

    public boolean isUserNameLoggedOut(){
        if(userName.getText() != "Carlos!"){
            return true;
        }
        return false;
    }

    public void clickOnESPNProfile(){
        super.waitForVisibility(ESPNProfile);
        super.clickElement(ESPNProfile);
    }

    public void switchToAccount(){
        super.getDriver().switchTo().frame(accountIframe);
    }

    public void deleteAccount(){
        super.waitForVisibility(deleteAccountBtn);
        super.clickElement(deleteAccountBtn);
    }

    public void clickOnConfirmationToDelete(){
        super.waitForVisibility(confirmationToDelete);
        super.clickElement(confirmationToDelete);
    }

    public void clickOnLoginButton(){
        super.waitForVisibility(loginButton);
        super.clickElement(loginButton);
    }
}
