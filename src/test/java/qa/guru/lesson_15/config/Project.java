package qa.guru.lesson_15.config;

import org.aeonbits.owner.ConfigFactory;

public class Project {
    public static WebDriverConfig webConfig = ConfigFactory.create(WebDriverConfig.class);

    public static boolean isRemoteWebDriver() {
        return !webConfig.remoteUrl().equals("");
    }

    public static boolean isVideoOn() {
        return !webConfig.videoStorage().equals("");
    }

    public static String browserName() {
        return webConfig.browserName();
    }

}
