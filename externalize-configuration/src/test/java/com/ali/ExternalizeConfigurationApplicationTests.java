package com.ali;

import com.ali.cfg.Constants;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(Constants.SPRING_PROFILE_TEST)
class ExternalizeConfigurationApplicationTests {

    @Test
    void contextLoads() {
        Assertions.assertThat(2 + 2).isEqualTo(4);
    }

}
