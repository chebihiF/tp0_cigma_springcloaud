package cigma.glwa.customerservice.customer;

import cigma.glwa.customerservice.adress.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    @Query("from Customer c where c.addresses in :address")
    public Page<Customer> findCustomerByCity(List<Address> addresses);

    public Page<Customer> findCustomerByEmailContains(String email, Pageable pageable);

    @Query("from Customer c where c.email like '%:keyword%'")
    public Page<Customer> getCustomeData(String keyword, Pageable pageable);

}
