package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BaseTest {

    @Step("Adinizi gir")
    public RegisterPage enterFirstName(String firstName) {
        WebElement usernameField = driver.findElement(By.id("firstName"));
        usernameField.sendKeys(firstName);
        return this;
    }

    @Step("Soyadini gir")
    public RegisterPage enterLastName (String lastName) {
        WebElement usernameField = driver.findElement(By.id("lastName"));
        usernameField.sendKeys(lastName);
        return this;
    }

    @Step("Email gir")
    public RegisterPage enterEmail(String email) {
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(email);
        return this;
    }
    @Step("Şifre gir")
    public RegisterPage enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        return this;
    }

    @Step("Şifreyi onaylayı gir")
    public RegisterPage enterConfirmPassword(String confirmPassword) {
        WebElement passwordField = driver.findElement(By.id("confirmPassword"));
        passwordField.sendKeys(confirmPassword);
        return this;
    }

    @Step("Şartlar ve koşullar kutucuğunu işaretle")
    public RegisterPage checkTermsAndConditions() {
        WebElement checkbox = driver.findElement(By.cssSelector("[class='chakra-checkbox__control css-yp7h1x']"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
        return this;
    }
    @Step("Kayıt ol butonuna tıkla")
    public HomePage clickRegisterButton() {
        WebElement registerButton = driver.findElement(By.cssSelector("[class='chakra-button css-1pheyt2']"));
        registerButton.click();
        return new HomePage();
    }
}
