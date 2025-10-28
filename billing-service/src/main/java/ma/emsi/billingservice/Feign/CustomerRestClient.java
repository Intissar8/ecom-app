package ma.emsi.billingservice.Feign;

import ma.emsi.billingservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "customer-service")
public interface CustomerRestClient {
    @GetMapping("/api/customers/{id}")
    public Customer getCustomerById(@PathVariable long id);

    @GetMapping("/api/customers")
    public PagedModel<Customer> getAllCustomers(); // we used PageModel because the result is an embedded list
}
