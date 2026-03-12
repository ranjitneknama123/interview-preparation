package tests;

import base.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest extends BaseTest {

   // @Severity(SeverityLevel.CRITICAL)
    public void homePageLoadTest() {
        System.out.println("Smoke Test - Home Page");
    }

    @Test
    //@Severity(SeverityLevel.CRITICAL)
    public void productSearchTest() {
        System.out.println("Regression Test - Search");
    }

    @Test
    //@Severity(SeverityLevel.CRITICAL)
    public void loginTest() {
        System.out.println("Login Test");
        ///Assert.assertTrue(true);
        //Assert.fail();
    }
}
