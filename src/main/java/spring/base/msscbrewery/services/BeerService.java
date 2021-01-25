package spring.base.msscbrewery.services;

import spring.base.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/*
 * Created by sk @ Jan 18, 21
 * */
public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
