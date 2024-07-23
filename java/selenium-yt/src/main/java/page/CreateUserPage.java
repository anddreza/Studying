package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateUserPage {
    private WebDriver driver;
    private By firstName = By.id("firstname");
    private By lastName = By.id("lastname");
    private By emailName = By.id("email_address");
    private By passwordName = By.xpath("//*[@id=\"password\"]");
    private By confirmPasswordName = By.name("password_confirmation");

    private By clickButton = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button");

    public CreateUserPage(WebDriver driver){
        this.driver = driver;
    }

    public void setNameUser(String firstname){
        driver.findElement(firstName).sendKeys(firstname);
    }

    public void setlastUser(String lastname){
        driver.findElement(lastName).sendKeys(lastname);
    }

    public void setEmailUser(String email_address){
        driver.findElement(emailName).sendKeys(email_address);
    }

    public void setPasswordUser(String password){
        driver.findElement(passwordName).sendKeys(password);
    }

    public void setconfirmPasswordUser(String password_confirmation){
        driver.findElement(confirmPasswordName).sendKeys(password_confirmation);
    }

    public SecureAreaPage clickButton(){
        driver.findElement(clickButton).click();
        return new SecureAreaPage(driver);
    }

}
