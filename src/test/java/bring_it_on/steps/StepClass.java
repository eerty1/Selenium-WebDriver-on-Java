package bring_it_on.steps;

import bring_it_on.pages.PasteBinCreatePastePage;
import bring_it_on.utility.BrowserSettings;
import org.openqa.selenium.WebDriver;

public class StepClass {

    public void runPasteCreatingChain(WebDriver driver) {
        PasteBinCreatePastePage pasteBinCreatePastePage = new PasteBinCreatePastePage(driver);
        pasteBinCreatePastePage.fillPastForm();
        pasteBinCreatePastePage.closeAdvertisementFrame();
        pasteBinCreatePastePage.setSyntaxHighlighting();
        pasteBinCreatePastePage.makePasteExpireAfter10Minutes();
        pasteBinCreatePastePage.fillPostName();
        pasteBinCreatePastePage.createPaste();
    }

    public void setupBrowser(WebDriver driver, String URL) {
        BrowserSettings browserSettings = new BrowserSettings();
        browserSettings.giveUrl(driver, URL);
        browserSettings.stretchBrowserToFullScreen(driver);
        browserSettings.makeTheProgramWaitTillThePageLoaded(driver);
    }
}
