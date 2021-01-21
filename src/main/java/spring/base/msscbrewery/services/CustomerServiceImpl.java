package spring.base.msscbrewery.services;

import org.springframework.stereotype.Service;
import spring.base.msscbrewery.web.model.BeerDto;
import spring.base.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/*
 * Created by sk @ Jan 18, 21
 * */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getBeerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Michelle's club")
                .build();
    }
}
