package com.example.mcpserver.config;

import com.example.mcpserver.security.KeycloakTokenProvider;
import feign.RequestInterceptor;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.context.SecurityContextHolder;

@Configuration
public class FeignConfig {

    private final KeycloakTokenProvider tokenProvider;

    public FeignConfig(KeycloakTokenProvider tokenProvider) {
        this.tokenProvider = tokenProvider;
    }

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            String accessToken = tokenProvider.getAccessToken();
            requestTemplate.header("Authorization", "Bearer " + accessToken);
        };
    }
}
