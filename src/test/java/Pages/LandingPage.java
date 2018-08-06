package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by imeeme on 9/30/16.
 */
public class LandingPage {


    WebDriver driver = new FirefoxDriver();

    private static WebElement element = null;



    public static WebElement Zebra(WebDriver driver){

        element = driver.findElement(By.id("line_item_quantity_zebra"));

        return element;

    }

    public static WebElement Lion(WebDriver driver){
        element = driver.findElement(By.id("line_item_quantity_lion"));

        return element;

    }

    public static WebElement Elephant(WebDriver driver){
        element = driver.findElement(By.id("line_item_quantity_elephant"));

        return element;
    }

    public static WebElement Giraffe(WebDriver driver){
        element = driver.findElement(By.id("line_item_quantity_giraffe"));

        return element;
    }

    public static Select State(WebDriver driver){
        Select dropdown = new Select (driver.findElement(By.name("state")));

        return dropdown ;

    }

    public static WebElement Checkout(WebDriver driver){
        element = driver.findElement(By.name("commit"));

        return element;
    }





























    public static WebElement Home(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/ul/li[1]/a"));
        return element;
    }

    public static WebElement Login(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/ul/li[2]/a"));
        return element;
    }

    public static WebElement Forgetpassword(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/ul/li[4]/a"));
        return element;
    }

    public static WebElement Register(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/ul/li[3]/a"));
        return element;
    }

    public static String HomeHeader(WebDriver driver){
        String Header = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/h2")).getText();
        return Header;
    }

    public static String LoginHeader(WebDriver driver){
        String login = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/h2")).getText();
        return login;
    }

    public static String RegisterHeader(WebDriver driver){
        String Header = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/h2")).getText();
        return Header;
    }


    public static String ForgetPasswordHeader(WebDriver driver){
        String Header = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/h2")).getText();
        return Header;
    }

    public static String UsernameDisplayed(WebDriver driver){
        String Success = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/pre")).getText();
        return Success;
    }

    public static boolean UsernameNotDisplayed(WebDriver driver){
        boolean user = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div")).isDisplayed();
        return user;
    }

    public static boolean loginNotEnabled(WebDriver driver){
        boolean user = driver.findElement(By.id("submit")).isEnabled();
        return user;
    }





    public static WebElement username(WebDriver driver){

        element = driver.findElement(By.id("username"));

        return element;

    }


    public static WebElement password(WebDriver driver){

        element = driver.findElement(By.id("password"));

        return element;

    }

    public static WebElement submit(WebDriver driver){

        element = driver.findElement(By.id("submit"));

        return element;

    }











}
