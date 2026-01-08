package com.example.mcpserver.tools;

import com.example.mcpserver.feign.BillRestClient;
import ma.emsi.billingservice.entities.Bill;
import org.springaicommunity.mcp.annotation.McpArg;
import org.springaicommunity.mcp.annotation.McpTool;
import org.springframework.stereotype.Component;

@Component
public class BillingMcpTools {

    private final BillRestClient billRestClient;

    public BillingMcpTools(BillRestClient billRestClient) {
        this.billRestClient = billRestClient;
    }

    @McpTool(name = "getBill", description = "Get a bill by ID from Billing Service")
    public Bill getBill(@McpArg(description = "The ID of the bill") Long id) {
        return billRestClient.getBillById(id);
    }
}