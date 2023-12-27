package PageObjects;

import baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class Filighbookingpage extends BaseClass {
    public static String flightpagelink = "//tr[@class='mouseOut'][2]/td[2]/a";
    public static String iframe ="google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0";
    public static String CloseAD ="dismiss-button";
    public static String passCount = "passCount";
    public static String fromPort = "fromPort";
    public static String Fmonth ="fromMonth";
    public static String FDay ="fromDay";
    public static String ToPort="toPort";
    public static String Returnmonth = "toMonth";
    public static String Returnday = "toDay";
    public static String BussinessClass = "//input[@value='Business']";
    public static String Airline = "airline";
    public static String FindFlights ="findFlights";


    public static void LaunchFlightfinderpage(){

        driver.findElement(By.xpath(flightpagelink)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame(iframe);
        driver.findElement(By.id(CloseAD)).click();
        driver.switchTo().defaultContent();

    }
    public static void SelectNumberofPassengers() throws IOException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Select passengers = new Select(driver.findElement(By.name(passCount)));
        String Passengercountvalue = getdata().getRow(1).getCell(0).getStringCellValue();
        passengers.selectByValue(Passengercountvalue);
    }
    public static void SelectFromlocation() throws IOException {
        Select fromport = new Select(driver.findElement(By.name(fromPort)));
        String From = getdata().getRow(1).getCell(1).getStringCellValue();
        fromport.selectByValue(From);
    }

    public static void SelecteToDate() throws IOException {
        Select fromMonth = new Select(driver.findElement(By.name(Fmonth)));
        String month = getdata().getRow(1).getCell(2).getStringCellValue();
        fromMonth.selectByVisibleText(month);
        Select fromDay = new Select(driver.findElement(By.name(FDay)));
        String day = getdata().getRow(1).getCell(3).getStringCellValue();
        fromDay.selectByValue(day);
    }
    public static void SelectReturnlocation() throws IOException {
        Select toPort = new Select(driver.findElement(By.name(ToPort)));
        String to = getdata().getRow(1).getCell(4).getStringCellValue();
        toPort.selectByValue(to);
    }
    public static void SelecteReturnDate() throws IOException {
        Select toMonth = new Select(driver.findElement(By.name(Returnmonth)));
        String Month = getdata().getRow(1).getCell(5).getStringCellValue();
        toMonth.selectByVisibleText(Month);
        Select toDay = new Select(driver.findElement(By.name(Returnday)));
        String Day = getdata().getRow(1).getCell(6).getStringCellValue();
        toDay.selectByValue(Day);
    }
 public static void SelectAirlineClassPreference() throws IOException {
     driver.findElement(By.xpath(BussinessClass)).click();
     Select airline = new Select(driver.findElement(By.name(Airline)));
     String Airlinename = getdata().getRow(1).getCell(7).getStringCellValue();
     airline.selectByVisibleText(Airlinename);

 }
public static void continueBooking(){
    driver.findElement(By.name(FindFlights)).click();
}

public static String SelectFlight(){
       String meg= driver.findElement(By.xpath("//b/font")).getText();
        return meg;
}

}
