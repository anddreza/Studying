package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Sign In");
    private By formCreateLink = By.linkText("Create an Account");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //retornar aqui a LoginPage
    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public CreateUserPage clickFormCreateLink(){
        driver.findElement(formCreateLink).click();
        return new CreateUserPage(driver);
    }


}
