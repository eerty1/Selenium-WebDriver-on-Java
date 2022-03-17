package bring_it_on.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasteBinExistingPastePage extends PasteBinAbstractContainer {
    private static final String XPATH_FOR_PASTE_NAME = "//div[@class='info-top']//h1";
    private static final String XPATH_FOR_BASH_SYNTAX_FRAME = "//div[@class='left']//a[@class='btn -small h_800']";
    private static final String XPATH_FOR_PASTE_FORM_INFORMATION = "//textarea[@class='textarea']";
    private final WebDriver DRIVER;

    @FindBy(xpath = XPATH_FOR_PASTE_NAME)
    private WebElement pasteName;

    @FindBy(xpath = XPATH_FOR_BASH_SYNTAX_FRAME)
    private WebElement bashSyntaxFrame;

    @FindBy(xpath = XPATH_FOR_PASTE_FORM_INFORMATION)
    private WebElement pasteFormInformation;


    public PasteBinExistingPastePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        DRIVER = driver;
    }

    public String takePasteNameText() {
        makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_PASTE_NAME);
        return pasteName.getText();
    }

    public String takeBashSyntaxFrameText() {
        makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_BASH_SYNTAX_FRAME);
        return bashSyntaxFrame.getText();
    }

    public String takePasteFormInformationText() {
        makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_PASTE_FORM_INFORMATION);
        return pasteFormInformation.getText();
    }
}
