package com.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class SampleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Text box module
        driver.get("https://demoqa.com/text-box");
        WebElement firstName = driver.findElement(By.id("userName"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstName);
        firstName.click();
        firstName.sendKeys("Sruthi");
        WebElement Email = driver.findElement(By.id("userEmail"));
        Email.click();
        Email.sendKeys("sruthi.24@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.click();
        currentAddress.sendKeys("sruthi nivas");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys("sruthi nivas");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        // checkbox module
        WebElement checkBox = driver.findElement(By.id("item-1"));
        checkBox.click();

        WebElement checkClick = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkClick);
        checkClick.click();

        // radiobutton module

        WebElement radioButton = driver.findElement(By.id("item-2"));
        radioButton.click();
        WebElement radiobtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/label"));
        radiobtn.click();

        // web tables module
        WebElement webTable = driver.findElement(By.id("item-3"));
        webTable.click();
        WebElement addBtn = driver.findElement(By.id("addNewRecordButton"));
        addBtn.click();

        WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        FirstName.click();
        FirstName.sendKeys("Sruthi ");

        WebElement LastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        LastName.click();
        LastName.sendKeys("S S");

        WebElement Emails = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
        Emails.click();
        Emails.sendKeys("sruthi.24@gmail.com");

        WebElement Age = driver.findElement(By.xpath("//*[@id=\"age\"]"));
        Age.click();
        Age.sendKeys("25");

        WebElement Salary = driver.findElement(By.xpath("//*[@id=\"salary\"]"));
        Salary.click();
        Salary.sendKeys("15000");

        WebElement Dept = driver.findElement(By.xpath("//*[@id=\"department\"]"));
        Dept.click();
        Dept.sendKeys("IT");

        WebElement submitButton1 = driver.findElement(By.id("submit"));
        submitButton1.click();

        WebElement searchBox = driver.findElement(By.id("searchBox"));
        searchBox.clear();
        searchBox.sendKeys("Sruthi");

        // Step 1: Click on the edit icon (use the parent button or svg, not path)
        WebElement editIcon = driver.findElement(By.id("edit-record-4"));
        editIcon.click();

        // Step 2: Locate the email input field that appears after clicking edit
        WebElement emailInput = driver.findElement(By.id("userEmail")); // check the real id in HTML
        emailInput.clear();
        emailInput.sendKeys("Sruthi.@gmail.com");

        WebElement saveBtn = driver.findElement(By.id("submit"));
        saveBtn.click();

        WebElement deleteIcon = driver.findElement(By.id("delete-record-4"));
        deleteIcon.click();

        // buttons module

        WebElement doubleButton = driver.findElement(By.id("item-4"));
        doubleButton.click();

        WebElement doubleclickBtn = driver.findElement(By.id("doubleClickBtn"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", doubleclickBtn);
        // Perform double click in one line
        new Actions(driver).doubleClick(doubleclickBtn).perform();

        // Verify output text
        String message = driver.findElement(By.id("doubleClickMessage")).getText();
        System.out.println("Message displayed: " + message);

        WebElement rightclickBtn = driver.findElement(By.id("rightClickBtn"));
        new Actions(driver).contextClick(rightclickBtn).perform();
        // link module
        
        WebElement linkButton = driver.findElement(By.id("item-5"));
        linkButton.click();

        WebElement linktext = driver.findElement(By.linkText("Home"));
        linktext.click();

        // Select select= new Select(dropdown);
        // // try {
        // Thread.sleep(2000); // wait for 2 seconds
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }

        // firstName.clear();
    }
}
