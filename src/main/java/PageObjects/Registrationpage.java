package PageObjects;

import baseclass.BaseClass;
import org.openqa.selenium.By;

import java.io.IOException;

public class Registrationpage extends BaseClass {
    public static String Email ="email";
    public static String Password ="password";
    public static String CPassword ="confirmPassword";
    public static String SubmitButton = "submit";
    public static String RegConfirmation = "(//font)[5]";

    public static void Enterdetails() throws IOException {
        String user = getRegistartiondata().getRow(1).getCell(0).getStringCellValue();
        String password = getRegistartiondata().getRow(1).getCell(1).getStringCellValue();
        driver.findElement(By.id(Email)).sendKeys(user);
        driver.findElement(By.name(Password)).sendKeys(password);
        driver.findElement(By.name(CPassword)).sendKeys(password);
    }
public static void ClickSubmitBotton(){

    driver.findElement(By.name(SubmitButton)).click();
}
public static String getConfirmation(){
    String usernamenote = driver.findElement(By.xpath(RegConfirmation)).getText();
    return usernamenote;

}


}
