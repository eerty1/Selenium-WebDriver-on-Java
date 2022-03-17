package hardcore.calculator_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleCloudSearchResults extends GoogleCalculatorAbstractContainer {
    private final WebDriver DRIVER;

    @FindBy(xpath = "//a[@class='gs-title']")
    private WebElement requiredEnquiry;

    public GoogleCloudSearchResults(WebDriver DRIVER) {
        PageFactory.initElements(DRIVER, this);
        this.DRIVER = DRIVER;
    }

    public GoogleCloudCalculatorInitialSettings enquiryAction() {
        makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, "//a[@class='gs-title']");
        requiredEnquiry.click();
        return new GoogleCloudCalculatorInitialSettings(DRIVER);
    }
}
