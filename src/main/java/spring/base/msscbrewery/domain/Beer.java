package spring.base.msscbrewery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring.base.msscbrewery.web.model.v2.BeerStyleEnum;

import java.sql.Timestamp;
import java.util.UUID;

/*
 * Created by sk @ Jan 27, 21
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;

    private Timestamp createdDate;
    private Timestamp modifiedDate;
}
