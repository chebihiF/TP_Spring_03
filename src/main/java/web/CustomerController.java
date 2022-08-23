package web;

import entities.Customer;
import metier.ICustomerMetier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.security.krb5.internal.tools.Klist;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    private final ICustomerMetier metier;

    public CustomerController(ICustomerMetier metier) {
        this.metier = metier;
    }

    @GetMapping
    public String getCustomers(Model model){

        try {
            List<Customer> customers = metier.getCustomers();
            model.addAttribute("customers",customers);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return "customers";
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
