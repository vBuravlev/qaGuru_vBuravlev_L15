package qa.guru.lesson_15;


import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.lesson_15.config.ApiConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiTest {

    @Test
    public void apiTests() {
        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(apiConfig.baseURL()).isEqualTo("https://www.github.ru/");
        assertThat(apiConfig.token()).isEqualTo("tokenGitHub");
    }
}
