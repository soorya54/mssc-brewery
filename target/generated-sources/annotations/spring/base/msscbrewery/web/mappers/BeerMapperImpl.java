package spring.base.msscbrewery.web.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import spring.base.msscbrewery.domain.Beer;
import spring.base.msscbrewery.web.model.BeerDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-28T07:01:29+0530",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.9.1 (Ubuntu)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDto beerDto = new BeerDto();

        return beerDto;
    }

    @Override
    public Beer beerDtoToBeer(BeerDto beerDto) {
        if ( beerDto == null ) {
            return null;
        }

        Beer beer = new Beer();

        return beer;
    }
}
