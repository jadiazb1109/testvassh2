package com.vass.test.jorgediaz.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/**
 * DTO for price entity.
 * 
 * @author <a href="mailto:ing.jorgediaz@outlook.com">Jorge Andres Diaz
 *         Beleno</a>
 */
public class PriceDTO {

    private Integer productId;

    private Integer brandId;

    private Integer priceList;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date applicationStartDate;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date applicationEndDate;

    private Double price;

    private String currency;

    public PriceDTO() {
    }

    public PriceDTO(Integer productId, Integer brandId, Integer priceList, Date applicationStartDate,
            Date applicationEndDate, Double price, String currency) {
        this.productId = productId;
        this.brandId = brandId;
        this.priceList = priceList;
        this.applicationStartDate = applicationStartDate;
        this.applicationEndDate = applicationEndDate;
        this.price = price;
        this.currency = currency;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getPriceList() {
        return priceList;
    }

    public void setPriceList(Integer priceList) {
        this.priceList = priceList;
    }

    public Date getApplicationStartDate() {
        return applicationStartDate;
    }

    public void setApplicationStartDate(Date applicationStartDate) {
        this.applicationStartDate = applicationStartDate;
    }

    public Date getApplicationEndDate() {
        return applicationEndDate;
    }

    public void setApplicationEndDate(Date applicationEndDate) {
        this.applicationEndDate = applicationEndDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
