package ma.emsi.customerservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "customer.params")//to use this we need to use the annotation @EnableConfigurationProperties(CustomerConfigParams.class) in the main class
public record CustomerConfigParams(int x, int y) {
}
