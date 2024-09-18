import org.openqa.selenium.WebDriver;

public class BasePage {
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    protected WebDriver driver;
}
