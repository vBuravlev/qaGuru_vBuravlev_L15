package qa.guru.lesson_15.config;

import org.aeonbits.owner.ConfigFactory;

public class Project {
    public static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static boolean isRemoteWebDriver() {
        return !config.remoteUrl().equals("");
    }

    public static boolean isVideoOn() {
        return !config.videoStorage().equals("");
    }

}
