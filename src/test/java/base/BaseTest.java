package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utilities.ReadProperties;

import javax.xml.transform.sax.SAXResult;

public class BaseTest {

    @Parameters("browser")
    //@BeforeSuite
    @BeforeClass
    public void setup(@Optional("chrome") String browser) {
        WebDriver driver = DriverFactory.createDriver();
        DriverManager.setDriver(driver);
        DriverManager.getDriver().get(ReadProperties.getProperty("url"));
        DriverManager.getDriver().manage().window().maximize();

    }

    //@AfterSuite
    @AfterClass
    public void tearDown() {
        DriverManager.quitDriver();
    }


}
