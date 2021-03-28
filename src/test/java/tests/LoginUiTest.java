package tests;

import com.n11.pages.HomePage;
import com.n11.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import user.User;
import user.UsersPool;

public class LoginUiTest {

WebDriver driver;
    @Test
    public void shoulLoginInSıte(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.getLoginPage();
        loginPage.login("xyx@gmail.com","123456");
        // user ve userpool ile de yapilabildi. Ben kullanmadım.
        // User user= UserPool.getUser1();

        String accountText= homePage.getAccountTitleText();
        Assert.assertEquals(accountText,"Cansu Şener");
    }


}
