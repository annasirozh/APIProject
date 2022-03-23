package com.it_academy.onliner.framework;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    private final WebDriver driver;
    private WebDriverDiscovery webDriverDiscovery;

    public BasePage(){
        webDriverDiscovery = new WebDriverDiscovery();
        driver = webDriverDiscovery.getWebDriver();
    }
    public void navigate(String url) {
        driver.get(url);
    }

    public void closeBrowser() {
        try {
            driver.quit();
        } catch (Exception e) {
            System.out.println("Close BROWSER ERROR");
        }
    }
}
