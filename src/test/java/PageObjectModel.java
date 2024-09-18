import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectModel extends BasePage {

    public PageObjectModel(WebDriver driver) {
        super(driver);
    }
    private By tabClick = By.xpath("//a[normalize-space()='New Customer']");
    private By name = By.xpath("//input[@name='name']");
    private By birthDay = By.id("dob");
    private By adress = By.xpath("//textarea[@name='addr']");
    private By city = By.xpath("//input[@name='city']");
    private By state = By.xpath("//input[@name='state']");
    private By pin = By.xpath("//input[@name='pinno']");
    private By phone = By.xpath("//input[@name='telephoneno']");
    private By mail = By.xpath("//input[@name='emailid']");
    private By password = By.xpath("//input[@name='password']");
    private By button = By.xpath("//input[@name='sub']");
    public void tab(){
        driver.findElement(tabClick).click();
    }
    public void isim(){
        driver.findElement(name).sendKeys("dogukan koylu");
    }
    public void birth(){
        driver.findElement(birthDay).sendKeys("13082000");
    }
    public void adres(){
        driver.findElement(adress).sendKeys("Osmangazi mh");
    }
    public void sehir(){
        driver.findElement(city).sendKeys("Istanbul");
    }
    public void ilce(){
        driver.findElement(state).sendKeys("Sancaktepe");
    }
    public void pinKodu(){
        driver.findElement(pin).sendKeys("123456");
    }
    public void phoneNumber(){
        driver.findElement(phone).sendKeys("05441111232");
    }
    public void mailAdress(){
        driver.findElement(mail).sendKeys("heyam4@marchub.com");
    }
    public void pass(){
        driver.findElement(password).sendKeys("123456");
    }
    public void buton(){
        driver.findElement(button).click();
    }


}
