package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.config.Browser;
import qa.guru.owner.config.TypeConfig;

import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

public class TypeConfigTest {

    @Test
    public void testInteger() {
        System.setProperty("integer", "10");

        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getInteger()).isEqualTo(10);
    }

    @Test
    public void testDouble() {
        System.setProperty("double", "10.10");

        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getDouble()).isEqualTo(10.10);
    }

    @Test
    public void testBoolean() {
        System.setProperty("boolean", "false");

        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getBoolean()).isEqualTo(false);
    }

    @Test
    public void testEnum() {
        System.setProperty("enum", "FIREFOX");

        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getEnum()).isEqualTo(Browser.FIREFOX);
    }

    @Test
    public void testUrl() throws Exception {
        System.setProperty("url", "https://github.com");

        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getUrl()).isEqualTo(new URL("https://github.com"));
    }
}
