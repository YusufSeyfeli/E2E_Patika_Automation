package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BaseTest {


    @Step("Giriş yap butonuna tıkla")
    public HomePage clickLoginButton() {
        WebElement loginButton = driver.findElement(By.cssSelector("[class='chakra-button css-hhul2h']"));
        loginButton.click();
        return new HomePage();
    }

    @Step("Giriş yap butonuna tıkla")
    public HomePage registerWithEmail() {
        WebElement loginButton = driver.findElement(By.cssSelector("[class='chakra-button css-1onctbh']"));
        loginButton.click();
        return new HomePage();
    }
}
