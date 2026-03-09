package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    @Test(groups = {"smoke"})
    public void homePageLoadTest() {
        System.out.println("Smoke Test - Home Page");
    }

    @Test(groups = {"regression"})
    public void productSearchTest() {
        System.out.println("Regression Test - Search");
    }

    @Test(groups = {"smoke", "regression"})
    public void loginTest() {
        System.out.println("Login Test");
        Assert.assertTrue(true);
    }
}
