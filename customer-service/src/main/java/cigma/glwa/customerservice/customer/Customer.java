package cigma.glwa.customerservice.customer;

import cigma.glwa.customerservice.adress.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.implementation.bytecode.Addition;



import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Customer implements CustomerResponse {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name ;
    private String email;
    @OneToMany(mappedBy = "customer")
    private List<Address> addresses;
}
