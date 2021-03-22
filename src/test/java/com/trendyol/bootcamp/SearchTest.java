package com.trendyol.bootcamp;

import com.trendyol.bootcamp.pages.HomePage;
import com.trendyol.bootcamp.pages.SearchResultPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchTest extends BaseTest {

    @Test
    public void shouldSearch() {
        String keyword = "telefon";
        HomePage homePage = new HomePage(webDriver);
        SearchResultPage searchResultPage = homePage.search(keyword);

        String resultText = searchResultPage.getResultText();
        assertEquals(resultText, keyword);
    }

    @Test
    public void shouldDisplayRecommendationsOnSearchBox() {
        String keyword = "telefon";
        HomePage homePage = new HomePage(webDriver);
        homePage.enterSearchKeyword(keyword);

        boolean searchRecommendations = homePage.isSuggestionDisplayed();
        assertEquals(searchRecommendations, true);
    }
}
