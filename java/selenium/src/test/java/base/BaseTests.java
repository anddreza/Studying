package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    private EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOption()));
        driver.register(new EventReporter());
        //   driver.manage().timeouts().pageLoadTimeout(5);
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goHome();
        setCookie();
        // driver.manage().window().setSize(new Dimension(375, 812)); //this is for Iphone

          //driver.findElements(By.tagName("a"));
        //   List<WebElement> links = driver.findElements(By.tagName("a"));
        //   System.out.println(links.size());

        //This method here we call interact with everyone USE Inputs
        //   WebElement inputsLink = driver.findElement(By.linkText("Input"));
        //   inputsLink.click();

        homePage = new HomePage(driver);

        //driver.quit();
        System.out.println(driver.getTitle());

    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()){
            var camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOption(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        //options.setHeadless(true);
        return options;

    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau", "123")
                .domain("https://the-internet.herokuapp.com/")
                .build();

        driver.manage().addCookie(cookie);
    }
}
