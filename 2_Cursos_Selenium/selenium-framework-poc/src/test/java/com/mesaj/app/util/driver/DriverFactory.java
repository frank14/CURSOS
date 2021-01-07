package com.mesaj.app.util.driver;

import com.mesaj.app.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory {

    private static final String pathFormat = System.getProperty("user.dir") + "/src/test/resources/drivers/windows/%s";

    public static WebDriver get(Browser browser){

        if (Browser.chrome == browser){
            System.setProperty("webdriver.chrome.driver", String.format(pathFormat, "chromedriver.exe"));
            return new ChromeDriver();
        }

        if (Browser.firefox == browser){
            System.setProperty("webdriver.gecko.driver", String.format(pathFormat, "geckodriver.exe"));
            return new FirefoxDriver();
        }

        if (Browser.ie == browser){
            System.setProperty("webdriver.ie.driver", String.format(pathFormat, "IEDriverServer.exe"));
            return new InternetExplorerDriver();
        }

        if (Browser.opera == browser){
            System.setProperty("webdriver.opera.driver", String.format(pathFormat, "operadriver.exe"));
            return new OperaDriver();
        }

        if (Browser.edge == browser){
            System.setProperty("webdriver.edge.driver", String.format(pathFormat, "msedgedriver.exe"));
            return new EdgeDriver();
        }

        throw new IllegalArgumentException("Driver not found for your browser: " + browser);

    }

}
