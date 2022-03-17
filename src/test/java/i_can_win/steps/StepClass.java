package i_can_win.steps;

import i_can_win.pages.PasteBinCreatePastePage;
import i_can_win.utility.BrowserSettings;
import org.openqa.selenium.WebDriver;

public class StepClass {
    public void runPasteCreatingChain(WebDriver driver) {
        PasteBinCreatePastePage pasteBinCreatePastePage = new PasteBinCreatePastePage(driver);
        pasteBinCreatePastePage.fillPastForm();
        pasteBinCreatePastePage.closeAdvertisementFrame();
        pasteBinCreatePastePage.makePasteExpireAfter10Minutes();
        pasteBinCreatePastePage.fillPostName();
        pasteBinCreatePastePage.createPaste();
    }

    public void setupBrowser(WebDriver driver, String URL) {
        BrowserSettings browserSettings = new BrowserSettings();
        browserSettings.retrieveURL(driver, URL);
        browserSettings.stretchBrowserToFullScreen(driver);
        browserSettings.makeTheProgramWaitTillThePageLoaded(driver);
    }
}
