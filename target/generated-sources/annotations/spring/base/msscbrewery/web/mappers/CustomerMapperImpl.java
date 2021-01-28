package spring.base.msscbrewery.web.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import spring.base.msscbrewery.domain.Customer;
import spring.base.msscbrewery.web.model.CustomerDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-28T07:01:29+0530",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.9.1 (Ubuntu)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDto customerToCustomerDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        return customerDto;
    }

    @Override
    public Customer customerDtoToCustomer(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        return customer;
    }
}
