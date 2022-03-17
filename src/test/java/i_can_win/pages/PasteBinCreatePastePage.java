package i_can_win.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PasteBinCreatePastePage extends PasteBinAbstractContainer {
    private static final String XPATH_FOR_PAST_FORM_AREA = "//form[@class='js-create-form form-horizontal']//textarea[@class='textarea -form js-paste-code']";
    private static final String XPATH_FOR_PASTE_EXPIRATION_SELECTOR = "//span[@class='select2-selection__rendered' and @id='select2-postform-expiration-container' and contains(text(), 'Never')]";
    private static final String XPATH_FOR_TEN_MINUTES = "//li[text()='10 Minutes']";
    private static final String XPATH_FOR_PASTE_NAME_INPUT = "//input[@name='PostForm[name]']";
    private static final String XPATH_FOR_CREATE_PASTE_BUTTON = "//button[text()='Create New Paste']";
    private static final String XPATH_FOR_ADVERTISEMENT_FRAME = "//iframe[@frameborder='0' and @title='3rd party ad content' and @marginwidth='0' and @marginheight='0' and @width='970' and @height='90']";
    private static final String CSS_SELECTOR_FOR_CROSS_IN_ADVERTISEMENT_FRAME = "#hideSlideBanner > svg";
    private final WebDriver DRIVER;

    @FindBy(xpath = XPATH_FOR_PAST_FORM_AREA)
    private WebElement pastFormArea;

    @FindBy(xpath = XPATH_FOR_PASTE_EXPIRATION_SELECTOR)
    private WebElement pasteExpirationSelector;

    @FindBy(xpath = XPATH_FOR_TEN_MINUTES)
    private WebElement tenMinutes;

    @FindBy(xpath = XPATH_FOR_PASTE_NAME_INPUT)
    private WebElement pasteNameInput;

    @FindBy(xpath = XPATH_FOR_CREATE_PASTE_BUTTON)
    private WebElement createPasteButton;

    @FindBy(xpath = XPATH_FOR_ADVERTISEMENT_FRAME)
    private WebElement advertisementFrame;

    @FindBy(css = CSS_SELECTOR_FOR_CROSS_IN_ADVERTISEMENT_FRAME)
    private WebElement crossInAdvertisementFrame;

    public PasteBinCreatePastePage(WebDriver DRIVER) {
        PageFactory.initElements(DRIVER, this);
        this.DRIVER = DRIVER;
    }

    public PasteBinCreatePastePage fillPastForm() {
        makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_PAST_FORM_AREA);
        pastFormArea.sendKeys("Hello from WebDriver");
        return this;
    }

    public PasteBinCreatePastePage closeAdvertisementFrame() {
        new WebDriverWait(DRIVER, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.cssSelector(CSS_SELECTOR_FOR_CROSS_IN_ADVERTISEMENT_FRAME)));
        crossInAdvertisementFrame.click();
        return this;
    }

    public PasteBinCreatePastePage makePasteExpireAfter10Minutes() {
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_PASTE_EXPIRATION_SELECTOR);
        pasteExpirationSelector.click();
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_TEN_MINUTES);
        tenMinutes.click();
        return this;
    }

    public PasteBinCreatePastePage fillPostName() {
        makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_PASTE_NAME_INPUT);
        pasteNameInput.sendKeys("helloweb");
        return this;
    }

    public PasteBinCreatePastePage createPaste() {
        makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_CREATE_PASTE_BUTTON);
        createPasteButton.click();
        return this;
    }
}
