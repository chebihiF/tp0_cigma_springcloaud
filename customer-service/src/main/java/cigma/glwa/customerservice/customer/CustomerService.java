package cigma.glwa.customerservice.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer addCustomer(Customer customer) throws Exception {
        if(!customer.getEmail().contains("gmail")) throw new Exception("email invalid");
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) throws Exception {
        return null;
    }

    @Override
    public Customer deleteCustomer(Customer customer) throws Exception {
        return null;
    }

    @Override
    public Customer getCustomer(Long id) throws Exception {
        return null;
    }

    @Override
    public List<Customer> findAllCustomers() throws Exception {
        return null;
    }
}
