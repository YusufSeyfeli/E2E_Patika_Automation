package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseTest {

    @Step("E-mail gir")
    public LoginPage enterEmail(String email) {
        WebElement usernameField = driver.findElement(By.id("email"));
        usernameField.sendKeys(email);
        return this;
    }

    @Step("Şifre gir")
    public LoginPage enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        return this;
    }

    @Step("Giriş yap butonuna tıkla")
    public HomePage clickLoginButton() {
        WebElement loginButton = driver.findElement(By.cssSelector("[class='chakra-button css-1xrc02c']"));
        loginButton.click();
        return new HomePage();
    }
}
