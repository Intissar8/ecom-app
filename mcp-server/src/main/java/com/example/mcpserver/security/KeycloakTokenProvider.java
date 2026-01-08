package com.example.mcpserver.security;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.Map;

@Component
public class KeycloakTokenProvider {

    private final WebClient webClient = WebClient.builder().build();

    private final String clientId = "mcp-client";
    private final String clientSecret = "AbFVNIpuHHGjkmKzgTCMdoNjIOTnrq6z"; // replace with your actual secret
    private final String tokenUrl = "http://localhost:8080/realms/Intissar-realm/protocol/openid-connect/token";

    public String getAccessToken() {
        var response = webClient.post()
                .uri(tokenUrl)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .bodyValue("grant_type=client_credentials&client_id=" + clientId + "&client_secret=" + clientSecret)
                .retrieve()
                .bodyToMono(Map.class)
                .block();

        return (String) response.get("access_token");
    }
}
