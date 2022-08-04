package com.ali.security;

import com.ali.security.cfg.Constants;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles(Constants.SPRING_PROFILE_TEST)
@SpringBootTest
class SecurityApplicationTests {

	@Test
	void contextLoads() {
	}

}
