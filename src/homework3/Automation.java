package homework3;

import homework1.BaseClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Automation extends BaseClass {
    @Before
    public void start() {
        String baseUrl = "http://automationpractice.com/index.php";
        openBrowser(baseUrl);
       /* driver.findElement(By.xpath("//div[contains(text(),'I agree')]")).click();
        WebElement one = driver.findElement(By.xpath("//input[@name='q']"));
        one.sendKeys("demo nopCommerce store", Keys.ENTER);*/
       driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();//click signin
    }
    @Test
    public void signIN() {
       driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@yahoo.com");
       driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("fcr");//wrong passwd
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
        String expectedMessage = "There is 1 error";//display error message
        WebElement message = driver.findElement(By.xpath("//p[contains(text(),'There is 1 error')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("There is 1 error", expectedMessage, actualMessage);
    }
}