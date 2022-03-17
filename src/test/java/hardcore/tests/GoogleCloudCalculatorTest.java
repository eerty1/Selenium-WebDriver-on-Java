package hardcore.tests;

import hardcore.service.GoogleCloudCalculatorTestMethods;
import hardcore.steps.StepClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class GoogleCloudCalculatorTest {
    public static WebDriver driver = new ChromeDriver();
    public static StepClass stepClass;
    public static GoogleCloudCalculatorTestMethods googleCloudCalculatorTestMethods;
    public static List<String> tabs;

    @BeforeMethod
    public void beforeMethodSetUp() {
        stepClass = new StepClass();
        googleCloudCalculatorTestMethods = new GoogleCloudCalculatorTestMethods(driver);
        stepClass.setupBrowser(driver, "https://cloud.google.com/");
        stepClass.openNewTab();
        stepClass.openCalculator(driver);
        stepClass.implementGoogleCalculatorSettings(driver);
        googleCloudCalculatorTestMethods.saveCalculatorCost();
        tabs = new LinkedList<>(driver.getWindowHandles());
        stepClass.switchTheBrowserToTheSecondTab(driver, tabs);
        stepClass.setupBrowser(driver, "https://yopmail.com/");
        stepClass.createTemporaryEmail(driver);
        stepClass.switchTheBrowserToTheFirstTab(driver, tabs);
        stepClass.inputTheEmailInCalculatorPage(driver);
        stepClass.switchTheBrowserToTheSecondTab(driver, tabs);
        stepClass.receiveTheEmail(driver);
        googleCloudCalculatorTestMethods.saveEmailCost();
    }

    @Test
    public void ifCostsFromEmailAndCalculatorEqual() {
        Assert.assertTrue(googleCloudCalculatorTestMethods.checkIfTheCostsSimilar());
    }

    @AfterTest
    public void afterMethodOptimization() {
        driver.quit();
        driver = null;
    }
}
