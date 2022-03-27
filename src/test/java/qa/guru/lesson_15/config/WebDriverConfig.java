package qa.guru.lesson_15.config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources({"classpath:${typeProperties}.properties"})
public interface WebDriverConfig extends Config {

    @Key("browserName")
    String browserName();

    @Key("browserVersion")
    String browserVersion();

    @Key("remoteUrl")
    String remoteUrl();

    @Key("videoStorage")
    String videoStorage();

    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();

    @Key("timeoutVideoAttach")
    int timeoutVideoAttach();

    @Key("timeout")
    int timeout();


}
