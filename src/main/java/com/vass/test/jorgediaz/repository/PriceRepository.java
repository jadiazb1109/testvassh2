package com.vass.test.jorgediaz.repository;

import com.vass.test.jorgediaz.model.Price;
import java.util.Date;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for data access prices entity.
 * @author @author <a href="mailto:ing.jorgediaz@outlook.com">Jorge Andres Diaz Bele&ntilde;o</a>
 */
@Repository
public interface PriceRepository extends CrudRepository<Price, Integer> {

    /**
     * Find a price for a product and brand, in a date range, with most priority.
     * @param productId
     * @param brandId
     * @param applicationDateStart
     * @param applicationDateEnd
     * @return 
     */
    Price findFirstByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityDesc(
        Integer productId, Integer brandId, Date applicationDateStart, Date applicationDateEnd
    );
    
}
