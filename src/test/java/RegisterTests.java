import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MainPage;
import pages.RegisterPage;


public class RegisterTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();
    MainPage mainPage = new MainPage();

    @Test(description = "Kullanici olusturma kontrolu")
    public void registerTest() {
        String userName = createUserName();

        homePage.clickLoginButton();
        mainPage.registerWithEmail();

        driver.get("https://academy.patika.dev/tr");
        RegisterPage registerPage = new RegisterPage();

        registerPage.enterFirstName("test")
                .enterLastName("test")
                .enterPassword("Test.123")
                .enterConfirmPassword("Test.123")
                .checkTermsAndConditions()
                .clickRegisterButton();

//        HomePage homePage = new HomePage();
//        homePage.registerControl("Kayıt başarılı");
    }
}
