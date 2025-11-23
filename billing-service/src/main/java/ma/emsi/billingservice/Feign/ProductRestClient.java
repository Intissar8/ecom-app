package ma.emsi.billingservice.Feign;

import ma.emsi.billingservice.model.Customer;
import ma.emsi.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="inventory-service")
public interface ProductRestClient {
    @GetMapping("/api/products/{id}")
    public Product getProductById(@PathVariable String id);

    @GetMapping("/api/products")
    public PagedModel<Product> getAllProducts();


}
