package com.example.mcpserver.feign;

import com.example.mcpserver.config.FeignConfig;
import ma.emsi.billingservice.entities.Bill;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "billing-service",
        url = "http://localhost:8083",
        configuration = FeignConfig.class
)
public interface BillRestClient {

    @GetMapping("/bills/{id}")
    Bill getBillById(@PathVariable("id") Long id);

}