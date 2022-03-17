package hurt_me_plenty.steps;

import hurt_me_plenty.pages.GoogleCloudCalculatorInitialSettings;
import hurt_me_plenty.pages.GoogleCloudHomePage;
import hurt_me_plenty.pages.GoogleCloudSearchResults;
import hurt_me_plenty.utility.BrowserSettings;
import org.openqa.selenium.WebDriver;

public class StepClass {
    public void openCalculator(WebDriver driver) {
        GoogleCloudHomePage googleCloudHomePage = new GoogleCloudHomePage(driver);
        GoogleCloudSearchResults googleCloudSearchResults = new GoogleCloudSearchResults(driver);
        googleCloudHomePage.searchInputAction();
        googleCloudSearchResults.enquiryAction();
    }

    public void implementGoogleCalculatorSettings(WebDriver driver) {
        GoogleCloudCalculatorInitialSettings googleCloudCalculatorInitialSettings = new GoogleCloudCalculatorInitialSettings(driver);
        googleCloudCalculatorInitialSettings.framesChange();
        googleCloudCalculatorInitialSettings.setNumberOfInstances();
        googleCloudCalculatorInitialSettings.setSeries();
        googleCloudCalculatorInitialSettings.setMachineType();
        googleCloudCalculatorInitialSettings.addGPU();
        googleCloudCalculatorInitialSettings.setGPUType();
        googleCloudCalculatorInitialSettings.setNumberOfGPUs();
        googleCloudCalculatorInitialSettings.setLocalSSD();
        googleCloudCalculatorInitialSettings.setDatacenterLocation();
        googleCloudCalculatorInitialSettings.setCommittedUsage();
        googleCloudCalculatorInitialSettings.addToEstimate();
    }

    public void setupBrowser(WebDriver driver, String URL) {
        BrowserSettings browserSettings = new BrowserSettings();
        browserSettings.retrieveURL(driver, URL);
        browserSettings.stretchBrowserToFullScreen(driver);
        browserSettings.makeTheProgramWaitTillThePageLoaded(driver);
    }
}
