package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTests {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://book.theautomatedtester.co.uk/");
        Thread.sleep(2000);

        WebElement firstLink = driver.findElement(By.xpath("//a[text()='Chapter1']"));
        firstLink.click();
        Thread.sleep(2000);

        WebElement radioButton = driver.findElement(By.id("radiobutton"));
        radioButton.click();
        driver.quit();

    }
    @Test
    public void test2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://book.theautomatedtester.co.uk/");
        Thread.sleep(2000);

        WebElement firstLink = driver.findElement(By.xpath("//a[text()='Chapter1']"));
        firstLink.click();
        Thread.sleep(2000);

        WebElement homePageLink = driver.findElement(By.xpath("//a[text()='Home Page']"));
        homePageLink.click();
        driver.quit();
    }
}
