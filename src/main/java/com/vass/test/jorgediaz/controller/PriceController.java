package com.vass.test.jorgediaz.controller;

import com.vass.test.jorgediaz.model.dto.PriceDTO;
import com.vass.test.jorgediaz.service.IPriceService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for price entity.
 * 
 * @author <a href="mailto:ing.jorgediaz@outlook.com">Jorge Andres Diaz
 *         Beleno</a>
 */
@RestController
@RequestMapping("/prices")
public class PriceController {

    /**
     * Service for price logic
     */
    private final IPriceService service;

    /**
     * Controller constructor
     * 
     * @param service PriceService to be injected.
     */
    @Autowired
    public PriceController(IPriceService service) {
        this.service = service;
    }

    /**
     * Find the price with given parameters.
     * 
     * @param applicationDate Application date
     * @param productId       Product id.
     * @param brandId         Brand id.
     * @return Price woth given parameters.
     */
    @GetMapping
    public ResponseEntity<PriceDTO> findPrices(
            @RequestParam("application-date") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss") Date applicationDate,
            @RequestParam("product-id") Integer productId,
            @RequestParam("brand-id") Integer brandId) {
        return new ResponseEntity<>(service.findPrice(applicationDate, productId, brandId), HttpStatus.OK);
    }

}
