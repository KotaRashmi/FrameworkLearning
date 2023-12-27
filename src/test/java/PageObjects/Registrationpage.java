package PageObjects;

import baseclass.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Registrationpage extends BaseClass {
    public static String Email ="email";
    public static String Password ="password";
    public static String CPassword ="confirmPassword";
    public static String SubmitButton = "submit";
    public static String RegConfirmation = "(//font)[5]";

    public static void Enterdetails(String user,String pass, String Confirm){
        driver.findElement(By.id(Email)).sendKeys(user);
        driver.findElement(By.name(Password)).sendKeys(pass);
        driver.findElement(By.name(CPassword)).sendKeys(Confirm);
    }
public static void ClickSubmitBotton(){

    driver.findElement(By.name(SubmitButton)).click();
}
public static String getConfirmation(){
    String usernamenote = driver.findElement(By.xpath(RegConfirmation)).getText();
    return usernamenote;

}


}
