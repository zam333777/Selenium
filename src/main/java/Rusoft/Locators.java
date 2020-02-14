package Rusoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators extends PageObject {

//MainPage_LOCATORS


    //HEADER
    @FindBy (css= ".LanguageSwitch__LanguageItem-sc-1vkknd-0.hkUcaq")
    public WebElement LangBtn;

    @FindBy(css = ".Logo___default-sc-1buewoa-0.ckbmdV")
    public WebElement MainLogo;

    @FindBy(css = "a[href='/products']")
    public WebElement MapProduct;

    @FindBy(css= "a[href='/competencies']")
    public WebElement SolutionsBtn;

    @FindBy(css= "a[href='/projects']")
    public WebElement ProjectBtn;

    @FindBy(css= "a[href='/company']")
    public WebElement CompanyBtn;

    // SubMenuHeader
    ///MapProduct

   @FindBy(css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/products/abs']")
    public WebElement MapAbs;

    @FindBy(css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/products/card-technologies']")
    public WebElement CardTech;

    @FindBy (css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/products/front-office-dbo']")
    public WebElement FrontOffice;

    @FindBy (css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/products/corporate']")
    public WebElement Corporate;

    @FindBy (css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/products/tsp']")
    public  WebElement Tsp;

    @FindBy (css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/products/program-modules']")
    public  WebElement  PrgModules;

    // SubMenuHeader
    ///Solutions
    @FindBy(css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/competencies/bk-system']")
    public WebElement BnkSys;

    @FindBy(css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/competencies/payment-technologies']")
    public WebElement PayTech;

    @FindBy (css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/competencies/front-office-solutions']")
    public WebElement FrontOffice2;


    @FindBy (css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/competencies/design']")
    public WebElement Design;

    @FindBy (css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/competencies/system-integration']")
    public  WebElement SysIntegration;

    @FindBy (css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/competencies/testing']")
    public  WebElement  TestAudit;


    // SubMenuHeader
    ///Projects

    @FindBy(css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/projects/cpm']")
    public WebElement BPA;

    @FindBy(css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/projects/hive']")
    public WebElement Hive;

    @FindBy (css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/projects/ewallet']")
    public WebElement Ewallet;

    @FindBy (css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/projects/qalibry']")
    public WebElement Qalibry;


    // SubMenuHeader
    ///Company

    @FindBy(css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/company/news']")
    public WebElement News;

    @FindBy(css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/company/history']")
    public WebElement History;

    @FindBy (css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/company/contacts']")
    public WebElement Contacts;

    @FindBy (css = ".Menu__SubItem-rld71z-15.jFKKLU a[href='/company/documentation']")
    public WebElement Documentation;

///////////////////////////////////////_BLOCK_01_MainPage///////////////////////////////////////////////

    //BLOCK1

    @FindBy (css = ".Button-sc-1sj39f-0.Main__MainButton-sc-17asnen-5.dCMVbG")
    public WebElement MoreProductInBanner;

    @FindBy (css = ".Button-sc-1sj39f-0.Products__ProductButton-sc-2ju0xv-2.iviWme")
    public WebElement BtnZakazConsult;

    @FindBy (css = ".Button-sc-1sj39f-0.edMwNC")
    public WebElement MoreAboutProjects;


    @FindBy (css = ".Title-sc-1wmx5ea-0.Title__h1-sc-1wmx5ea-1.gXApsP")
    public  WebElement MainTextBanner;

///////////////////////////////////////_FOOTER_MainPage///////////////////////////////////////////////

    @FindBy (css = "a[href='https://www.facebook.com/pages/category/Company/Rusoft-355455618129576/']")
    public WebElement FaceBookBtn;

    @FindBy (css = "a[href='https://vk.com/rusoftcompany']")
    public WebElement VkBtn;

    @FindBy (css = "a[href='https://www.instagram.com/rusoft_company']")
    public WebElement InstagramBtn;

///

    @FindBy (css = ".Footer__FooterList-sc-1e4omoj-0:nth-child(1) .Footer__title-sc-1e4omoj-1")
    public WebElement ProductsFooter;

    @FindBy (css = ".Footer__FooterList-sc-1e4omoj-0.jWzwck a[href='/products/card-technologies']")
    public WebElement CardTechFooter;

    @FindBy (css = ".Footer__FooterList-sc-1e4omoj-0.jWzwck a[href='/products/front-office-dbo']")
    public WebElement FrontOfficeFooter;

    @FindBy (css = " a:nth-child(4) > .Footer__item-sc-1e4omoj-2")
    public WebElement SelfCateringFooter;

    @FindBy (css = ".Footer__FooterGroup-sc-1e4omoj-4.kEOkXD a[href='/products/abs']")
    public WebElement AbsFooter;

    @FindBy (css = ".Footer__FooterGroup-sc-1e4omoj-4.kEOkXD a[href='/products/tsp']")
    public WebElement TspFooter;

    @FindBy (css = "a:nth-child(7) > .Footer__item-sc-1e4omoj-2")
    public  WebElement ComplexDevelopmentFooter;

    @FindBy (css = ".Footer__FooterList-sc-1e4omoj-0.jWzwck  a[href='/company']")
    public  WebElement  CompanyFooter;

    @FindBy (css = ".Footer__FooterList-sc-1e4omoj-0.jWzwck  a[href='/company/history']")
    public  WebElement HistoryFooter;

   @FindBy (css = ".Footer__FooterList-sc-1e4omoj-0:nth-child(2) > a:nth-child(3) > .Footer__item-sc-1e4omoj-2")
   public  WebElement NewsFooter;

//    @FindBy (css = ".Footer__item-sc-1e4omoj-2:nth-child(4)")
//    public WebElement PartnersFooter;
//
//    @FindBy (css = ".Footer__item-sc-1e4omoj-2:nth-child(5)")
//    public WebElement OpenInformationFooter;


    ///////////////////////////////////////_T_E_X_T_main_Page/////////////////////////////////////////////

    @FindBy (css = ".Menu__Block-rld71z-9.subMenu.Menu__MenuBlock-rld71z-10.bopbha")
    public  WebElement ITSolutionsTextUnderMainLogo;

    @FindBy (css =".Title-sc-1wmx5ea-0.Title__h1-sc-1wmx5ea-1.gXApsP")
    public WebElement TextInBlock01;

    @FindBy (css =".Text-sc-177fjwr-0.Text__max-sc-177fjwr-1.Main__MainText-sc-17asnen-0.dqRPtz")
    public WebElement TextInBlock01_01;

    @FindBy (css = ".Title-sc-1wmx5ea-0-h2.Title__h2-sc-1wmx5ea-2.Statistics__StatiticsTitle-uxi7q-0.kqctAF")
    public  WebElement TextRusoftInNumbers;

    @FindBy (css = ".counterStart > .Text-sc-177fjwr-0")
    public  WebElement TextWorkingProjects;

    @FindBy (css = ".Statistics__Card-uxi7q-1:nth-child(3) > .Text-sc-177fjwr-0")
    public  WebElement TextMobileGames;

    @FindBy (css = ".Statistics__Card-uxi7q-1:nth-child(4) > .Text-sc-177fjwr-0")
    public  WebElement TextCompanyUsingRusoft;

    @FindBy (css = ".Statistics__Card-uxi7q-1:nth-child(5) > .Text-sc-177fjwr-0")
    public WebElement TextSuperSpecialist;

    @FindBy (css = ".Statistics__Card-uxi7q-1:nth-child(6) > .Text-sc-177fjwr-0")
    public  WebElement TextOfficeInRussia;

    @FindBy(css = ".Statistics__Card-uxi7q-1:nth-child(7) > .Text-sc-177fjwr-0")
    public WebElement TextYearsWork;

    @FindBy (css =".Title-sc-1wmx5ea-0-h2.Title__h2-sc-1wmx5ea-2.Products__ProductsTitle-sc-2ju0xv-0.dSasJH")
    public WebElement TextComplexSolutions;

    @FindBy (css = ".Text-sc-177fjwr-0.Text__main-sc-177fjwr-2.Products__ProductText-sc-2ju0xv-1.ewzzMs")
    public  WebElement TextSystemAndDevelop;

    @FindBy (css = "a:nth-child(1) .List__content-ltnk75-2")
    public  WebElement BankSystemLink;

    @FindBy (css =  "a:nth-child(3) .List__content-ltnk75-2")
    public WebElement FrontOfficeLink;

    @FindBy (css = "a:nth-child(2) .List__content-ltnk75-2")
    public WebElement PaySystemLink;

    @FindBy (css = "a:nth-child(4) .List__content-ltnk75-2")
    public  WebElement DesignLink;

    @FindBy (css = "a:nth-child(5) .List__content-ltnk75-2")
    public WebElement SystemIntegrationLnk;

    @FindBy (css = "a:nth-child(6) .List__content-ltnk75-2")
    public WebElement TestingAuditLink;

    /////////////////////////TEXT_TECHNOLOGY//////////////////////////////
    @FindBy (css =  ".Title-sc-1wmx5ea-0-h2.Title__h2-sc-1wmx5ea-2.Technologies__TechnologiesTitle-i3m4jq-0.egKjEi")
    public WebElement TextTechnology;

    @FindBy (css = ".gNLHVv:nth-child(2) > .Title-sc-1wmx5ea-0-h3")
    public  WebElement TextPSD2;

    @FindBy (css = ".Technologies__TechnologiesCard-i3m4jq-2:nth-child(2) > .Text-sc-177fjwr-0")
    public WebElement TextUnderPSD2;

    @FindBy (css = ".Technologies__TechnologiesCard-i3m4jq-2:nth-child(3) > .Title-sc-1wmx5ea-0-h3")
    public  WebElement TextOpenApi;

    @FindBy (css = ".Technologies__TechnologiesCard-i3m4jq-2:nth-child(3) > .Text-sc-177fjwr-0")
    public WebElement TextUnderOpenApi;

    @FindBy (css = ".Technologies__TechnologiesCard-i3m4jq-2:nth-child(4) > .Title-sc-1wmx5ea-0-h3")
    public WebElement TextDBO;

    @FindBy (css = ".Technologies__TechnologiesCard-i3m4jq-2:nth-child(4) > .Text-sc-177fjwr-0")
    public WebElement TextUnderDBO;

    @FindBy (css = ".Technologies__TechnologiesCard-i3m4jq-2:nth-child(5) > .Title-sc-1wmx5ea-0-h3")
    public WebElement TextBlockChain;

    @FindBy (css = ".Technologies__TechnologiesCard-i3m4jq-2:nth-child(5) > .Text-sc-177fjwr-0")
    public WebElement TextUnderBlockChain;

    @FindBy (css = ".Card__CardWrapper-sc-15lrosr-0:nth-child(6) > .Title-sc-1wmx5ea-0-h3")
    public WebElement TextAI;

    @FindBy (css = ".Technologies__TechnologiesCard-i3m4jq-2:nth-child(6) > .Text-sc-177fjwr-0")
    public WebElement TextUnderAI;

    @FindBy (css = ".Card__CardWrapper-sc-15lrosr-0:nth-child(7) > .Title-sc-1wmx5ea-0-h3")
    public WebElement TextBigData;

    @FindBy (css = ".Technologies__TechnologiesCard-i3m4jq-2:nth-child(7) > .Text-sc-177fjwr-0")
    public  WebElement TextUnderBigData;


    /////////////////////////////////Difficult_Projects////////////////////////////////////////


    @FindBy (css = ".Advantages__AdvantagesTitle-sc-1mrqyhk-1")
    public WebElement TextDifficultProjects;

    @FindBy (css =".Text-sc-177fjwr-0.Text__main-sc-177fjwr-2.Advantages__Subtitle-sc-1mrqyhk-3.ewwHeN")
    public  WebElement TextUnderDiffProjects;

    @FindBy (css = ".Advantages__AdvantagesCard-sc-1mrqyhk-4:nth-child(3) > .Title-sc-1wmx5ea-0-h3")
    public WebElement TextVidenie;

    @FindBy (css = ".Advantages__AdvantagesCard-sc-1mrqyhk-4:nth-child(3) > .Text-sc-177fjwr-0")
    public WebElement TextUnderVidenie;

    @FindBy (css = ".Advantages__AdvantagesCard-sc-1mrqyhk-4:nth-child(4) > .Title-sc-1wmx5ea-0-h3")
    public  WebElement TextPodhod;

    @FindBy (css = ".Advantages__AdvantagesCard-sc-1mrqyhk-4:nth-child(4) > .Text-sc-177fjwr-0")
    public  WebElement TextUnderPodhod;

    @FindBy (css = ".Advantages__AdvantagesCard-sc-1mrqyhk-4:nth-child(5) > .Title-sc-1wmx5ea-0-h3")
    public WebElement TextAdvantages;

    @FindBy (css = ".Advantages__AdvantagesCard-sc-1mrqyhk-4:nth-child(5) > .Text-sc-177fjwr-0")
    public WebElement TextUnderAdvantages;

    ////////////////////////////////EVENTS//////Prtners////////////////////////////////////////

    @FindBy (css = ".Section-wz8f0m-0 > .kYvJPn")
    public  WebElement TextEvents;

    @FindBy (css = ".Partners__Wrapper-sc-1y5khvm-0 > .Title-sc-1wmx5ea-0-h2")
    public WebElement TextPartners;

    @FindBy (css = ".livxwz:nth-child(2)")
    public  WebElement TextUnderPartners;

    @FindBy (css = ".Footer__item-sc-1e4omoj-2 > strong")
    public WebElement TextOOORusoft;

    @FindBy (css = ".Footer__item-sc-1e4omoj-2:nth-child(2)")
    public  WebElement TextInFooter;

    @FindBy (css = ".Footer__FooterList-sc-1e4omoj-0 > .Footer__title-sc-1e4omoj-1")
    public  WebElement TextPredstavitelstva;

    @FindBy (css = ".Footer__address-sc-1e4omoj-3:nth-child(2)")
    public  WebElement TextAddressMoscow;


    ////////////////////////////////// click_link_mainpage ///////////////////////////////////

    @FindBy (css = "a:nth-child(1) .List__content-ltnk75-2")
    public WebElement BankSystemBtnInComplexSolution;

    @FindBy (css = "a:nth-child(3) .List__content-ltnk75-2")
    public WebElement FrontBtnInComplexSolution;

    @FindBy (css = "a:nth-child(2) .List__content-ltnk75-2")
    public WebElement PaySystemInComplexSolution;

    @FindBy (css = "a:nth-child(4) .List__content-ltnk75-2")
    public  WebElement DesignInComplexSolution;

    @FindBy (css = "a:nth-child(5) .List__content-ltnk75-2")
    public WebElement SystemIntegrationInComplexSolution;

    @FindBy (css =  "a:nth-child(6) .List__content-ltnk75-2")
    public WebElement TestingAuditInComplexSolution;

    /////////////////////////////////LOGOPARTNERS//////////////////////////

     @FindBy (css = ".Images-sc-14u6odz-0 > img:nth-child(1)")
     public  WebElement RucardPartners;

     @FindBy (css = ".Images-sc-14u6odz-0 > img:nth-child(2)")
     public  WebElement SoftTestPartners;

     @FindBy (css = "img:nth-child(3)")
     public WebElement VikiumPartners;


     //////////////////////PopUpZakazConsult//////////////////////////////////////


      @FindBy (css = ".FeedBackForm__FeedBackTitle-aqwirb-1")
      public  WebElement TextReceiveConsult;

      @FindBy (css = ".FeedBackForm__InputBlock-aqwirb-0:nth-child(2) > input")
      public  WebElement NameInFormZakazConsult;

      @FindBy (css = ".FeedBackForm__InputBlock-aqwirb-0:nth-child(3) > input")
      public  WebElement EmailInZakazConsult;

      @FindBy(css = ".phone")
      public  WebElement PhoneInZakazConsult;

      @FindBy (css = ".FeedBackForm__FeedBackButton-aqwirb-2")
      public  WebElement SendBtnInZakazConsult;

      @FindBy (css = ".Modal__Wrapper-sc-1wwzmzj-0")
      public  WebElement PopUpReceiveConsult;

      @FindBy (css = ".FeedBackForm__FeedBackTitle-aqwirb-1")
      public WebElement Zayavkasend;

      @FindBy (css = ".FeedBackForm__Message-aqwirb-3")
      public WebElement WeWillCallYou;


      ////////////////////////////////////////Second_Page_MapProduct/////////////////////////////////////////

      @FindBy (css = "#stars_pm > .styled-components__ConstellationImage-sc-11w4spv-5")
      public WebElement StarsAmc;

      @FindBy (css = "#stars_fo > .styled-components__ConstellationImage-sc-11w4spv-5")
      public  WebElement StarEwallet;

      @FindBy (css = "#stars_ct > .styled-components__ConstellationImage-sc-11w4spv-5")
      public  WebElement StarCardManager;

      @FindBy (css = "#stars_tsp > .styled-components__ConstellationImage-sc-11w4spv-5")
      public WebElement StarTermManager;

      @FindBy(css = ".styled-components__ModalContent-sc-7to27k-8")
      public WebElement PopUpProgrammModule;

      @FindBy (css = ".styled-components__Body-sc-7to27k-10")
      public WebElement PopUpFront;

      @FindBy (css =".styled-components__ModalContent-sc-7to27k-8")
      public WebElement PopUpCardTech;

      @FindBy (css = "#stars_tsp > .styled-components__ConstellationImage-sc-11w4spv-5")
      public  WebElement PopUpSolutionTCP;


      ////////////////////////////////////////////SolutionPage_Locators/////////////////////////////////

      @FindBy (css = ".TransparentButton-sc-129rsjc-0.dLAJBg")
      public WebElement ReceiveConsultInSol;

      @FindBy (css = "form:nth-child(2) > .FeedBackForm__InputBlock-aqwirb-0:nth-child(2) > input")
      public WebElement NameInPopUpReceiveConsult;

      @FindBy (css= "form:nth-child(2) > .FeedBackForm__InputBlock-aqwirb-0:nth-child(3) > input")
      public  WebElement EmailInPopUpReceiveConsult;

      @FindBy (css ="form:nth-child(2) .phone")
      public WebElement PhoneInPopUpReceiveConsult;

      @FindBy (css = "form:nth-child(2) > .Button-sc-1sj39f-0")
      public  WebElement SendBtnInPopUpReceiveConsult;

      @FindBy (css = ".Button-sc-1sj39f-0")
      public WebElement BtnRequestSentense;

      @FindBy (css =".FeedBackForm__InputBlock-aqwirb-0:nth-child(2) > input")
      public  WebElement NameInRequestSentence;

      @FindBy (css = ".FeedBackForm__InputBlock-aqwirb-0:nth-child(3) > input")
      public WebElement EmailInRequestSentence;

      @FindBy (css =".phone")
      public WebElement PhoneInRequestSentence;

      @FindBy (css = ".FeedBackForm__Message-aqwirb-3")
      public  WebElement WeWillCallYouMsg;

      @FindBy (css = ".Title-sc-1wmx5ea-0.Title__h1-sc-1wmx5ea-1.gXApsP")
      public WebElement TxtSolutions;

      @FindBy (css =".Text-sc-177fjwr-0.Text__max-sc-177fjwr-1.PromoCompetencies__MainText-z37jxy-0.gOaapp")
      public WebElement TxtUnderSolutions;












 //SUPER DRIVER

    public Locators (WebDriver driver) {
        super(driver);
    }










}
