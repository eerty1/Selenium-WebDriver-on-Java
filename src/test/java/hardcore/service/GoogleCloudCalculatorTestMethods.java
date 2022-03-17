package hardcore.service;

import hardcore.calculator_pages.GoogleCalculatorAbstractContainer;
import hardcore.calculator_pages.GoogleCloudCalculatorInitialSettings;
import hardcore.yopbox_pages.YopMailBox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class GoogleCloudCalculatorTestMethods extends GoogleCalculatorAbstractContainer {
    private final WebDriver DRIVER;
    private final List<String> costsContainer = new ArrayList<>();

    public GoogleCloudCalculatorTestMethods(WebDriver DRIVER) {
        this.DRIVER = DRIVER;
        PageFactory.initElements(DRIVER, this);
    }

    public void saveCalculatorCost() {
        GoogleCloudCalculatorInitialSettings googleCloudCalculatorInitialSettings = new GoogleCloudCalculatorInitialSettings(DRIVER);
        costsContainer.add(googleCloudCalculatorInitialSettings.takeTotalEstimateText());
    }

    public void saveEmailCost() {
        YopMailBox yopMailBox = new YopMailBox(DRIVER);
        costsContainer.add(yopMailBox.takeEstimateCostEmail());
    }

    public boolean checkIfTheCostsSimilar() {
        System.out.println(costsContainer);
        return costsContainer.get(0).contains(costsContainer.get(1));
    }
}