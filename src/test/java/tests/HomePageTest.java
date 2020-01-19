package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CarsShopping;
import pages.HomePage;

public class HomePageTest extends TestBase {
    HomePage homePage;
    CarsShopping employeeDashboard;

    @BeforeMethod
    public void setUp(){
        initializer();
        homePage = new HomePage();
        employeeDashboard = new CarsShopping();

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void verifyTitle(){
        homePage.click();
        Assert.assertEquals(driver.getTitle(),"Used Cars for Sale Online Near Me | Cars.com");
        //Assert.assertEquals(driver.getTitle(),);
    }

//    @Test
//    public void testLogInBtn(){
//        SeleniumUtil.click(homePage.logIn_Btn);
//        String expectedTitle ="Dashboard";
//        Assert.assertEquals(SeleniumUtil.getText(employeeDashboard.dashboardTitle),expectedTitle);
  //  }
}
