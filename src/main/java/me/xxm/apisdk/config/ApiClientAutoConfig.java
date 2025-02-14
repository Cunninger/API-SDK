package me.xxm.apisdk.config;

import me.xxm.apisdk.client.ApiClient;
import me.xxm.apisdk.service.ApiService;
import me.xxm.apisdk.service.impi.ApiServiceImpl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@EnableConfigurationProperties(ApiClient.class)
public class ApiClientAutoConfig {

    @Bean
    public ApiService apiService() {
        return new ApiServiceImpl();
    }

    @Bean

    public ApiClient apiClient() {
        return new ApiClient();
    }



}
