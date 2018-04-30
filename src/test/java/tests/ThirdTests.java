package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
//import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertEquals;
//import static org.testng.AssertJUnit.assertTrue;

@Listeners(TestListener.class)
public class ThirdTests {

    WebDriver driver;

    @BeforeClass
    public void beforeClass(){

        driver = new ChromeDriver();
    }

    @Test(enabled=true, groups = {"regression"}, dependsOnMethods = {"test2"})
    public void test1() throws InterruptedException {
//        driver = new ChromeDriver();
        driver.get("http://book.theautomatedtester.co.uk/");
        Thread.sleep(2000);

        WebElement firstLink = driver.findElement(By.xpath("//a[text()='Chapter1']"));
        firstLink.click();
        Thread.sleep(2000);

        WebElement radioButton = driver.findElement(By.id("radiobutton"));
        radioButton.click();

        Assert.assertTrue(radioButton.isDisplayed(), "Error Message");

//        driver.quit();

        /*
        check following website for more TestNG Assert functions:
        http://static.javadoc.io/org.testng/testng/6.11/org/testng/Assert.html
         */

    }
    @Test(enabled=true, groups = {"sanity", "regression"}) //dataProvider = "data_provider"
    public void test2() throws InterruptedException {
//        driver = new ChromeDriver();
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

        assertEquals("Chapter1", chapterLinkText, "Errpr Message");

//        driver.quit();

    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }

//    @DataProvider(name = "data_provider")
//    public Object[][] dataProvider(){
//        return new Object[][]{{"1","2"},{"2","3"}};
//    }
}
