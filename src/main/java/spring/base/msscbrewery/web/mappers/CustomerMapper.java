package spring.base.msscbrewery.web.mappers;

import org.mapstruct.Mapper;
import spring.base.msscbrewery.domain.Customer;
import spring.base.msscbrewery.web.model.CustomerDto;

/*
 * Created by sk @ Jan 27, 21
 * */
@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
