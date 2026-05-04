package com.back.jsb_jpa.global.initData;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseInitData {
    @Bean
    ApplicationRunner baseInitDataApplicationRunner() {
        return args -> {

        };
    }

    // 축약 전
//    @Bean
//    ApplicationRunner baseInitDataApplicationRunner2() {
//        return new ApplicationRunner() {
//            @Override
//            public void run(ApplicationArguments args) throws Exception {
//
//            }
//        };
//    }
}
