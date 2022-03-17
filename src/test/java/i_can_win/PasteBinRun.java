package i_can_win;

import i_can_win.steps.StepClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasteBinRun {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        StepClass stepClass = new StepClass();
        stepClass.setupBrowser(driver, "https://pastebin.com");
        stepClass.runPasteCreatingChain(driver);
    }
}
