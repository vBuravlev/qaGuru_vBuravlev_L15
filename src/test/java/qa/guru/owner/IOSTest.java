package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.config.IOSConfig;
import qa.guru.owner.config.MobileConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class IOSTest {

    @Test
    public void testIPhone() {
        IOSConfig config = ConfigFactory.create(IOSConfig.class, System.getProperties());

        assertThat(config.deviceName()).isEqualTo("iPhone Last");
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("11");
    }

}
