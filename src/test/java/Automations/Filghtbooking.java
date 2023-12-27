package Automations;

import io.cucumber.java.eo.Se;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Filghtbooking {
    public static void main(String[] args) throws IOException {

       File file = new File("./TestData/TestDataSheet.xlsx");
       FileInputStream fis = new FileInputStream(file);
       XSSFWorkbook wb=new XSSFWorkbook(fis);
       XSSFSheet Sheet = wb.getSheet("FlightFinder");
       String Passengercount =  Sheet.getRow(1).getCell(0).getStringCellValue();
       String FromPort =Sheet.getRow(1).getCell(1).getStringCellValue();
        String month = Sheet.getRow(1).getCell(2).getStringCellValue();
        String day = Sheet.getRow(1).getCell(3).getStringCellValue();
        String to = Sheet.getRow(1).getCell(4).getStringCellValue();
        String Month = Sheet.getRow(1).getCell(5).getStringCellValue();
        String Day = Sheet.getRow(1).getCell(6).getStringCellValue();
        String Airlinename = Sheet.getRow(1).getCell(7).getStringCellValue();


       System.out.println(Passengercount);
       System.out.println(FromPort);
        System.out.println(month);
        System.out.println(day);
        System.out.println(to);
        System.out.println(Month);
        System.out.println(Day);
        System.out.println(Airlinename);



//        System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\Kota.Reddy\\Drivers\\Chromedriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.guru99.com/test/newtours/");
//        driver.findElement(By.xpath("//tr[@class='mouseOut'][2]/td[2]/a")).click();
//        driver.switchTo().frame("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
//        driver.findElement(By.id("dismiss-button")).click();
//        driver.switchTo().defaultContent();
//        Select passengers = new Select(driver.findElement(By.name("passCount")));
//        passengers.selectByVisibleText(Passengercount);
//        Select fromport = new Select(driver.findElement(By.name("fromPort")));
//        fromport.selectByValue(FromPort);
//        Select fromMonth = new Select(driver.findElement(By.name("fromMonth")));
//        fromMonth.selectByVisibleText("April");
//        Select fromDay = new Select(driver.findElement(By.name("fromDay")));
//        fromDay.selectByValue("20");
//        Select toPort = new Select(driver.findElement(By.name("toPort")));
//        toPort.selectByValue("Paris");
//        Select toMonth = new Select(driver.findElement(By.name("toMonth")));
//        toMonth.selectByVisibleText("April");
//        Select toDay = new Select(driver.findElement(By.name("toDay")));
//        toDay.selectByValue("22");
//        driver.findElement(By.xpath("//input[@value='Business']")).click();
//        Select airline = new Select(driver.findElement(By.name("airline")));
//        airline.selectByVisibleText("Unified Airlines");
//        driver.findElement(By.name("findFlights")).click();

    }

}
