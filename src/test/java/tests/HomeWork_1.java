package tests;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HomeWork_1 {

    @Test
    public void test() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://blazedemo.com/index.php");

        Thread.sleep(2000);

        WebElement button = driver.findElement(By.xpath("//input[@value='Find Flights']"));
        button.click();

        Thread.sleep(2000);

        WebElement title = driver.findElement(By.xpath("//title[text()='BlazeDemo - reserve']"));
        String text1 = "BlazeDemo - reserve";
        System.out.println(title.getText());
//      assertTrue(title.getText() == text1);

        Thread.sleep(2000);
        driver.quit();
    }
}
