package baseclass;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BaseClass {

public static XSSFSheet getdata() throws IOException {

    File file = new File("./TestData/TestDataSheet.xlsx");
    FileInputStream fis = new FileInputStream(file);
    XSSFWorkbook wb=new XSSFWorkbook(fis);
    XSSFSheet Sheet = wb.getSheet("FlightFinder");
    return Sheet;

}

    public static WebDriver driver;
    public static void setup(){
        System.setProperty("webdriver.chrome.driver","C://Users//Kota.Reddy//IdeaProjects//SeleniumLaernings2//src//main//Drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    public static void teardown(){
        driver.quit();
    }

    public static void LaunchUrl(){
        driver.get("https://demo.guru99.com/test/newtours/");
    }

    public static void TakeScreenshot(String filelocation) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File img=  ts.getScreenshotAs(OutputType.FILE);
       // File filepath = new File("C://Users//Kota.Reddy//IdeaProjects//Rashmi//target//Screenshots//Screen1.png");
        File filepath = new File(filelocation);
               FileUtils.copyFile(img,filepath);
    }


}
