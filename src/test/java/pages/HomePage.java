package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public String homepageUrl = "https://automationexercise.com";
    public By login_signup_button = By.xpath("//a[normalize-space()='Signup / Login']");

    public By products = By.xpath("//ul[@class='nav navbar-nav']//li//a[@href='/products']");
    public By testCases = By.xpath("//a[contains(text(),'Test Cases')]");
    public By apiTesting = By.xpath("//a[normalize-space()='API Testing']");
    public By videoTutorial = By.xpath("//a[normalize-space()='Video Tutorials']");
    public By contract = By.xpath("//a[normalize-space()='Contact us']");

    public By logout_Button = By.xpath("//*[text()=' Logout']");
    public void loadHomePage(){
        loadAWebPage(homepageUrl);
    }
}
