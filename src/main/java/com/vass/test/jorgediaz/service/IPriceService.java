package com.vass.test.jorgediaz.service;

import com.vass.test.jorgediaz.model.dto.PriceDTO;
import java.util.Date;

/**
 * Interface for business logic price entity.
 * @author @author <a href="mailto:ing.jorgediaz@outlook.com">Jorge Andres Diaz Bele&ntilde;o</a>
 */
public interface IPriceService {
    
    /**
     * Find a price entity with given parameters and conver it on a PriceDTO.
     * @param applicationDate
     * @param productId
     * @param brandId
     * @return 
     */
    PriceDTO findPrice(Date applicationDate, Integer productId, Integer brandId);
    
}
