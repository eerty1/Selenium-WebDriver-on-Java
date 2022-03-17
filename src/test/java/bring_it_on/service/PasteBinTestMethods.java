package bring_it_on.service;

import bring_it_on.pages.PasteBinExistingPastePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PasteBinTestMethods {
    private final WebDriver DRIVER;

    public PasteBinTestMethods(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.DRIVER = driver;
    }

    public boolean ifTitleEqualsPasteName() {
        PasteBinExistingPastePage pasteBinExistingPastePage = new PasteBinExistingPastePage(DRIVER);
        System.out.println(DRIVER.getTitle());
        System.out.println(pasteBinExistingPastePage.takePasteNameText());
        return DRIVER.getTitle().contains(pasteBinExistingPastePage.takePasteNameText());
    }

    public boolean ifSyntaxEqualsBash() {
        PasteBinExistingPastePage pasteBinExistingPastePage = new PasteBinExistingPastePage(DRIVER);
        return pasteBinExistingPastePage.takeBashSyntaxFrameText().equals(TestDataReader.readProperties("expected.syntax.highlighting"));
    }

    public boolean ifPasteTextEqualsDataForPost() {
        PasteBinExistingPastePage pasteBinExistingPastePage = new PasteBinExistingPastePage(DRIVER);
        return pasteBinExistingPastePage.takePasteFormInformationText().equals(TestDataReader.readProperties("data.for.past.form"));
    }
}



