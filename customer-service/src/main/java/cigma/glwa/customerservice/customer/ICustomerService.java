package cigma.glwa.customerservice.customer;

import java.util.List;

public interface ICustomerService {
    public Customer addCustomer(Customer customer) throws Exception;
    public Customer updateCustomer(Customer customer) throws Exception;
    public Customer deleteCustomer(Customer customer) throws Exception;
    public Customer getCustomer(Long id) throws Exception;
    public List<Customer> findAllCustomers() throws Exception;
}
