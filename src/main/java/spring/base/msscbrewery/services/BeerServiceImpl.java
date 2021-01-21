package spring.base.msscbrewery.services;

import org.springframework.stereotype.Service;
import spring.base.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/*
 * Created by sk @ Jan 18, 21
 * */
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galazy tiger")
                .beerStyle("Belgian Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }
}
