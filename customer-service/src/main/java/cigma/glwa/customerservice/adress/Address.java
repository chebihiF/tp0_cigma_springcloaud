package cigma.glwa.customerservice.adress;

import cigma.glwa.customerservice.customer.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Address {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String num ;
    private String street ;
    private String country;
    private String city;
    @ManyToOne
    private Customer customer;
}
