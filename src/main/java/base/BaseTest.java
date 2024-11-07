package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BaseLibrary{

    @BeforeMethod
    public void openBrowser() {

        driver = new ChromeDriver();
        driver.get("https://academy.patika.dev/tr");

    }

//    @AfterMethod
//    public void tearDown() {
//
//        driver.quit();
//    }
}
