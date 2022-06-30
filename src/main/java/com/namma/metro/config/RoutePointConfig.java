package com.namma.metro.config;

import java.time.Duration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RoutePointConfig {
    

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
    return builder
            .setConnectTimeout(Duration.ofMillis(60000))
            .setReadTimeout(Duration.ofMillis(60000))
            .build();
    }
    
/*     private ClientHttpRequestFactory getClientHttpRequestFactory() {
        int timeout = 5000;
        RequestConfig config = RequestConfig.custom()
          .setConnectTimeout(timeout)
          .setConnectionRequestTimeout(timeout)
          .setSocketTimeout(timeout)
          .build();
        CloseableHttpClient client = HttpClientBuilder
          .create()
          .setDefaultRequestConfig(config)
          .build();
        return new HttpComponentsClientHttpRequestFactory(client);
    } */
}
