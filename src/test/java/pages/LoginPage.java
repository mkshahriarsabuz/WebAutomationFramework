package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    public By loginEmail = By.xpath("//input[@data-qa='login-email']");
    public By loginPassword = By.xpath("//input[@placeholder='Password']");
    public By login_button = By.xpath("//button[normalize-space()='Login']");
    public By errorMsg = By.xpath("//input[@placeholder='Password']/following-sibling::p");
    HomePage homePage = new HomePage();

    public void navigateToLoginPage(){
        homePage.loadHomePage();
        homePage.clickOnElement(homePage.login_signup_button);
    }

    public String getErrorMessage(String error){
        if (error.equals("")){
            return "";
        }else {
            return getElement(errorMsg).getText();
        }
    }
}