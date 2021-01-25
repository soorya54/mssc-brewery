package spring.base.msscbrewery.services.v2;

import spring.base.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

/*
 * Created by sk @ Jan 22, 21
 * */
public interface BeerServiceV2 {

    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
