package qa.guru.owner.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class LegacyWebDriverConfig {

    public String getBaseUrl() {
        String baseUrl = System.getProperty("baseUrl"); //читаем значение
        if (Objects.isNull(baseUrl)) { //обрабатываем дефолтное
            baseUrl = "https://github.com";
        }
        return baseUrl; //конвертируем результат
    }

    public Browser getBrowser() {
        String browser = System.getProperty("browser");//читаем значение
        if (Objects.isNull(browser)) {//обрабатываем дефолтное
            return Browser.CHROME;
        }
        return Browser.valueOf(browser);//конвертируем результат
    }

    public boolean isRemote() {
        String isRemote = System.getProperty("isRemote");//читаем значение
        if (Objects.isNull(isRemote)) {//обрабатываем дефолтное
            return false;
        }
        return Boolean.parseBoolean(isRemote);//конвертируем результат
    }

    public URL getRemoteUrl() {
        String remoteUrl = System.getProperty("remoteUrl");//читаем значение
        if (Objects.isNull(remoteUrl)) {//обрабатываем дефолтное
            return null;
        }
        try {//конвертируем результат
            return new URL(remoteUrl);
        } catch (MalformedURLException e) {
            return null;
        }
    }

}
