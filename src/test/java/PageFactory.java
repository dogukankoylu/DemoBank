import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PageFactory extends BasePage {

    public PageFactory(WebDriver driver) {
        super(driver);
        org.openqa.selenium.support.PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@name='uid']")
    private WebElement username;
    @FindBy(xpath = "//*[@name='password']")
    private WebElement password;
    @FindBy(xpath = "//*[@name='btnLogin']")
    private WebElement button;
    public void kullaniciAdi(){
        username.sendKeys("mngr589100");
    }
    public void sifre(){
        password.sendKeys("uvunYqE");
    }
    public void buton(){
        button.click();
    }
    @FindBy(xpath = "//a[normalize-space()='New Account']")
    private WebElement tab;
    @FindBy(xpath = "//input[@name='cusid']")
    private WebElement customer;
    @FindBy(xpath = "//select[@name='selaccount']")
    private WebElement comboBox;
    @FindBy(xpath = "//input[@name='inideposit']")
    private WebElement amount;
    @FindBy(xpath = "//input[@name='button2']")
    private WebElement tikla;
    public void tabClick(){
        tab.click();
    }
    public void customerID(){
        customer.sendKeys("46966");
    }
    public void selectComboBox(){
        Select secim = new Select(comboBox);
        secim.selectByVisibleText("Current");
    }
    public void miktar(){
        amount.sendKeys("10000");
    }
    public void tiklama(){
        tikla.click();
    }

    @FindBy(xpath = "//a[normalize-space()='Withdrawal']")
    private WebElement withDrawal;
    @FindBy(xpath = "//input[@name='accountno']")
    private WebElement accountNo;
    @FindBy(xpath = "//input[@name='ammount']")
    private WebElement tutar;
    @FindBy(xpath = "//input[@name='desc']")
    private WebElement aciklama;
    @FindBy(xpath = "//input[@name='AccSubmit']")
    private WebElement tus;

    public void withDrawalClick(){
        withDrawal.click();
    }
    public void accountNumber(){
        accountNo.sendKeys("137690");
    }
    public void price(){
        tutar.sendKeys("1000");
    }
    public void description(){
        aciklama.sendKeys("withdrawal");
    }
    public void tuslama(){
        tus.click();
    }
    @FindBy(xpath = "//a[normalize-space()='Fund Transfer']")
    private WebElement transfer;
    @FindBy(xpath = "//input[@name='payersaccount']")
    private WebElement sendAccNo;
    @FindBy(xpath = "//input[@name='payeeaccount']")
    private WebElement receiveAccNo;
    @FindBy(xpath = "//input[@name='ammount']")
    private WebElement transferMiktar;
    @FindBy(xpath = "//input[@name='desc']")
    private WebElement acikla;
    @FindBy(xpath = "//input[@name='AccSubmit']")
    private WebElement subm;
    public void moneyTransfer(){
        transfer.click();
    }
    public void sendAccountNo(){
        sendAccNo.sendKeys("137690");
    }
    public void receiveAccountNo(){
        receiveAccNo.sendKeys("137690");
    }
    public void transferAmount(){
        transferMiktar.sendKeys("10000");
    }
    public void descriptions(){
        acikla.sendKeys("Money Transfer");
    }
    public void submit(){
        subm.click();
    }
    @FindBy(xpath = "//td[normalize-space()='Manger Id : mngr589100']")
    private WebElement dogrulama;
    public void assertion(){
        Assert.assertTrue(dogrulama.isDisplayed());
    }

}
