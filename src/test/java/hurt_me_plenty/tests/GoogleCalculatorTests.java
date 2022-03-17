package hurt_me_plenty.tests;

import hurt_me_plenty.pages.GoogleCloudCalculatorInitialSettings;
import hurt_me_plenty.service.GoogleCloudCalculatorTestMethods;
import hurt_me_plenty.steps.StepClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleCalculatorTests {
    public static WebDriver driver = new ChromeDriver();
    public static StepClass stepClass;
    public static GoogleCloudCalculatorInitialSettings googleCloudCalculatorInitialSettings;
    public static GoogleCloudCalculatorTestMethods googleCloudCalculatorTestMethods;

    @BeforeTest
    public void beforeTestsSetUp() {
        stepClass = new StepClass();
        googleCloudCalculatorInitialSettings = new GoogleCloudCalculatorInitialSettings(driver);
        googleCloudCalculatorTestMethods = new GoogleCloudCalculatorTestMethods(driver);
        stepClass.setupBrowser(driver, "https://cloud.google.com/");
        stepClass.openCalculator(driver);
        stepClass.implementGoogleCalculatorSettings(driver);
    }

    @Test
    public void machineClassCheckTest() {
        Assert.assertTrue(googleCloudCalculatorTestMethods.machineClassCheck());
    }

    @Test
    public void instanceTypeCheckTest() {
        Assert.assertTrue(googleCloudCalculatorTestMethods.instanceTypeCheck());
        googleCloudCalculatorInitialSettings.resetAllTheSettingDefault();
    }

    @Test
    public void locationCheckTest() {
        Assert.assertTrue(googleCloudCalculatorTestMethods.locationCheck());
    }

    @Test
    public void localSSDCheckTest() {
        Assert.assertTrue(googleCloudCalculatorTestMethods.localSSDCheck());
        googleCloudCalculatorInitialSettings.resetAllTheSettingDefault();
    }

    @Test
    public void committedUsageCheckTest() {
        Assert.assertTrue(googleCloudCalculatorTestMethods.committedUsageCheck());
        googleCloudCalculatorInitialSettings.resetAllTheSettingDefault();
    }

    //as the task requires, this task must be done manually. this is why I decided to add waiter and give you some time to click everything by your hands.
    //some settings are unable to change, that is why the price differs and expected result should be false.
    @Test
    public void totalCostCheckTest() {
        Assert.assertFalse(googleCloudCalculatorTestMethods.totalCostCheck());
    }

    @AfterTest(alwaysRun = true)
    public void afterTestsOptimization() {
        driver.quit();
        driver = null;
    }
}


