package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        WebDriver driver = new ChromeDriver();
        driver.get("https://academybugs.com/find-bugs/#");

        String titleWeb = driver.getTitle();

    }

}
