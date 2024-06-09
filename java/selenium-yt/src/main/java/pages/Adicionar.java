package pages;

import java.time.Duration;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Adicionar {

    WebDriver driver;

    @BeforeEach
        public void start(){
        driver = new ChromeDriver();
    }

    @Test
    public void verificar(){
       // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.get("https://academybugs.com/find-bugs/#");

        String title = driver.getTitle();
        assertEquals("Find Bugs – AcademyBugs.com", title);

        WebDriver add = driver.findElement(By.class(".ec_product_addtocart"));
        WebDriver submit = driver.findElement(By.id("#"));
    }

}
