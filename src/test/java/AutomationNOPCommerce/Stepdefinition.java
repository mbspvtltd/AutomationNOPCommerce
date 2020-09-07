package AutomationNOPCommerce;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;


import java.util.concurrent.TimeUnit;

public class Stepdefinition {
    String baseUrl = "https://demo.nopcommerce.com/";
    public WebDriver driver;

    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @After
    public void closeBrowser() {
        driver.quit();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Given("^user is on the register page$")
    public void userIsOnTheRegisterPage() {
        driver.findElement(By.cssSelector(".ico-register")).click();
        //Assert.assertTrue(driver.findElement(By.cssSelector("#html-registration-page")).isDisplayed());
    }


    @And("^I select the Gender as (.+)$")
    public void selectTheGender(String gender) throws InterruptedException {
        WebElement gender1 = driver.findElement(By.cssSelector("#gender-male"));
        //WebElement genderfemale =driver.findElement(By.cssSelector("#gender-female"));
        gender1.sendKeys(gender);
        gender1.click();
        Thread.sleep(2000);
    }

    @And("^I Enter the First Name as(.+)$")
    public void enterThefirstName(String firstname) throws InterruptedException {
        driver.findElement(By.cssSelector("#FirstName")).sendKeys(firstname);
        Thread.sleep(2000);
    }

    @And("^I Enter the Last Name as (.+)$")
    public void enterTheSecondName(String lastname) throws InterruptedException {

        driver.findElement(By.id("LastName")).sendKeys(lastname);
        Thread.sleep(2000);

    }

    @And("^I Enter the Date of birth as (.+),(.+),(.+)$")
    public void iEnterTheDateofBirth(String day, String month, String Year) {
        driver.findElement(By.name("DateOfBirthDay")).sendKeys(day);
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys(month);
        driver.findElement(By.name("DateOfBirthYear")).sendKeys(Year);

    }

    @And("^I Enter the Email as (.+)$")
    public void iEnterTheEmail(String email) throws InterruptedException {
        driver.findElement(By.cssSelector("#Email")).sendKeys(email);
        Thread.sleep(3000);

    }

    @And("^I Enter the Password as (.+)$")
    public void enterpassword(String Password) throws InterruptedException {
        driver.findElement(By.cssSelector("#Password")).sendKeys(Password);
        Thread.sleep(2000);
    }

    @And("^I Confirm Password as (.+)$")
    public void enterConfirmPassword(String Password1) {
        driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys(Password1);

    }

    @And("^I click Register$")
    public void iclickregister() throws InterruptedException {
        driver.findElement(By.cssSelector("#register-button")).click();
        Thread.sleep(2000);

    }

    @And("^I click continue$")
    public void clickContinue() {
        driver.findElement(By.name("register-continue")).click();
    }

    @Then("^I am on the home page$")
    public void iOnTheHomePage() {
        Assert.assertTrue(driver.findElement(By.cssSelector(".master-wrapper-page")).isDisplayed());
        System.out.println("User is on the Home Page");
    }

    @And("^I logout$")
    public void ilogout() {
        driver.findElement(By.className("ico-logout")).click();
    }

    @Given("^User am on the homepage$")
    public void userOnTheHomepage() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.cssSelector(".master-wrapper-page")).isDisplayed());
        System.out.println("HomePage");
        Thread.sleep(2000);

    }

    @When("^I select LogIn link$")
    public void iSelectloginlink() throws InterruptedException {
        driver.findElement(By.cssSelector(".ico-login")).click();
        Thread.sleep(2000);

    }

    @Then("^I should be on the Welcome Please Sign In Page$")
    public void iShouldBeOnPleaseSignInPage() {
        Assert.assertTrue(driver.findElement(By.cssSelector(".page.login-page")).isDisplayed());
        // System.out.println("I am on the LogIn Page");
    }


    //@And("^I should see SignUp panel$")
    // public void iShouldSeeSignupPanel(){
    //    Assert.assertTrue(driver.findElement(By.cssSelector(".form-fields")).isDisplayed());

    //// And I should see SignUp panel }
    // @And("^User Enter the Email as \"([^\"]*)\"$")
    //  public void EnterTheEmail(String email) throws InterruptedException{
    //  driver.findElement(By.cssSelector("#Email")).sendKeys(email);
    //   Thread.sleep(2000);

    //  }
    // @And("^User Enter the Password as \"([^\"]*)\"$")
    // public void enterthePassword(String password) throws InterruptedException{
    //    driver.findElement(By.cssSelector("#Password")).sendKeys(password);
    //   Thread.sleep(2000);

    //  }

    @And("^i click Login$")
    public void iClickLogin() throws InterruptedException {
        driver.findElement(By.cssSelector(".button-1.login-button")).click();
        Thread.sleep(2000);

    }

    @Then("^I should see Validation message as (.+)$")
    public void validationMessage(String message) {


        String errorMessage = driver.findElement(By.cssSelector(".message-error.validation-summary-errors")).getText();
        System.out.println("Actual message : " + errorMessage);

    }

    @And("^User selects desktop from the computer section$")
    public void UserSelectsDesktop() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a']")).click();

    }

}


