import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestClass {
    @Test
    public void webdriverSafari(){
        System.setProperty("webdriver.gecko.driver","/Users/mariacamilamarin/geckodriver");

        WebDriver driver = new SafariDriver();
        driver.get("https://testingenesp.github.io");
        driver.quit();
    }
}
