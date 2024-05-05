package com.ryanspring.springdemo.service;

import com.ryanspring.springdemo.dao.CustomerServiceRepository;
import com.ryanspring.springdemo.exception.CustomerNotFoundException;
import com.ryanspring.springdemo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {
    @Autowired
    private CustomerServiceRepository customerServiceRepository;
    public Customer addCustomer (Customer customer){
        return customerServiceRepository.save(customer);
    }
    public List<Customer> getCustomerList(){
        return customerServiceRepository.findAll();
    }
    public Customer getCustomer(int customerId){
        Optional<Customer> optionalCustomer= customerServiceRepository.findById(customerId);
        if(!optionalCustomer.isPresent()){
            throw new CustomerNotFoundException("Customer Record is not available.");
        }
        return optionalCustomer.get();
    }
    public Customer updateCustomer(int customerId, Customer customer){
        customer.setCustomerId(customerId);
        return customerServiceRepository.save(customer);
    }
    public void deleteCustomer(int customerId){
        customerServiceRepository.deleteById(customerId);
    }


    //testing the data without database
   /* private  int customerId =1;
    private List<Customer> customerList = new CopyOnWriteArrayList<>();

    public Customer addCustomer (Customer customer){
        customer.setCustomerId(customerId);
        customerList.add(customer);
        customerId ++;
        return customer;
    }
    public List<Customer> getCustomerList(){
        return customerServiceRepository.findAll();
    }
    public Customer getCustomer(int customerId){
        return customerList
                .stream()
                .filter(customer -> customer.getCustomerId() == customerId)
                .findFirst()
                .get();
    }
    public Customer updateCustomer(int customerId, Customer customer){
        customerList
                .stream()
                .forEach(c -> {
                    if(c.getCustomerId()== customerId){
                        c.setCustomerFirstName(customer.getCustomerFirstName());
                        c.setCustomerEmail(customer.getCustomerEmail());
                    }
                });
        return customerList
                .stream().filter(c->c.getCustomerId()==customerId)
                .findFirst()
                .get();

    }
    public void deleteCustomer(int customerId){
        customerList
                .stream()
                .forEach(c-> {if (c.getCustomerId()== customerId){
                    customerList.remove(c);
                }
                });
    }
*/
}
