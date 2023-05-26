package com.vass.test.jorgediaz.mapper;

import com.vass.test.jorgediaz.model.Price;
import com.vass.test.jorgediaz.model.dto.PriceDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Mapper for price entity.
 * 
 * @author <a href="mailto:ing.jorgediaz@outlook.com">Jorge Andres Diaz
 *         Beleno</a>
 */
@Mapper
public interface PriceMapper {

    /**
     * Convert a Price entity to Price DTO.
     * 
     * @param price Entity to be converted
     * @return DTO converted.
     */
    @Mapping(target = "productId", source = "price.productId")
    @Mapping(target = "brandId", source = "price.brandId")
    @Mapping(target = "priceList", source = "price.priceList")
    @Mapping(target = "applicationStartDate", source = "price.startDate")
    @Mapping(target = "applicationEndDate", source = "price.endDate")
    @Mapping(target = "price", source = "price.price")
    @Mapping(target = "currency", source = "price.currency")
    PriceDTO priceToPriceDTO(Price price);

}
