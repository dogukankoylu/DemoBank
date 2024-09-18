import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {
    WebDriver driver;
    PageFactory pageFactory;
    PageObjectModel pageObjectModel;
    BaseTest baseTest;
    @BeforeClass
    public void startDriver() {
        baseTest = new BaseTest();
        driver = baseTest.getDriver();
    }
    @Test(priority = 1)
    public void login(){
        driver.get("https://demo.guru99.com/V4/index.php");
        pageFactory = new PageFactory(driver);
        pageFactory.kullaniciAdi();
        pageFactory.sifre();
        pageFactory.buton();
        pageFactory.assertion();
    }
    @Test(priority = 2)
    public void newCustomer(){
        pageObjectModel = new PageObjectModel(driver);
        pageObjectModel.tab();
        pageObjectModel.isim();
        pageObjectModel.birth();
        pageObjectModel.adres();
        pageObjectModel.sehir();
        pageObjectModel.ilce();
        pageObjectModel.pinKodu();
        pageObjectModel.phoneNumber();
        pageObjectModel.mailAdress();
        pageObjectModel.pass();
        pageObjectModel.buton();
    }
    @Test(priority = 3)
    public void newAccount(){
        pageFactory.tabClick();
        pageFactory.customerID();
        pageFactory.selectComboBox();
        pageFactory.miktar();
        pageFactory.tiklama();
    }
    @Test(priority = 4)
    public void withDrawal(){
        pageFactory.withDrawalClick();
        pageFactory.accountNumber();
        pageFactory.price();
        pageFactory.description();
        pageFactory.tuslama();
    }
    @Test(priority = 5)
    public void moneyTransfer(){
        pageFactory.moneyTransfer();
        pageFactory.sendAccountNo();
        pageFactory.receiveAccountNo();
        pageFactory.transferAmount();
        pageFactory.descriptions();
        pageFactory.submit();
        Alert uyari = driver.switchTo().alert();
        uyari.accept();
    }
    @AfterClass
    public void closeDriver(){
        baseTest.closeDriver();
    }

}
