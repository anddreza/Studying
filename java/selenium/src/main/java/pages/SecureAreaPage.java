package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    private By statusAlert = By.id("flash");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        //É importante colocar aqui porque ele vai retornar alguma coisa
        return driver.findElement(statusAlert).getText();
    }
}
