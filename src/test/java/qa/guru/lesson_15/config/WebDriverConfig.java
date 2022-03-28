package qa.guru.lesson_15.config;

import org.aeonbits.owner.Config;


@Config.Sources({"classpath:lesson_15/${typeProperties}.properties"})
public interface WebDriverConfig extends Config {

    @Key("browserName")
  //  @DefaultValue("Chrome")
    String browserName();

    @Key("browserVersion")
    String browserVersion();

    @Key("browserSize")
    String browserSize();

    @Key("remoteUrl")
    String remoteUrl();

    @Key("videoStorage")
    String videoStorage();

    @Key("timeoutVideoAttach")
    int timeoutVideoAttach();

    @Key("timeout")
    int timeout();


}
