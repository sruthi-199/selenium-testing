package com.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bridge-global.com/");
        

        // Find the search box
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"scroller-anchor\"]/div/div/div/nav/a[1]/div"));
        searchBox.click();
        WebElement startYourAIJourney = driver.findElement(By.xpath("//*[@id=\"ai-advantage\"]/section[1]/section/section[1]/div[2]/div[2]/div[2]/button/span"));
        startYourAIJourney.click();
        //searchBox.submit();
((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", startYourAIJourney); startYourAIJourney.click();
        // Print the title after search
        System.out.println("Title after search: " + driver.getTitle());

        // driver.quit();
    }
}
