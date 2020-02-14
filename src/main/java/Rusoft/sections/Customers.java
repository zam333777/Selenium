package Rusoft.sections;

import org.openqa.selenium.WebDriver;
import Rusoft.BaseClass;
import Rusoft.Locators;
import Rusoft.PageObject;


import static org.testng.Assert.assertEquals;

public class Customers extends PageObject {

    BaseClass baseClass = new BaseClass();
    public Locators locators;

//SUPER DRIVER

    public Customers(WebDriver driver) {
        super(driver);
    }

//OPERATIONS

    public void goToSubSectionCustomers() {
        assertEquals(driver.getCurrentUrl(), "google.com");
    }
}
