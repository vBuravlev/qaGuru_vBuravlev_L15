package qa.guru.lesson_15.helpers;

import org.aeonbits.owner.ConfigFactory;
import com.codeborne.selenide.Configuration;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import qa.guru.lesson_15.config.Project;
import qa.guru.lesson_15.config.WebDriverConfig;

public class DriverConfig {

    public static void configure() {
    WebDriverConfig webConfig = ConfigFactory.create(WebDriverConfig.class);

    Configuration.browser = webConfig.browserName();
    Configuration.browserVersion = webConfig.browserVersion();
    Configuration.timeout = webConfig.timeout();

    DesiredCapabilities capabilities = new DesiredCapabilities();
    ChromeOptions chromeOptions = new ChromeOptions();
    FirefoxOptions firefoxOptions = new FirefoxOptions();
    OperaOptions operaOptions = new OperaOptions();


        switch (Project.webConfig.browserName()) {
        case "chrome":
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("--disable-infobars");
            chromeOptions.addArguments("--disable-popup-blocking");
            chromeOptions.addArguments("--disable-notifications");
            chromeOptions.addArguments("--lang=en-en");
            capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
            break;
        case "firefox":
            firefoxOptions.addArguments("--fast-start");
            firefoxOptions.addArguments("--enable-logging");
            firefoxOptions.addArguments("--ignore-certificate-errors");
            firefoxOptions.addArguments("--disable-gpu");
            capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, firefoxOptions);
            break;
        case "opera":
            operaOptions.addArguments("--disable-gpu");
            capabilities.setCapability(OperaOptions.CAPABILITY, operaOptions);
            break;
    }

        if (Project.isRemoteWebDriver()) {
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.remote = webConfig.remoteUrl();
    }

    Configuration.browserCapabilities = capabilities;

}
}
