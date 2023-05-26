package com.vass.test.jorgediaz.service.impl;

import com.vass.test.jorgediaz.mapper.PriceMapper;
import com.vass.test.jorgediaz.model.Price;
import com.vass.test.jorgediaz.model.dto.PriceDTO;
import com.vass.test.jorgediaz.repository.PriceRepository;
import com.vass.test.jorgediaz.service.IPriceService;
import java.util.Date;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service implementation for bussines logic price entity.
 * @author @author <a href="mailto:ing.jorgediaz@outlook.com">Jorge Andres Diaz Bele&ntilde;o</a>
 */
@Service
public class PriceService implements IPriceService {

    /**
     * Repository for data access.
     */
    private final PriceRepository repository;

    /**
     * Constructor for dependency injection.
     * @param repository Repository to be injected.
     */
    @Autowired
    public PriceService(PriceRepository repository) {
        this.repository = repository;
    }
    
    /**
     * Find a price entity with given parameters and conver it on a PriceDTO.
     * @param applicationDate
     * @param productId
     * @param brandId
     * @return 
     */
    @Override
    public PriceDTO findPrice(Date applicationDate, Integer productId, Integer brandId) {
        Price price = repository.findFirstByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityDesc(productId, brandId, applicationDate, applicationDate);
        PriceMapper mapper = Mappers.getMapper(PriceMapper.class);
        return mapper.priceToPriceDTO(price);
    }
    
}
