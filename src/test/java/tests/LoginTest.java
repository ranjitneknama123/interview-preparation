package tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(groups = {"smoke"})
    public void positiveLoginTest(){
        System.out.println("from positiveLoginTest");
    }
}
