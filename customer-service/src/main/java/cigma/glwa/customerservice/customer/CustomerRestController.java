package cigma.glwa.customerservice.customer;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerRestController {

    private final ICustomerService service;

    public CustomerRestController(ICustomerService service) {
        this.service = service;
    }

    @PostMapping
    public CustomerResponse addCustomer(@RequestBody Customer customer) {
        try {
            return service.addCustomer(customer);
        } catch (Exception e) {
            return new Error("add customer",e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public CustomerResponse getCustomer(@PathVariable Long id) {
        try {
            return service.getCustomer(id);
        } catch (Exception e) {
            return new Error("get customer",e.getMessage());
        }
    }

    @GetMapping
    public List<Customer> getAll(@RequestBody Customer customer) {
        try {
            return service.findAllCustomers();
        } catch (Exception e) {
            return new ArrayList<Customer>();
        }
    }
}
