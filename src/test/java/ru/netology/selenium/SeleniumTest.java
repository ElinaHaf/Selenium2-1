package ru.netology.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderTest {

    private WebDriver driver;

    @BeforeAll
    static void setUpAll(){
        System.setProperty("WebDriver.chrome.driver","/driver/win/chromedriver.exe");
    }

    @BeforeEach
    void setUp(){
        driver = new ChromeDriver();
    }

    @AfterEach
    void TearDown(){
        driver.quit();
        driver = null;
    }

    @Test
    void shouldTestSomething() {
        driver.get("http://localhost:9999/");
        System.out.println();
        //driver.findElement().sendKeys("Аушев Василий");
        //driver.findElement().sendKeys("+79991234545");
        //driver.findElement().click();
        //driver.findElement().click();
        //String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        //String actual = driver.findElement().getText();
        //assertEquals(expected, actual);


    }


}

