import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SampleTest {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    CheckoutPge checkoutPge;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        checkoutPge = new CheckoutPge(driver);
    }
    @Test(priority = 1)
    public void loginTest(){
        loginPage.login("standard_user", "secret_sauce");

    }


    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
