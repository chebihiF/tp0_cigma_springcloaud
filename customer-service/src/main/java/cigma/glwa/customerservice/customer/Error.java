package cigma.glwa.customerservice.customer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Error implements CustomerResponse{
    private String type ;
    private String message ;
}
