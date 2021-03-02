/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appium.testing;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author zartaj.jamil
 */
public class AppiumTesting {
   

    /**
     * @return 
     * @throws java.net.MalformedURLException
     */
    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
        
        File f=new File("src");
        File fs=new File(f, "ApiDemos-debug.apk");
        
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        return driver;
        
        //Appium
        // TODO code application logic here
        
        
       
    }
    
}