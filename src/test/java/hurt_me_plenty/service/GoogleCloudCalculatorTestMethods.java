package hurt_me_plenty.service;

import hurt_me_plenty.pages.GoogleCloudCalculatorInitialSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleCloudCalculatorTestMethods {
    private final WebDriver DRIVER;

    public GoogleCloudCalculatorTestMethods(WebDriver DRIVER) {
        PageFactory.initElements(DRIVER, this);
        this.DRIVER = DRIVER;
    }

    public boolean machineClassCheck() {
        GoogleCloudCalculatorInitialSettings googleCloudCalculatorInitialSettings = new GoogleCloudCalculatorInitialSettings(DRIVER);
        return googleCloudCalculatorInitialSettings.takeMachineClassEstimateText().contains(googleCloudCalculatorInitialSettings.takeMachineClassText());
    }

    public boolean instanceTypeCheck() {
        GoogleCloudCalculatorInitialSettings googleCloudCalculatorInitialSettings = new GoogleCloudCalculatorInitialSettings(DRIVER);
        googleCloudCalculatorInitialSettings.setSeries();
        googleCloudCalculatorInitialSettings.setMachineType();
        return googleCloudCalculatorInitialSettings.takeInstanceTypeEstimateText().contains(googleCloudCalculatorInitialSettings.takeMachineTypeText());
    }

    public boolean locationCheck() {
        GoogleCloudCalculatorInitialSettings googleCloudCalculatorInitialSettings = new GoogleCloudCalculatorInitialSettings(DRIVER);
        return googleCloudCalculatorInitialSettings.takeLocationEstimateText().contains(googleCloudCalculatorInitialSettings.takeDataCenterLocationText());
    }

    public boolean localSSDCheck() {
        GoogleCloudCalculatorInitialSettings googleCloudCalculatorInitialSettings = new GoogleCloudCalculatorInitialSettings(DRIVER);
        googleCloudCalculatorInitialSettings.setSeries();
        googleCloudCalculatorInitialSettings.setMachineType();
        googleCloudCalculatorInitialSettings.addGPU();
        googleCloudCalculatorInitialSettings.setLocalSSD();
        return googleCloudCalculatorInitialSettings.takeLocalSSDEstimateText().contains(googleCloudCalculatorInitialSettings.takeLocalSSDText());
    }

    public boolean committedUsageCheck() {
        GoogleCloudCalculatorInitialSettings googleCloudCalculatorInitialSettings = new GoogleCloudCalculatorInitialSettings(DRIVER);
        googleCloudCalculatorInitialSettings.setCommittedUsage();
        return googleCloudCalculatorInitialSettings.takeCommittedUsageEstimateText().contains(googleCloudCalculatorInitialSettings.takeCommittedUsageText());
    }
    //Since some options are unable to be clicked (GPU Type NVIDIA tesla v100), I can't choose it during manual testing,It is possible to click only one option.
    //that is why I will test a bit different number and the last test should fail. :(
    //we have 40 sec waiter to click everything manually

    public boolean totalCostCheck() {
        GoogleCloudCalculatorInitialSettings googleCloudCalculatorInitialSettings = new GoogleCloudCalculatorInitialSettings(DRIVER);
        return googleCloudCalculatorInitialSettings.takeTotalCostAutomatedText().equals(googleCloudCalculatorInitialSettings.takeTotalCostManualText());
    }
}
