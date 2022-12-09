package stepDefinitions.web;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import showable.pages.HomePage;
import showable.pages.WatchPage;

public class WebStep {

    private String name = "Carlos";
    private String lastName = "Ferro";
    private String emailRegister = "tyra@gmail.com";
    private String passwordRegister = "holiwis23";
    private String emailLogin = "carlo.e@gmail.com";
    private String passwordLogin = "holiwis23";
    private HomePage home = new HomePage(WebHook.getDriver());

    private WatchPage watch = new WatchPage(WebHook.getDriver());
    //Sign Up
    @Given("the user click to login")
    public void the_user_click_to_login() {
        home.hoverOnLoginIcon();
        home.clickOnLoginBtn();
    }
    @Given("the user click on Sign Up")
    public void the_user_click_on_Sign_Up() {
        home.isloginFormDisplayed();
        home.switchLoginForm();
        home.isESPNLogoDisplayed();
        home.isLoginBtnDisplayed();
        home.isSignUpBtnDisplayed();
        home.clickOnSignUpBtn();
    }
    @When("the user enter valid credential")
    public void the_user_enter_valid_credential() {
        home.isSignUpTitleDisplayed();
        home.isFirstNameInputDisplayed();
        home.isLastNameInputDisplayed();
        home.isEmailInputDisplayed();
        home.isPasswordInputDisplayed();
        home.isCloseBtnDisplayed();
        home.scrollToBottom();
        home.isSignUpButtonDisplayed();
        home.typeFirstName(name);
        home.typeLastName(lastName);
        home.typeEmailToSignUp(emailRegister);
        home.typePasswordToSignUp(passwordRegister);
        home.scrollToBottom();
        home.clickOnSignUp();
    }
    @Then("a homepage should be shown")
    public void a_homepage_should_be_shown() {
        home.isLoginIconDisplayed();
    }

    //Watch Page
    @Given("the user click on Watch")
    public void the_user_click_on_watch() {
        home.hoverOnLoginIcon();
        home.clickOnLoginBtn();
        home.isloginFormDisplayed();
        home.switchLoginForm();
        home.typeOnInputUsername(emailLogin);
        home.typeOnInputPassword(passwordLogin);
        home.isLoginBtnDisplayed();
        home.clickOnLoginFormBtn();
        home.clickWatchLink();
        watch.isACarouselDisplayed();
    }
    @When("the user click on the second card of the carousel")
    public void the_user_click_on_the_second_card_of_the_carousel() {
        watch.clickOnCard();
    }
    @Then("a window should be opened")
    public void a_window_should_be_opened() {
        watch.isXBtnDisplayed();
        watch.clickOnXBtn();
    }

    //Log out
    @Given("the user click back to Landing Page")
    public void the_user_click_back_to_landing_page() {
        home.hoverOnLoginIcon();
        home.clickOnLoginBtn();
        home.isloginFormDisplayed();
        home.switchLoginForm();
        home.typeOnInputUsername(emailLogin);
        home.typeOnInputPassword(passwordLogin);
        home.isLoginBtnDisplayed();
        home.clickOnLoginFormBtn();
        home.clickWatchLink();
        watch.clickOnLandingPage();
    }
    @When("the user click on log out")
    public void the_user_click_on_log_out() {
        home.hoverOnLoginIcon();
        home.isUserNameCorrect();
        home.clickOnLogout();
    }
    @Then("the account should be closed")
    public void the_account_should_be_closed() {
        home.hoverOnLoginIcon();
        home.isUserNameLoggedOut();
    }
}
