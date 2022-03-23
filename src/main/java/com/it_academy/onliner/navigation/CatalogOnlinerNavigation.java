package com.it_academy.onliner.navigation;

import com.it_academy.onliner.pageobject.CatalogOnlinerPage;

public class CatalogOnlinerNavigation {
    public static void navigateToOnlinerHomePage() {
        new CatalogOnlinerPage().navigate("https://catalog.onliner.by/sushivesla");
    }
}
