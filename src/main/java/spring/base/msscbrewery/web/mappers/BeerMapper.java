package spring.base.msscbrewery.web.mappers;

import org.mapstruct.Mapper;
import spring.base.msscbrewery.domain.Beer;
import spring.base.msscbrewery.web.model.BeerDto;

/*
 * Created by sk @ Jan 27, 21
 * */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
