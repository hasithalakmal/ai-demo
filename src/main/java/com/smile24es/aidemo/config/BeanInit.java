package com.smile24es.aidemo.config;

import com.smile24es.aidemo.repository.OpenAiClient;
import feign.Feign;
import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanInit {


    @Bean
    public OpenAiClient openAiClient() {
        OpenAiClient openAiClient = Feign.builder().encoder(new SpringFormEncoder())
            .target(OpenAiClient.class, "https://hasitest1.free.beeceptor.com/");

        return openAiClient;
    }
}
