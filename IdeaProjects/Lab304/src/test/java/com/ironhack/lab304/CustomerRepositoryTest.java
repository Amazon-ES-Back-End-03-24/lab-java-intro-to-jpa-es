package com.ironhack.lab304;


import com.ironhack.lab304.models.Customer;
import com.ironhack.lab304.models.CustomerStatus;
import com.ironhack.lab304.repository.CustomerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void createNewCustomer() {
        Customer customer = new Customer();
        customer.setCustomerName("Cheyenne Saiz");
        customer.setCustomerStatus(CustomerStatus.Gold);

        customer = customerRepository.save(customer);

        // ver si devuelve un id -- != null
        Assertions.assertNotNull(customer.getCustomerId());

        // contar
        List<Customer> savedCustomers = customerRepository.findAll();
        Integer customerCounter = savedCustomers.size();

        Customer customer2 = new Customer();
        customer2.setCustomerName("Cheyenne Saiz");
        customer2.setCustomerStatus(CustomerStatus.Gold);

        customer2 = customerRepository.save(customer2);

        Assertions.assertEquals(customerCounter + 1,customerRepository.findAll().size());
    }

    @Test
    public void findCustomerByCustomerStatusOk(){
        Customer customer = new Customer();
        customer.setCustomerName("Cheyenne Saiz");
        customer.setCustomerStatus(CustomerStatus.Gold);

        customer = customerRepository.save(customer);


        Assertions.assertEquals(1, customerRepository.findCustomerByCustomerStatus(CustomerStatus.Gold).size());

        Assertions.assertEquals("Cheyenne Saiz", customerRepository.findCustomerByCustomerStatus(CustomerStatus.Gold).get(0).getCustomerName());

        Assertions.assertEquals(0, customerRepository.findCustomerByCustomerStatus(CustomerStatus.Silver).size());
    }
}
