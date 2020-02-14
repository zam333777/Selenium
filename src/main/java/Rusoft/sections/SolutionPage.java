package Rusoft.sections;

import Rusoft.Locators;
import Rusoft.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static Rusoft.BaseClass.softAssert;
import static org.testng.Assert.assertEquals;

public class SolutionPage extends PageObject {
  Locators locators = new Locators(driver);
  Actions actions = new Actions(driver);

  public SolutionPage(WebDriver driver) {
    super(driver);
  }


  public void SubMenuIsVisibleSol() {
    WebElement[] SubMenuMapPage = new WebElement[]{
            locators.BnkSys,
            locators.PayTech,
            locators.FrontOffice2,
            locators.Design,
            locators.SysIntegration,
            locators.TestAudit
    };
    locators.SolutionsBtn.click();
    //actions.moveToElement(locators.MapProduct).perform();
    for (int i = 0; i < SubMenuMapPage.length; i++) {
      softAssert.assertEquals(SubMenuMapPage[i].isDisplayed(), true);
    }
    softAssert.assertAll();
  }


  public void ReceiveConsultPopUp() {
    locators.SolutionsBtn.click();
    locators.ReceiveConsultInSol.click();
    if (locators.PopUpReceiveConsult.isDisplayed()) ;
    {
      locators.NameInPopUpReceiveConsult.sendKeys("Андрей");
      locators.EmailInPopUpReceiveConsult.sendKeys("asqwd@dgfe.ru");
      locators.PhoneInPopUpReceiveConsult.sendKeys("9212653336");
      locators.SendBtnInPopUpReceiveConsult.click();
    }
    assertEquals(locators.PopUpReceiveConsult.isDisplayed(), true);

  }


  public void CheckLinkInSolPage() {
    WebElement[] ClickSolPage = new WebElement[]{
            locators.BankSystemLink,
            locators.PaySystemLink,
            locators.FrontOfficeLink,
            locators.DesignLink,
            locators.SystemIntegrationLnk,
            locators.TestingAuditLink

    };

    String[] LinkSolPage = new String[]{
            "http://rusoft.srv.lan/competencies/bk-system",
            "http://rusoft.srv.lan/competencies/payment-technologies",
            "http://rusoft.srv.lan/competencies/front-office-solutions",
            "http://rusoft.srv.lan/competencies/design",
            "http://rusoft.srv.lan/competencies/system-integration",
            "http://rusoft.srv.lan/competencies/testing"

    };
    for (int i = 0; i < ClickSolPage.length; i++) {
     locators.SolutionsBtn.click();
     ((JavascriptExecutor)driver).executeScript("window.scrollBy(" + 0 + "," + 900 + ");");
     ClickSolPage[i].click();
      softAssert.assertEquals(driver.getCurrentUrl(), LinkSolPage[i]);

      driver.get("http://rusoft.srv.lan");
    }
    softAssert.assertAll();
  }

    public void RequestSentense(){
    locators.SolutionsBtn.click();
      ((JavascriptExecutor)driver).executeScript("window.scrollBy(" + 0 + "," + 3000 + ");");
    locators.NameInRequestSentence.sendKeys("asdasdasd");
    locators.EmailInRequestSentence.sendKeys("qwdas@asasd.ru");
    locators.PhoneInRequestSentence.sendKeys("1111111111");
    locators.BtnRequestSentense.click();
      Assert.assertEquals(locators.WeWillCallYouMsg.getText(), "В ближайшее время мы свяжемся с Вами!");

  }


}




