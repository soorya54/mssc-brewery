package spring.base.msscbrewery.services;

import spring.base.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/*
 * Created by sk @ Jan 18, 21
 * */
public interface CustomerService {
    CustomerDto getBeerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
