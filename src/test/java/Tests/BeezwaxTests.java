package Tests;

import Domain.TestData;
import Pages.LandingPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * Created by innocentmeeme on 7/12/18.
 */
public class BeezwaxTests {

    public LandingPage landingPage;
    //public RealCheckoutPage realCheckoutPage;
    private static WebDriver driver = null;

    @Before
    public void beforeMethod() {

        //driver=new FirefoxDriver();
        //landingPage.Website();

        driver = new FirefoxDriver();
        driver.get("http://192.168.48.47:3000/");

    }

    @After
    public void AfterMethod(){
        driver.quit();
    }

    @Test
    public void URLToHomepage() throws InterruptedException {
        Thread.sleep(100);
        landingPage.Home(driver).click();
        //driver.manage().timeouts().pageLoadTimeout(100000, TimeUnit.SECONDS);
        Thread.sleep(100);
        assertEquals("Home", landingPage.HomeHeader(driver));
        Thread.sleep(100000);



    }

    @Test
    public void URLToRegister() throws InterruptedException {
        Thread.sleep(100);
        landingPage.Register(driver).click();
        //driver.manage().timeouts().pageLoadTimeout(100000, TimeUnit.SECONDS);
        Thread.sleep(100);
        assertEquals("Register", landingPage.RegisterHeader(driver));

    }

    @Test
    public void URLToLogin() throws InterruptedException {
        Thread.sleep(100);
        landingPage.Login(driver).click();
        //driver.manage().timeouts().pageLoadTimeout(100000, TimeUnit.SECONDS);
        Thread.sleep(100);
        assertEquals("Login", landingPage.LoginHeader(driver));

    }

    @Test
    public void URLToForgetPassword() throws InterruptedException {
        Thread.sleep(100);
        landingPage.Forgetpassword(driver).click();
        //driver.manage().timeouts().pageLoadTimeout(100000, TimeUnit.SECONDS);
        Thread.sleep(100);
        assertEquals("Reset Password", landingPage.ForgetPasswordHeader(driver));

    }



    @Test
    public void ValidLogin() throws InterruptedException {
        Thread.sleep(100);
        landingPage.Login(driver).click();
        //driver.manage().timeouts().pageLoadTimeout(100000, TimeUnit.SECONDS);
        Thread.sleep(100);
        assertEquals("Login", landingPage.LoginHeader(driver));
        landingPage.username(driver).sendKeys(TestData.username);
        landingPage.password(driver).sendKeys(TestData.password);
        landingPage.submit(driver).click();
        assertEquals("Username: " + TestData.username +"\nPassword: " + TestData.password,landingPage.UsernameDisplayed(driver));
        Thread.sleep(100);


    }
////*[@id="root"]/div/div/div/pre

    @Test
    public void ValidEditUsername() throws InterruptedException {
        landingPage.Login(driver).click();
        //driver.manage().timeouts().pageLoadTimeout(100000, TimeUnit.SECONDS);
        assertEquals("Login", landingPage.LoginHeader(driver));
        landingPage.username(driver).sendKeys(TestData.username);
        landingPage.password(driver).sendKeys(TestData.password);
        landingPage.submit(driver).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        assertEquals("Username: " + TestData.username +"\nPassword: " + TestData.password,landingPage.UsernameDisplayed(driver));
        landingPage.username(driver).sendKeys(TestData.InvalidState);
        assertTrue(landingPage.UsernameNotDisplayed(driver));



    }

    @Test
    public void EmptyLogin() throws InterruptedException {
        Thread.sleep(100);
        landingPage.Login(driver).click();
        //driver.manage().timeouts().pageLoadTimeout(100000, TimeUnit.SECONDS);
        Thread.sleep(100);
        assertEquals("Login", landingPage.LoginHeader(driver));
        assertFalse(landingPage.loginNotEnabled(driver));


    }


}
