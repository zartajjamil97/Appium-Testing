/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appium.testing;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

/**
 *
 * @author zartaj.jamil
 */
public class Basic extends AppiumTesting{
public static void main(String[] args) throws MalformedURLException{
    AndroidDriver<AndroidElement> driver = Capabilities();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    //driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
    driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
    //driver.findElement(By.name("Preference")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
    driver.findElement(By.id("android:id/checkbox")).click();
    driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
    driver.findElement(By.id("android:id/edit")).sendKeys("test");
    
    //driver.findElement(By.id("android:id/button1")).click();
    //get(1) 1 is the index
    driver.findElements(By.className("android.widget.Button")).get(1).click();


    
    
}
}
