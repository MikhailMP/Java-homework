package test.java.Helpers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Screenshot {
    private final WebDriver driver;

    public Screenshot(WebDriver driver) {
        this.driver = driver;
    }

    public void makeScreenshot(ITestResult testResult) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot)driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        Path carentPath = Paths.get("");
        FileUtils.copyFile(src, new File(
                carentPath.toAbsolutePath().toString()
                + "\\screenshots\\"
                + testResult.getTestClass().getName()
                + "\\" + testResult.getMethod().getConstructorOrMethod().getName()
                + "\\.png"
        ));
    }
}
