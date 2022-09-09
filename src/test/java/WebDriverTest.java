import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class WebDriverTest {
    private WebDriver driver;

    @BeforeAll
    static void setUpAll(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }
     @AfterEach
    void tearsDown(){
        driver.quit();
        driver=null;
     }
     @Test
    void test(){
        driver.get("http://localhost:9999");
         List<WebElement> elements = driver.findElements(By.className("input__control"));
         elements.get(0).sendKeys("Богачкина Екатерина");
         elements.get(1).sendKeys("+79192586947");

       // driver.findElement().sendKeys("Богачкина Екатерина");
       // driver.findElement().sendKeys("+79192586947");
        //driver.findElement().click();
       // driver.findElement().click();
       // driver.findElement().getText();

     }


}
