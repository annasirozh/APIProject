package com.it_academy.tests.onliner;

import com.it_academy.onliner.framework.BasePage;
import com.it_academy.onliner.navigation.CatalogOnlinerNavigation;
import com.it_academy.onliner.pageobject.CatalogOnlinerPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    private CatalogOnlinerPage catalogOnlinerPage = new CatalogOnlinerPage();

    @BeforeAll
    public void navigateToOnliner () {
        CatalogOnlinerNavigation.navigateToOnlinerHomePage();

    }
    @AfterAll
    public void closeBrowser() {catalogOnlinerPage.closeBrowser();}
}

