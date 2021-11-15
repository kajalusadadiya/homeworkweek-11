package homework2;

import homework1.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class NopCommerce extends BaseClass {
    @Before
    public void start() {
        String baseUrl = "https://demo.nopcommerce.com/";
        openBrowser(baseUrl);
       /* driver.findElement(By.xpath("//div[contains(text(),'I agree')]")).click();
        WebElement one = driver.findElement(By.xpath("//input[@name='q']"));
        one.sendKeys("demo nopCommerce store", Keys.ENTER);*/
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
    }

    @Test
    public void Register() {
        driver.findElement(By.xpath("//input[@id='gender-male' or @id='gender-female']")).click();
        driver.findElement((By.xpath("//input[@id='FirstName']"))).sendKeys("kajal");
        driver.findElement((By.xpath("//input[@id='LastName']"))).sendKeys("Patel");
        driver.findElement((By.xpath("//select[@name='DateOfBirthDay']"))).sendKeys("16");
        driver.findElement((By.xpath("//select[@name='DateOfBirthMonth']"))).sendKeys("April");
        driver.findElement((By.xpath("//select[@name='DateOfBirthYear']"))).sendKeys("1990");
        driver.findElement((By.xpath("//input[@name='Email']"))).sendKeys("kajal@gmail.com");
        driver.findElement((By.xpath("//input[@id='Company']"))).sendKeys("JIRA");
        driver.findElement((By.xpath("//input[@id='Newsletter']"))).click();
        driver.findElement((By.xpath("//input[@id='Password']"))).sendKeys("admin123");
        driver.findElement((By.xpath("//input[@id='ConfirmPassword']"))).sendKeys("admin123");
        driver.findElement((By.xpath("//button[@id='register-button']"))).click();
    }

    @After
    public void finished() {
    }
}

