package testpage;

import POM.ServicesPOM;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ServicesPOMTest extends CommonAPI {

    ServicesPOM servicesPOM;

    @BeforeMethod
    public void getservicesTest() {
        servicesPOM = PageFactory.initElements(driver, ServicesPOM.class);
    }
    @Test
    public void setServicesPOM() {
      servicesPOM.movemouse();
      sleepFor(3);
      servicesPOM.clickOnOnLineBanking();
      driver.navigate().back();
      sleepFor(3);

      servicesPOM.movemouse();
      servicesPOM.clickStudentBanking();
      sleepFor(3);
      driver.navigate().back();

      servicesPOM.movemouse();
      servicesPOM.clickOnCrossBorder();
      sleepFor(3);
      driver.navigate().back();

      servicesPOM.movemouse();
      servicesPOM.clickOnTravelTips();
      sleepFor(3);
      driver.navigate().back();

      servicesPOM.movemouse();
      servicesPOM.clickOnForeignExchangeServices();
      sleepFor(3);
      driver.navigate().back();

      servicesPOM.movemouse();
      servicesPOM.clickOnOverdraftServices();
      sleepFor(3);
      driver.navigate().back();

      servicesPOM.movemouse();
      servicesPOM.clickOnNewToTdChecking();
      sleepFor(3);
      driver.navigate().back();

      servicesPOM.movemouse();
      servicesPOM.clickOnUnExpectedlyHuman();
      sleepFor(3);
      driver.navigate().back();
      sleepFor(3);



    }
}