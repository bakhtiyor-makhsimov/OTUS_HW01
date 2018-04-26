package tests;


import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SecondTests {
    WebDriver driver;

    @BeforeClass
    public static void beforeClass(){
        //before class
    }

    @Before
    public void beforeTest(){
        //before
    }

    @Test
    public void test1() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://book.theautomatedtester.co.uk/");
        Thread.sleep(2000);

        WebElement firstLink = driver.findElement(By.xpath("//a[text()='Chapter1']"));
        firstLink.click();
        Thread.sleep(2000);

        WebElement radioButton = driver.findElement(By.id("radiobutton"));
        radioButton.click();

        assertTrue("Error Message", radioButton.isDisplayed());

        /*
        check following website for more Assert functions:
        http://junit.sourceforge.net/javadoc/org/junit/Assert.html
         */

    }
    @Test
    public void test2() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://book.theautomatedtester.co.uk/");
        Thread.sleep(2000);

        WebElement firstLink = driver.findElement(By.xpath("//a[text()='Chapter1']"));
        firstLink.click();
        Thread.sleep(2000);

        WebElement homePageLink = driver.findElement(By.xpath("//a[text()='Home Page']"));
        homePageLink.click();
        Thread.sleep(2000);

        WebElement chapterLink = driver.findElement(By.linkText("Chapter1"));
        String chapterLinkText = chapterLink.getText();
        assertEquals("Error Message", chapterLinkText, "Chapter 1");


    }

    @After
    public void afterTest(){
        driver.quit();
    }

    @AfterClass
    public static void afterClass(){


    }

}
