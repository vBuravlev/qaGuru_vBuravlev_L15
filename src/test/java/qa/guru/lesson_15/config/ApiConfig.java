package qa.guru.lesson_15.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/tmp/api.properties",
        "classpath:lesson_15/api.properties"
})
public interface ApiConfig extends Config {
    @Key("baseURL")
    String baseURL();

    @Key("token")
    String token();

}
