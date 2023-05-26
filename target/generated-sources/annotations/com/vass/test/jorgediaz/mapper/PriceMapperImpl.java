package com.vass.test.jorgediaz.mapper;

import com.vass.test.jorgediaz.model.Price;
import com.vass.test.jorgediaz.model.dto.PriceDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-26T09:40:18-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.34.0.v20230413-0857, environment: Java 17.0.7 (Eclipse Adoptium)"
)
public class PriceMapperImpl implements PriceMapper {

    @Override
    public PriceDTO priceToPriceDTO(Price price) {
        if ( price == null ) {
            return null;
        }

        PriceDTO priceDTO = new PriceDTO();

        priceDTO.setProductId( price.getProductId() );
        priceDTO.setBrandId( price.getBrandId() );
        priceDTO.setPriceList( price.getPriceList() );
        priceDTO.setApplicationStartDate( price.getStartDate() );
        priceDTO.setApplicationEndDate( price.getEndDate() );
        priceDTO.setPrice( price.getPrice() );
        priceDTO.setCurrency( price.getCurrency() );

        return priceDTO;
    }
}
