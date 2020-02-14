package Rusoft.sections;

import Rusoft.BaseClass;
import Rusoft.Locators;
import Rusoft.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

import static Rusoft.BaseClass.softAssert;
import static org.testng.Assert.assertEquals;

public class MainPage extends PageObject {
//public class MainPage extends BaseClass {

  Actions actions = new Actions(driver);
  Locators locators = new Locators(driver);
  BaseClass baseClass = new BaseClass();

  public MainPage(WebDriver driver) {
    super(driver);
  }

//Работоспособность кнопки смены локали//
  public void LngBtn(){
    locators.LangBtn.click();
    assertEquals(locators.MapProduct.getText(), "SOFTWARE PRODUCTS");

  }
// клик по лого и переход на главный экран//
  public void MainLogoClick() {
    locators.MapProduct.click();
    locators.MainLogo.click();
    assertEquals(driver.getCurrentUrl(), "http://rusoft.srv.lan/");
  }

  //Клик по по вкладакам в хедере//

  public void HeaderBtnClick() {
    String[] btnUrls = new String[]{
            "http://rusoft.srv.lan/products",
            "http://rusoft.srv.lan/competencies",
            "http://rusoft.srv.lan/projects",
            "http://rusoft.srv.lan/company"
    };

    WebElement[] HeaderBtn = new WebElement[]{
            locators.MapProduct,
            locators.SolutionsBtn,
            locators.ProjectBtn,
            locators.CompanyBtn};

    for (int i = 0; i < HeaderBtn.length; i++) {
      HeaderBtn[i].click();
      //MainPage.switchTab();
      softAssert.assertEquals(driver.getCurrentUrl(), btnUrls[i]);
      //driver.get("http://softtest.srv.lan/#/about");
    }
    softAssert.assertAll();
  }

  //клик по Sub - вкладкам меню//

  public void SubMenuMapCheck() throws InterruptedException {
    WebElement[] SubMenu = new WebElement[]{
            locators.MapAbs,
            locators.CardTech,
            locators.FrontOffice,
            locators.Corporate,
            locators.Tsp,
            locators.PrgModules
    };

    String[] SubMenuLink = new String[]{
            "http://rusoft.srv.lan/products/abs",
            "http://rusoft.srv.lan/products/card-technologies",
            "http://rusoft.srv.lan/products/front-office-dbo",
            "http://rusoft.srv.lan/products/corporate",
            "http://rusoft.srv.lan/products/tsp",
            "http://rusoft.srv.lan/products/program-modules"
    };

    for (int i = 0; i < SubMenu.length; i++) {
      actions.moveToElement(locators.MapProduct).perform();
      //MainPage.switchTab();
      SubMenu[i].sendKeys(Keys.ENTER);
      softAssert.assertEquals(driver.getCurrentUrl(), SubMenuLink[i]);
      driver.get("http://rusoft.srv.lan");
      //driver.get("http://softtest.srv.lan/#/about");
    }
    softAssert.assertAll();
  }

  public void SubMenuSolutions() {
    WebElement[] SubMenuSol = new WebElement[]{
            locators.BnkSys,
            locators.PayTech,
            locators.FrontOffice2,
            locators.Design,
            locators.SysIntegration,
            locators.TestAudit
    };

    String[] SubMenuSolutionsLink = new String[]{
            "http://rusoft.srv.lan/competencies/bk-system",
            "http://rusoft.srv.lan/competencies/payment-technologies",
            "http://rusoft.srv.lan/competencies/front-office-solutions",
            "http://rusoft.srv.lan/competencies/design",
            "http://rusoft.srv.lan/competencies/system-integration",
            "http://rusoft.srv.lan/competencies/testing"
    };

    for (int i = 0; i < SubMenuSol.length; i++) {
      actions.moveToElement(locators.SolutionsBtn).perform();
      //MainPage.switchTab();
      SubMenuSol[i].sendKeys(Keys.ENTER);
      softAssert.assertEquals(driver.getCurrentUrl(), SubMenuSolutionsLink[i]);
      driver.get("http://rusoft.srv.lan");
      //driver.get("http://softtest.srv.lan/#/about");
    }
    softAssert.assertAll();
  }

  public void SubMenuProjects() {
    WebElement[] SubMenuProjects = new WebElement[]{
            locators.BPA,
            locators.Hive,
            locators.Ewallet,
            locators.Qalibry
    };

    String[] SubMenuProjectsLink = new String[]{
            "http://rusoft.srv.lan/projects/cpm",
            "http://rusoft.srv.lan/projects/hive",
            "http://rusoft.srv.lan/projects/ewallet",
            "http://rusoft.srv.lan/projects/qalibry",

    };

    for (int i = 0; i < SubMenuProjects.length; i++) {
      actions.moveToElement(locators.ProjectBtn).perform();
      //MainPage.switchTab();
      SubMenuProjects[i].sendKeys(Keys.ENTER);
      softAssert.assertEquals(driver.getCurrentUrl(), SubMenuProjectsLink[i]);
      driver.get("http://rusoft.srv.lan");
      //driver.get("http://softtest.srv.lan/#/about");
    }
    softAssert.assertAll();
  }

  public void SubMenuCompany() {
    WebElement[] SubMenuCompany = new WebElement[]{
            locators.News,
            locators.History,
            locators.Contacts,
            locators.Documentation
    };

    String[] SubMenuCompanyLink = new String[]{
            "http://rusoft.srv.lan/company/news",
            "http://rusoft.srv.lan/company/history",
            "http://rusoft.srv.lan/company/contacts",
            "http://rusoft.srv.lan/company/documentation",

    };

    for (int i = 0; i < SubMenuCompany.length; i++) {
      actions.moveToElement(locators.CompanyBtn).perform();
      //MainPage.switchTab();
      SubMenuCompany[i].sendKeys(Keys.ENTER);
      softAssert.assertEquals(driver.getCurrentUrl(), SubMenuCompanyLink[i]);
      driver.get("http://rusoft.srv.lan");
      //driver.get("http://softtest.srv.lan/#/about");
    }
    softAssert.assertAll();
  }

//клик по кнопка на основной старице(крме хедера и футора)//
  public void MainPageClickBtn(){
    WebElement[] ClickMainPageBody = new WebElement[]{
            locators.MoreProductInBanner,
            locators.MoreAboutProjects,
            locators.BankSystemBtnInComplexSolution,
            locators.PaySystemInComplexSolution,
            locators.FrontBtnInComplexSolution,
            locators.DesignInComplexSolution,
            locators.SystemIntegrationInComplexSolution,
            locators.TestingAuditInComplexSolution

    };

    String[] MainPageBtnClick = new String []{
            "http://rusoft.srv.lan/products",
            "http://rusoft.srv.lan/projects",
            "http://rusoft.srv.lan/competencies/bk-system",
            "http://rusoft.srv.lan/competencies/payment-technologies",
            "http://rusoft.srv.lan/competencies/front-office-solutions",
            "http://rusoft.srv.lan/competencies/design",
            "http://rusoft.srv.lan/competencies/system-integration",
            "http://rusoft.srv.lan/competencies/testing"




    };

    for (int i=0; i < ClickMainPageBody.length; i++) {
      ClickMainPageBody[i].click();
      softAssert.assertEquals(driver.getCurrentUrl(), MainPageBtnClick[i]);

      driver.get("http://rusoft.srv.lan");
    }
    softAssert.assertAll();
  }


//клик по иконкам соцсетей и переход на соответсвующие страницы//
  public void CheckLinkSocial() {
    WebElement[] SocialBtn = new WebElement[]{
      locators.FaceBookBtn,
      locators.VkBtn,
      locators.InstagramBtn
    };

    String[] SocialLink = new String[]{
            "https://www.facebook.com/pages/category/Company/Rusoft-355455618129576/",
            "https://vk.com/rusoftcompany",
            "https://www.instagram.com/rusoft_company/"
    };

    for (int i = 0; i < SocialBtn.length; i++){
      SocialBtn[i].click();
      ArrayList<String> Tabs2 = new ArrayList <String> (driver.getWindowHandles());
      driver.switchTo().window(Tabs2.get(1));
      softAssert.assertEquals(driver.getCurrentUrl(), SocialLink[i]);
     driver.close();
     driver.switchTo().window(Tabs2.get(0));
    }
    softAssert.assertAll();
  }


  // проверка переходов по ссылкам в футере//

  public void CheckLinkFooter() {
    WebElement[] FooterLinks = new WebElement[]{
            locators.ProductsFooter,
            locators.CardTechFooter,
            locators.FrontOfficeFooter,
            locators.SelfCateringFooter,
            locators.AbsFooter,
            locators.TspFooter,
            locators.ComplexDevelopmentFooter,
            locators.CompanyFooter,
            locators.HistoryFooter,
            locators.NewsFooter,

    };

    String[] LinkFromFooter = new String[] {
      "http://rusoft.srv.lan/products",
      "http://rusoft.srv.lan/products/card-technologies",
      "http://rusoft.srv.lan/products/front-office-dbo",
      "http://rusoft.srv.lan/products",
      "http://rusoft.srv.lan/products/abs",
      "http://rusoft.srv.lan/products/tsp",
      "http://rusoft.srv.lan/products",
      "http://rusoft.srv.lan/company",
      "http://rusoft.srv.lan/company/history",
      "http://rusoft.srv.lan/company/news",
    };

    for (int i = 0; i < FooterLinks.length; i++){
      FooterLinks[i].click();
      softAssert.assertEquals(driver.getCurrentUrl(), LinkFromFooter[i]);
     // Thread.sleep(300);
      driver.get("http://rusoft.srv.lan/");
    }
    softAssert.assertAll();
  }


///тесты по проверке текстов//

    public void CheckHeaderText(){

      WebElement[] HeaderBtnTxt = new WebElement[]{
              locators.MapProduct,
              locators.SolutionsBtn,
              locators.ProjectBtn,
              locators.CompanyBtn,

      };
    String [] TxtBtnHeader = new String[]{
      "КАРТА ПРОДУКТОВ",
       "РЕШЕНИЯ",
       "ПРОЕКТЫ",
       "КОМПАНИЯ",
    };

    for (int i = 0; i < HeaderBtnTxt.length; i++){
      softAssert.assertEquals(HeaderBtnTxt[i].getText(), TxtBtnHeader[i]);
    }
  softAssert.assertAll();
    }


    public void TxtSubMenuMapProducts(){

      WebElement[] SubMenuText = new WebElement[]{
              locators.MapAbs,
              locators.CardTech,
              locators.FrontOffice,
              locators.Corporate,
              locators.Tsp,
              locators.PrgModules
      };

    String [] TxtSubMenuBtnMap = new String[]{
                "Автоматизированные банковские системы",
                "Карточные технологии",
                "Фронт-офис и решения ДБО",
                "Корпоративные решения",
                "Решения для ТСП",
                "Программные модули"};

    for (int i =0; i < SubMenuText.length; i++){
      actions.moveToElement(locators.MapProduct).perform();
      softAssert.assertEquals (SubMenuText[i].getText(), TxtSubMenuBtnMap[i]);
    }
    softAssert.assertAll();

    }


  public void TxtSubMenuSolutions(){

    WebElement[] SubMenuTextSol = new WebElement[]{
            locators.BnkSys,
            locators.PayTech,
            locators.FrontOffice2,
            locators.Design,
            locators.SysIntegration,
            locators.TestAudit
    };

    String [] TxtSubMenuBtnSol = new String[]{
            "Банковские системы",
            "Платежные технологии",
            "Фронт-офис и решения ДБО",
            "Дизайн",
            "Системная интеграция",
            "Тестирование и технологический аудит"};

    for (int i =0; i < SubMenuTextSol.length; i++){
      actions.moveToElement(locators.SolutionsBtn).perform();
      softAssert.assertEquals (SubMenuTextSol[i].getText(), TxtSubMenuBtnSol[i]);
    }
    softAssert.assertAll();

  }


  public void TxtSubMenuProjects(){

    WebElement[] SubMenuTextProjects = new WebElement[]{
            locators.BPA,
            locators.Hive,
            locators.Ewallet,
            locators.Qalibry
    };

    String [] TxtSubMenuBtnProjects = new String[]{
            "БПА",
            "Hive",
            "E-Wallet",
            "Qalibry",
            };

    for (int i =0; i < SubMenuTextProjects.length; i++){
      actions.moveToElement(locators.ProjectBtn).perform();
      softAssert.assertEquals (SubMenuTextProjects[i].getText(), TxtSubMenuBtnProjects[i]);
    }
    softAssert.assertAll();

  }

  public void TxtSubMenuCompany(){

    WebElement[] SubMenuTextCompany = new WebElement[]{
            locators.News,
            locators.History,
            locators.Contacts,
            locators.Documentation
    };

    String [] TxtSubMenuBtnCompany = new String[]{
            "Новости",
            "История",
            "Контакты",
            "Документация",
    };

    for (int i =0; i < SubMenuTextCompany.length; i++){
      actions.moveToElement(locators.CompanyBtn).perform();
      softAssert.assertEquals (SubMenuTextCompany[i].getText(), TxtSubMenuBtnCompany[i]);
    }
    softAssert.assertAll();

  }


  public void TxtLogoClick(){
    locators.MainLogo.click();
    assertEquals(locators.ITSolutionsTextUnderMainLogo.getText(), "Превосходные IT-решения для финансовых и торговых компаний");
  };


  public void TextMainPage(){
    WebElement[] TxtInMainPage = new WebElement[]{
      locators.TextInBlock01,
      locators.TextInBlock01_01,
      locators.TextRusoftInNumbers,
      locators.TextWorkingProjects,
      locators.TextMobileGames,
      locators.TextCompanyUsingRusoft,
      locators.TextSuperSpecialist,
      locators.TextOfficeInRussia,
      locators.TextYearsWork,
      locators.TextComplexSolutions,
      locators.TextSystemAndDevelop,
      locators.BankSystemLink,
      locators.FrontOfficeLink,
      locators.PaySystemLink,
      locators.DesignLink,
      locators.SystemIntegrationLnk,
      locators.TestingAuditLink,
      locators.BtnZakazConsult,
      locators.TextTechnology,
      locators.TextPSD2,
      locators.TextUnderPSD2,
      locators.TextOpenApi,
      locators.TextUnderOpenApi,
      locators.TextDBO,
      locators.TextUnderDBO,
      locators.TextBlockChain,
      locators.TextUnderBlockChain,
      locators.TextAI,
      locators.TextUnderAI,
      locators.TextBigData,
      locators.TextUnderBigData,
      locators.TextDifficultProjects,
      locators.TextUnderDiffProjects,
      locators.TextVidenie,
      locators.TextUnderVidenie,
      locators.TextPodhod,
      locators.TextUnderPodhod,
      locators.TextAdvantages,
      locators.TextUnderAdvantages,
      locators.TextEvents,
      locators.TextPartners,
      locators.TextUnderPartners,
      locators.TextOOORusoft,
      locators.TextInFooter,
      locators.TextPredstavitelstva,
      locators.TextAddressMoscow,

    };

    String[] TextAllBlocksInMainPage = new String[]{
      "Территория\n" +
      "Digital",
      "Создаем интеллектуальные продукты для Вашего бизнеса",
      "Русофт в цифрах",
      "Действующих программных продуктов",
      "Отраслевых сфер от разработки мобильных игр, до создания высоконагруженных процессинговых систем",
      "Компаний различных отраслей, использующих продукты «Русофт»",
      "Первоклассных специалистов",
      "Офисов в России",
      "Лет успешной работы на российском и зарубежных рынках",
      "Комлексные решения",
      "Предоставляем многократно испытанные системы и разрабатываем сложные комплексные решения: от проектирования и дизайна до тестирования и полного сопровождения",
      "Банковские системы",
      "Фронт-офис и решения ДБО",
      "Платежные технологии",
      "Дизайн",
      "Системная интеграция",
      "Тестирование и технологический аудит",
      "ПОЛУЧИТЬ КОНСУЛЬТАЦИЮ",
      "Технологии",
      "PSD2",
      "Технологии Open API используются в передовых платежных онлайн-сервисах",
      "Open API",
      "Применяются новейшие практики и отраслевые стандарты",
      "ДБО",
      "Интеллектуальный дизайн и современный функционал",
      "Blockchain",
      "Решения, основанные на распределённых реестрах",
      "AI",
      "Самообучающиеся системы, чат-боты, нейронные сети",
      "Big Data",
      "Передовые аналитические компетенции",
      "Сложные проекты.\n" +
              "Оригинальные решения",
       "«Русофт» не просто предоставляет готовые решения на рынках Финтех и E-Commerce, но и активно участвует в проектировании и создании инновационных сервисов.",
       "Видение",
      "Значительный опыт создания сложных IT-продуктов позволяет Команде Русофт, в совместной работе с партнерами, проектировать и внедрять самые современные цифровые сервисы в различных сферах.",
       "Подход",
       "Создание продукта на 100% решающего проблему Клиента — приоритетная задача при проектировании и внедрении каждого конкретного решения Русофт.",
       "Преимущества",
        "Технологии и программные комплексы, действующие в современных проектах «Русофт», дают нашим Клиентам реальные рыночные преимущества и снижают их затраты на автоматизацию бизнес-процессов.",
        "События",
        "Партнеры",
        "Наши партнеры уже интегрировали решения «Русофт» в свой бизнес",
         "ООО «Русофт» ©2018-2019",
         "Работаем для Вас с 2003 года. Мы предлагаем более 10 комплексных решений для Вашего бизнеса, осуществили уже более 550 инсталляций.",
        "ПРЕДСТАВИТЕЛЬСТВА",
         "Москва\n" +
                 "ул. Викторенко д. 5 стр. 1\n" +
                 "+7 (495) 737-06-79\n" +
                 "info@rusoft-company.ru",

    };

    for (int i = 0; i < TxtInMainPage.length; i++) {
      softAssert.assertEquals(TxtInMainPage[i].getText(), TextAllBlocksInMainPage[i]);
    }
    softAssert.assertAll();
  }


    public void IsVisibleElements() {
    WebElement[] Elements = new WebElement[]{
            locators.RucardPartners,
            locators.SoftTestPartners,
            locators.VikiumPartners
    };

    ((JavascriptExecutor)driver).executeScript("window.scrollBy(" + 0 + "," + 10000 + ");");

      for (int i = 0; i < Elements.length; i++) {
        softAssert.assertEquals(Elements[i].isDisplayed(), true);
      }
      softAssert.assertAll();

    }


    public void FormaZakaz() {
    locators.BtnZakazConsult.click();
    if (locators.TextReceiveConsult.isDisplayed()){
      //softAssert.assertEquals(locators.TextReceiveConsult.getText(), "Получить консультацию");
      locators.NameInFormZakazConsult.sendKeys("Андрей");
      locators.EmailInZakazConsult.sendKeys("sdgfs@sdfsd.ru");
      locators.PhoneInZakazConsult.sendKeys("9123456789");
      locators.SendBtnInZakazConsult.click();
    }
    assertEquals(locators.WeWillCallYou.getText(), "В ближайшее время мы свяжемся с Вами!");
  }

    public void HeaderIsVisible() throws InterruptedException {
      ((JavascriptExecutor)driver).executeScript("window.scrollBy(" + 0 + "," + 10000 + ");");
      Thread.sleep(2000);
      assertEquals(locators.MainLogo.getLocation().getY(), 6300);
    }





//  public  void TextInMainPageCheck(){
//    assertEquals(locators.MainTextBanner.getText(), "Территория\n" +
//            "Digital");
//  }





}





