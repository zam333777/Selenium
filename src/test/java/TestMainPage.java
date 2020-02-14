import Rusoft.BaseClass;
import Rusoft.Locators;
import Rusoft.sections.MainPage;
import Rusoft.sections.MapPage;
import Rusoft.sections.SolutionPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class TestMainPage extends BaseClass {

//BEFORE ANY TEST IN THIS CLASS

    @BeforeMethod
    public void testSetUp() {
        //driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.get("http://rusoft.srv.lan/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.mainPage = new MainPage(driver);
        this.mapPage =new MapPage(driver);
        this.solPage = new SolutionPage(driver);
        this.locators = new Locators(driver);
        baseClass = new BaseClass();
        baseClass = new BaseClass(driver);
        jse = (JavascriptExecutor) driver;
        softAssert = new SoftAssert();
        actions = new Actions(driver);
    }

//TEST
///////////////////////////////_Header_/////////////////////////////////////

    @Test
    public void MainLogoClick() {
        mainPage.MainLogoClick();
    }

    @Test
    public  void LanguageBtnCheck(){
        mainPage.LngBtn();
    }

    @Test
    public void HeaderButtonClick() {
        mainPage.HeaderBtnClick();
    }

    @Test
    public void SubMenuMap() throws InterruptedException {mainPage.SubMenuMapCheck();}

    @Test
    public void SubMenuSolutions() {
        mainPage.SubMenuSolutions();
    }

    @Test
    public void SubMenuProjects(){
        mainPage.SubMenuProjects();
    }

    @Test
    public void SubMenuCompany(){
        mainPage.SubMenuCompany();

    }
//////////////////////////Block01_Under_Header////////////////////////////////////////////

    @Test
    public void MainPageBtnClick(){
      mainPage.MainPageClickBtn();
    }

    @Test
    public void SocialsBtnCheck90() {
        mainPage.CheckLinkSocial();
    }

    @Test
    public void CheckFooterLink() throws InterruptedException {
        mainPage.CheckLinkFooter();
    }

    /////////////////////////////////////////////Text_Check/////////////////////////////////////////


    @Test
     public void TxtHeaderBtn(){
        mainPage.CheckHeaderText();
    };

    @Test
  public void TxtInSubMenuMapProducts(){
      mainPage.TxtSubMenuMapProducts();
    };

    @Test
    public  void TxtSubMenuSolutions(){
        mainPage.TxtSubMenuSolutions();
    }

    @Test
    public void TxtSubmenuProjects(){
        mainPage.TxtSubMenuProjects();
    }

    @Test
    public void TxtSubmenuCompany(){
        mainPage.TxtSubMenuCompany();
    }

    @Test
    public  void TextUnderMainLogo(){
        mainPage.TxtLogoClick();
    }

    @Test
     public  void TextMainPageCheck(){ mainPage.TextMainPage();}

    @Test
    public  void  PartnersLogoIsVisible(){
    mainPage.IsVisibleElements();
    }

    @Test
    public  void  FormaRecieveConsult() {mainPage.FormaZakaz();}

    @Test
    public void HeaderIsvisibleDownPage() throws InterruptedException {mainPage.HeaderIsVisible();}

///////////////////////////////////////ТЕСТЫ второй странички ////////////////////////////////////////////

  @Test
  public void CheckVisibleSubMenu(){ mapPage.SubMenuIsVisible();}

  @Test
  public  void CheckStarMap(){ mapPage.CheckStarClick(); }

 //  @Test                              ---------------- работает некорректно-----------------------
//  public void CheckTextInPopUps(){
//      mapPage.CheckTextInPopUp();
//  }



/////////////////////////////////////////////TEST_SolutionsPage////////////////////////////////////


  @Test
  public void SunMenuVisiblePageSol(){solPage.SubMenuIsVisibleSol();}

  @Test
  public void ReceiveConsultIbSolPage(){solPage.ReceiveConsultPopUp();}

  @Test
  public void CheckLinkSolPAge() {solPage.CheckLinkInSolPage();}

  @Test
  public void CheckRequestSentence(){
      solPage.RequestSentense();
  }




//    @Test
//    public void TextInMainBanner(){
//        mainPage.TextInMainBanner();
//    }



}

