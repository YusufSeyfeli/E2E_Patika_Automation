package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage extends BaseTest {
    @Step("Kullanici kontrolu")
    public HomePage accountControl(String value) {

        String Text = driver.findElement(By.cssSelector("[class='chakra-button css-zrx565']")).getText();
        Assert.assertEquals(value,Text);

        return this;
    }

    @Step("Giriş yap butonuna tıkla")
    public HomePage clickLoginButton() {
        WebElement loginButton = driver.findElement(By.cssSelector("[class='chakra-button css-zrx565']"));
        loginButton.click();
        return new HomePage();
    }

    @Step("Kullanici olusturma kontrolu")
    public HomePage registerControl(String value) {

        String Text = driver.findElement(By.cssSelector("[class='title']")).getText();
        Assert.assertEquals(value,Text);

        return this;
    }

}
