package bring_it_on.tests;

import bring_it_on.service.PasteBinTestMethods;
import bring_it_on.steps.StepClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PasteBinTests {
    private static StepClass stepClass;
    private static PasteBinTestMethods pasteBinPageToTest;
    private WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void beforeTestsSetUp() {
        stepClass = new StepClass();
        pasteBinPageToTest = new PasteBinTestMethods(driver);
        stepClass.setupBrowser(driver, "https://pastebin.com");
        stepClass.runPasteCreatingChain(driver);
    }

    @Test
    public void pasteNameEqualsTitleCheckTest() {
        Assert.assertTrue(pasteBinPageToTest.ifTitleEqualsPasteName());
    }

    @Test
    public void pasteSyntaxEqualsBashSyntaxCheckTest() {
        Assert.assertTrue(pasteBinPageToTest.ifSyntaxEqualsBash());
    }

    @Test
    public void pasteTextEqualsTypedTextCheckTest() {
        Assert.assertTrue(pasteBinPageToTest.ifPasteTextEqualsDataForPost());
    }

    @AfterTest
    public void afterTestsOptimization() {
        driver.quit();
        driver = null;
    }
}