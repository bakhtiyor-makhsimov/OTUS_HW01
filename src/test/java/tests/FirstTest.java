package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstTest {
    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://yandex.ru");
        Thread.sleep(2000);

        WebElement enterToEmail = driver.findElement(By.cssSelector("div[role='form'] > a.button"));
        enterToEmail.click();
        Thread.sleep(2000);

        WebElement inputLogin = driver.findElement(By.name("login"));
        inputLogin.sendKeys("invalid@gmail.com");

        WebElement inputPassword = driver.findElement(By.name("passwd"));
        inputPassword.sendKeys("secretpassword");

        WebElement buttonSubmit = driver.findElement(By.cssSelector("button[type='submit']"));
        buttonSubmit.click();
        Thread.sleep(2000);

        WebElement errorMessage = driver.findElement(By.cssSelector("div.passport-Domik-Form-Error"));
        assertTrue(errorMessage.isDisplayed());

        driver.quit();
    }
}
