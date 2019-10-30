package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.Constants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/*
 * Classname : BaseClass
 *
 * Version info = 1
 *
 * Copyright notice
 * all the common things defined here.
 */
public class BaseClass {
    public static InputStream inputStream;
    public static Properties prop;
    public static WebDriver driver;
    public BaseClass(){
        prop = new Properties();
        ///media/manish/data2/IJ/IJ_Projects/POMDemo/src/main/java/config/config.properties
        String propFileName = Constants.PATH + "/src/main/java/config/config.properties";
        try {
            inputStream = new FileInputStream(propFileName);
            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName
                        + "' not found in the classpath");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization(){
        String browserName = prop.getProperty("browser");

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/media/manish/data2/IJ/chromedriver");
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", Constants.PATH + "/src/main/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        if (driver !=null){
            System.out.println("driver not null");
        }else {
            System.out.println("driver null");

        }
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIME_OUT, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constants.PAGE_IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));
    }
}
