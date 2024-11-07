import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MainPage;


public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MainPage mainPage = new MainPage();



    @Test(description = "Basarili kullanici girisi")
    public void LoginSuccesfullControl(){
        loginPage.enterEmail(email)
                .enterPassword(password)
                .clickLoginButton();
    }
    @Test
    public void loginTest() {
        driver.get("https://academy.patika.dev/tr");
        LoginPage loginPage = new LoginPage();

        loginPage.enterEmail(email)
                .enterPassword(password)
                .clickLoginButton();

        HomePage homePage = new HomePage();
        homePage.accountControl("testuser");
    }
}
