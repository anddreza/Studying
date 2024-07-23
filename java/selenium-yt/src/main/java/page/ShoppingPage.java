package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingPage {
    private WebDriver driver;
    private By clickButtonShop = By.className("action more button");
    private By styleOption = By.className("filter-options-item allow active");

    public ShoppingPage(WebDriver driver){
        this.driver = driver;
    }

    public void setStyleOption(String styleOption){

    }


}
