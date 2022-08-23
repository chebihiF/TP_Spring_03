package web;

import entities.Customer;
import metier.ICustomerMetier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    private final ICustomerMetier metier;

    public CustomerController(ICustomerMetier metier) {
        this.metier = metier;
    }

    @PostMapping
    public String addCustomer(Customer customer){
        try {
            metier.subscribeCustomer(customer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "valid";
    }
}
