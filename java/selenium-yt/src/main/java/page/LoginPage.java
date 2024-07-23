package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By loginEmail = By.id("email");
    private By passwordSenha = By.id("pass");
    private By button = By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/div[2]/form/fieldset/div[4]/div[1]/button/span");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setLogin(String email){
        driver.findElement(loginEmail).sendKeys(email);
    }

    public void setPassword(String pass){
        driver.findElement(passwordSenha).sendKeys(pass);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(button).click();
        return new SecureAreaPage(driver);
    }
}
