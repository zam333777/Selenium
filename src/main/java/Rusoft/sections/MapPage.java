
package Rusoft.sections;

import Rusoft.Locators;
import Rusoft.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Rusoft.BaseClass.softAssert;

public class MapPage extends PageObject {
  Locators locators = new Locators(driver);
  Actions actions = new Actions(driver);

  public MapPage(WebDriver driver) {
    super(driver);
  }
//public class MainPage extends BaseClass {





  public  void SubMenuIsVisible(){
    WebElement[] SubMenuMapPage = new WebElement[]{
            locators.MapAbs,
            locators.CardTech,
            locators.FrontOffice,
            locators.Corporate,
            locators.Tsp,
            locators.PrgModules
    };
    locators.MapProduct.click();
    //actions.moveToElement(locators.MapProduct).perform();
    for (int i = 0; i < SubMenuMapPage.length; i++) {
      softAssert.assertEquals(SubMenuMapPage[i].isDisplayed(), true);
    }
    softAssert.assertAll();
  }

  public void CheckStarClick(){
    WebElement [] StarMap= new WebElement[]{
            locators.StarsAmc,
            locators.StarEwallet,
            locators.StarCardManager,
            locators.StarTermManager,
    };
     WebElement[] PopUps = new WebElement[]{
             locators.PopUpProgrammModule,
             locators.PopUpFront,
             locators.PopUpCardTech,
             locators.PopUpSolutionTCP
     };

     for (int i = 0; i < StarMap.length; i++){
       locators.MapProduct.click();
       StarMap[i].click();
       softAssert.assertEquals(PopUps[i].isDisplayed(), true);
       driver.get("http://rusoft.srv.lan/");
     }
      softAssert.assertAll();
  }

    public void CheckTextInPopUp(){

    WebElement [] StarMapClick= new WebElement[]{
              locators.StarsAmc,
              locators.StarEwallet,
              locators.StarCardManager,
              locators.StarTermManager,
      };
      WebElement[] PopUpsTxt = new WebElement[]{
              locators.PopUpProgrammModule,
              locators.PopUpFront,
              locators.PopUpCardTech,
              locators.PopUpSolutionTCP};

      String[] TxtInPopUps = new String[]{
              "Программные модули\n" +
                      "M-User\n" +
                      "Универсальное решение для Интернет-ритейла. Разработано для внедрения на сайт Заказчика с целью внедрения электронной формы заявки. Неограниченное количество полей и параметров для ввода Клиентом включая загрузку графических материалов, валидация мобильного телефона/кодов доступа, подгрузка адресов из справочника и многое другое\n" +
                      "SRS\n" +
                      "Модуль предназначен для управления заявками, поступающими от потенциальных клиентов. Поддерживает функционал автоматического формирования договоров для подписания с клиентов. Широко применяется в области интернет-ритейла\n" +
                      "M-Unit\n" +
                      "Модульное решение, позволяющее внедрить в бизнес систему ведения учета любого вида сущности от единиц товара до крипто валютных единиц валюты. Архитектура позволяет вести учет перемещения сущностей от пользователя к пользователю сохраняя историю всех операций внутри системы\n" +
                      "M-Chat\n" +
                      "Универсальное решение для внедрения в Ваш бизнес чат-мессенджера для общения с клиентом. Поддерживает как мобильные так и Web-версии интерфейсов\n" +
                      "M-Valid\n" +
                      "Программное решение создано для выполнения процесса проверки объекта (сущности) по полученной из различных источников информации по заранее заданным правилам. Решение получило отличное применение в области финансовых сервисов для проверки потенциальных клиентов\n" +
                      "AMC\n" +
                      "Уникальное решение для централизованного управления учетными записями пользователей и их привилегиями на различные активности или доступы к ресурсам. Универсальная архитектура позволяет обеспечивать управление группами пользователей в абсолютно различных областях бизнеса\n" +
                      "XMail\n" +
                      "Решение для поддержки безопасной e-mail переписки между пользователями системы. Поддерживает многоуровневую систему защиты и различные режимы шифрования сообщений. Прекрасно подходит не только для корпоративной переписки, но и для внешнего обмена сообщениями с требованием к повышенной приватности данных\n" +
                      "Quimes\n" +
                      "Решение создано для смс/email информирования клиента о различных событиях. В зависимости от правил и настроек можно полностью автоматизировать процесс оповещения клиента",
              "I-Touch\n" +
                      "Уникальное решение для обеспечения обмена информацией между мобильным приложением клиента или Web-клиентом личного кабинета и серверной частью Заказчика. Поддерживает различные протоколы обмена и работает в режимах off-line/on-line. Широко применяется в финансовой индустрии для реализации дистанционных банковских сервисов\n" +
                      "E-Wallet\n" +
                      "Многофункциональный цифровой платежный инструмент E-Wallet создан для проведения быстрых платежей и переводов. Включает мобильное приложение и Web-клиент. Whitelable и поддерживает быструю кастомизацию под требование Заказчика\n" +
                      "Paygent\n" +
                      "Решение позволяет объединить большое количество точек обслуживания розничных Клиентов в единый on-line механизм. Решение актуально для банков, платежных систем, сервис-провайдеров, в также точек приема платежей и переводов\n" +
                      "Rexpay\n" +
                      "Программное решение для запуска собственной платежной системы с поддержкой полноценной инфраструктуры. Обеспечивает работу эмитентской и эквайринговой роли, а также обеспечивает расчетно-клиринговый функционал],\n" +
                      "\texpected [  ] but found []\n" +
                      "java.lang.AssertionError: The following asserts failed:\n" +
                      "\texpected [  ] but found [I-Touch\n" +
                      "Уникальное решение для обеспечения обмена информацией между мобильным приложением клиента или Web-клиентом личного кабинета и серверной частью Заказчика. Поддерживает различные протоколы обмена и работает в режимах off-line/on-line. Широко применяется в финансовой индустрии для реализации дистанционных банковских сервисов\n" +
                      "E-Wallet\n" +
                      "Многофункциональный цифровой платежный инструмент E-Wallet создан для проведения быстрых платежей и переводов. Включает мобильное приложение и Web-клиент. Whitelable и поддерживает быструю кастомизацию под требование Заказчика\n" +
                      "Paygent\n" +
                      "Решение позволяет объединить большое количество точек обслуживания розничных Клиентов в единый on-line механизм. Решение актуально для банков, платежных систем, сервис-провайдеров, в также точек приема платежей и переводов\n" +
                      "Rexpay\n" +
                      "Программное решение для запуска собственной платежной системы с поддержкой полноценной инфраструктуры. Обеспечивает работу эмитентской и эквайринговой роли, а также обеспечивает расчетно-клиринговый функционал",
              "Карточные технологии\n" +
                      "R-Emission\n" +
                      "Программный комплекс, предназначенный для обеспечение полноценной эмиссионной деятельности в финансовом учреждении. Включает в себя набор модулей, позволяющий обеспечить взаимодействие АБС с процессинговым центром в разрезе эмиссии карт\n" +
                      "RCS-Retail\n" +
                      "Программный модуль, предназначенный для обеспечения удаленного оперативного сопровождения торговых пластиковых карт (карты лояльности) в торгово – сервисном предприятии\n" +
                      "Центр Персонализации\n" +
                      "Программный комплекс предназначен для выполнения операций по подготовке данных для персонализации пластиковых карт на основе файлов-заявок, полученных из Процессинговой Компании\n" +
                      "Card Manager\n" +
                      "Программный продукт «RUSOFT-RETAIL» предназначен для автоматизации розничного бизнеса в коммерческом банке и представляет собой решение, реализующее весь спектр услуг, предлагаемых банком физическим лицам\n" +
                      "In-Card\n" +
                      "Программный комплекс предназначен для организации обслуживания эмитированных банком карт в режиме in-house. Обеспечивает ведение карт эмитента и их лимитов, осуществление авторизаций по картам, а также маршрутизацию авторизационных сообщений для разных получателей и разделение журналов операций с терминальных устройств для каждого направления авторизации\n" +
                      "M-Card\n" +
                      "Комплексное решение для обеспечения процессинга банковских и небанковских карт. Подходит как для финансовых учреждений так и для предприятий розничного ритейла\n" +
                      "R-System\n" +
                      "Предназначен для обеспечения удаленного оперативного сопровождения пластиковых карт клиентов Банка, находящихся на авторизации в Процессинговом Центре, по запросам клиентов – держателей пластиковых карт дежурными вычислительного центра и технологического отдела, а также работниками претензионного отдела при оперативном разборе претензионных ситуаций",
              "  "
      };

      for (int i =0; i < StarMapClick.length; i++){
        locators.MapProduct.click();
        StarMapClick[i].click();
        softAssert.assertEquals(PopUpsTxt[i].getText(), TxtInPopUps[i]);
        driver.get("http://rusoft.srv.lan/"); }
      softAssert.assertAll();
    }







  }


