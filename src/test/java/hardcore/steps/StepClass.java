package hardcore.steps;

import hardcore.calculator_pages.GoogleCloudCalculatorInitialSettings;
import hardcore.calculator_pages.GoogleCloudHomePage;
import hardcore.calculator_pages.GoogleCloudSearchResults;
import hardcore.service.GoogleCloudCalculatorTestMethods;
import hardcore.utility.KeyboardImitations;
import hardcore.utility.BrowserSettings;
import hardcore.yopbox_pages.YopMailBox;
import hardcore.yopbox_pages.YopMailGeneratedMailPage;
import hardcore.yopbox_pages.YopMailHomePage;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class StepClass {
    public void openCalculator(WebDriver driver) {
        GoogleCloudHomePage googleCloudHomePage = new GoogleCloudHomePage(driver);
        GoogleCloudSearchResults googleCloudSearchResults = new GoogleCloudSearchResults(driver);
        googleCloudHomePage.searchInputAction();
        googleCloudSearchResults.enquiryAction();
    }

    public void implementGoogleCalculatorSettings(WebDriver driver) {
        GoogleCloudCalculatorInitialSettings googleCloudCalculatorInitialSettings = new GoogleCloudCalculatorInitialSettings(driver);
        GoogleCloudCalculatorTestMethods googleCloudCalculatorTestMethods = new GoogleCloudCalculatorTestMethods(driver);
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
        googleCloudCalculatorTestMethods.saveCalculatorCost();
    }

    public void createTemporaryEmail(WebDriver driver) {
        YopMailHomePage yopMailHomePage = new YopMailHomePage(driver);
        YopMailGeneratedMailPage yopMailGeneratedMailPage = new YopMailGeneratedMailPage(driver);
        yopMailHomePage.clickButtonCreateRandomEmail();
        yopMailGeneratedMailPage.generateEmailAndOpenBox();
    }

    public void inputTheEmailInCalculatorPage(WebDriver driver) {
        GoogleCloudCalculatorInitialSettings googleCloudCalculatorInitialSettings = new GoogleCloudCalculatorInitialSettings(driver);
        googleCloudCalculatorInitialSettings.framesChange();
        googleCloudCalculatorInitialSettings.emailButtonClick();
        googleCloudCalculatorInitialSettings.fillTheEmailInputAndSendEmail();
    }

    public void receiveTheEmail(WebDriver driver) {
        YopMailBox yopMailBox = new YopMailBox(driver);
        yopMailBox.refreshButtonClick();
        yopMailBox.framesChange();
    }

    public void openNewTab() {
        KeyboardImitations keyboardImitations = new KeyboardImitations();
        keyboardImitations.openNewTab();
        keyboardImitations.switchToFirstTab();
    }

    public void switchTheBrowserToTheSecondTab(WebDriver driver, List<String> tabsContainer) {
        KeyboardImitations keyboardImitations = new KeyboardImitations();
        keyboardImitations.switchToSecondTab();
        driver.switchTo().window(tabsContainer.get(1));
    }

    public void switchTheBrowserToTheFirstTab(WebDriver driver, List<String> tabsContainer) {
        KeyboardImitations keyboardImitations = new KeyboardImitations();
        keyboardImitations.switchToFirstTab();
        driver.switchTo().window(tabsContainer.get(0));
    }

    public void setupBrowser(WebDriver driver, String URL) {
        BrowserSettings browserSettings = new BrowserSettings();
        browserSettings.retrieveURL(driver, URL);
        browserSettings.stretchBrowserToFullScreen(driver);
        browserSettings.makeTheProgramWaitTillThePageLoaded(driver);
    }
}
