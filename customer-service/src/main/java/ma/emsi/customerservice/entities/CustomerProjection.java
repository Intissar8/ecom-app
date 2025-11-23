package ma.emsi.customerservice.entities;

import org.springframework.data.rest.core.config.Projection;

//we use the projections to define what to print
@Projection(name = "all",types = Customer.class)
public interface CustomerProjection {
    String getName();
    String getEmail();
}
