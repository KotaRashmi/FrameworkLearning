package Automations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class login {
    public static void main(String[] args) {
        System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\Kota.Reddy\\Drivers\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.findElement(By.name("userName")).sendKeys("kota");
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.xpath("//h3")).getText();


    }

}
