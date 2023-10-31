package com.fastcampus.projectboardadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ConfigurationPropertiesScan
@SpringBootTest
class FastCampusProjectBoardAdminApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(FastCampusProjectBoardAdminApplication.class, args);
    }
}
