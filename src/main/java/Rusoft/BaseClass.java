package Rusoft;

import Rusoft.sections.Customers;
import Rusoft.sections.MainPage;
import Rusoft.sections.MapPage;
import Rusoft.sections.SolutionPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

    public class BaseClass extends PageObject {
    protected static WebDriver driver;
    public static JavascriptExecutor jse;
    public static Actions actions;
    public static SoftAssert softAssert;

    public BaseClass baseClass;
    public Customers customers;
    public MainPage mainPage;
    public Locators locators;
    public MapPage mapPage;
    public SolutionPage solPage;



//UNIVERSALS LOCATORS

//SUPER DRIVER

    public BaseClass() {
        super(driver);
    }

    public BaseClass(WebDriver driver) {
        super(driver);
    }


//BEFORE AND AFTER

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
//        WebDriverManager.firefoxdriver().setup();
        //driver = new ChromeDriver();
//        driver = new FirefoxDriver();
    }
    @AfterMethod
    public void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

//UNIVERSAL OPERATIONS





}





