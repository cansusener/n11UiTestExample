package tests;

import com.n11.pages.HomePage;
import com.n11.pages.SearchBoxResultPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchUiTests extends BaseTest {

    WebDriver driver;

    @Test
    public void shouldSearchInSıte(){
        String keyword="elbise";
        HomePage homePage = new HomePage(driver);
        homePage.searchToBox(keyword);

        SearchBoxResultPage searchBoxResultPage = new SearchBoxResultPage(driver);
        String result = searchBoxResultPage.getsearchResult();
        Assert.assertEquals(result,keyword);
    }

}
