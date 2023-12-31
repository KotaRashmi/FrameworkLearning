package PageObjects;

import baseclass.BaseClass;
import org.openqa.selenium.By;

import java.io.IOException;

public class Langingpage extends BaseClass {

   public static String Regestrationlink = "//a[text()='REGISTER']";
   public static String Username ="userName";
   public static String Password= "password";
   public static String Submitbutton ="submit";

   public static String loginmesg= "//h3";
   public static String LoginFailMesg = "//td/span";

   public static void launchRegistartionpage(){
       driver.findElement(By.xpath(Regestrationlink)).click();
   }
public static void EnterValidloginCredentials() throws IOException {
       String user = getRegistartiondata().getRow(1).getCell(0).getStringCellValue();
       String password = getRegistartiondata().getRow(1).getCell(1).getStringCellValue();
      driver.findElement(By.name(Username)).sendKeys(user);
      driver.findElement(By.name(Password)).sendKeys(password);
}
    public static void EnterInValidloginCredentials() throws IOException {
        String user = getRegistartiondata().getRow(1).getCell(2).getStringCellValue();
        String password = getRegistartiondata().getRow(1).getCell(3).getStringCellValue();
        driver.findElement(By.name(Username)).sendKeys(user);
        driver.findElement(By.name(Password)).sendKeys(password);
    }
public static void ClickonSubmit() throws InterruptedException {
      driver.findElement(By.name(Submitbutton)).click();
      Thread.sleep(3000);
}

public static String GetLoginMessage() throws InterruptedException {
       Thread.sleep(2000);
      String message = driver.findElement(By.xpath(loginmesg)).getText();
      return message;
}
public static String GetLoginFailMessage(){
    String mesg = driver.findElement(By.xpath(LoginFailMesg)).getText();
    return mesg;
}

}
