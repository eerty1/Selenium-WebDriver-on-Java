package bring_it_on.utility;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BrowserSettings {
    public void giveUrl(WebDriver driver, String link) {
        driver.get(link);
    }

    public void stretchBrowserToFullScreen(WebDriver driver) {
        driver.manage().window().maximize();
    }

    public void makeTheProgramWaitTillThePageLoaded(WebDriver driver) {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }
}
