package com.vass.test.jorgediaz.controller;

import com.vass.test.jorgediaz.model.dto.PriceDTO;
import com.vass.test.jorgediaz.service.IPriceService;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(PriceController.class)
public class PriceControllerMockTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private IPriceService service;

    @Test
    public void findPricesShouldReturnServiceResponseInJson() throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        String applicationDate = "2020-06-16T21:00:00";
        Integer productId = 35455;
        Integer brandId = 1;
        Integer priceList = 4;
        Double price = 38.95;
        String currency = "EUR";

        PriceDTO priceDTO = new PriceDTO(
                productId,
                brandId,
                priceList,
                sdf.parse("2020-06-15T21:00:00"),
                sdf.parse("2021-01-01T04:59:59"),
                price,
                currency);

        SimpleDateFormat sdfUTC = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        sdfUTC.setTimeZone(TimeZone.getTimeZone("UTC"));

        String url = "/prices?application-date=" + applicationDate + "&product-id=" + productId + "&brand-id="
                + brandId;

        String jsonResponse = "{\"productId\":" + productId +
                ",\"brandId\":" + brandId +
                ",\"priceList\":" + priceList +
                ",\"applicationStartDate\":\"" + sdfUTC.format(priceDTO.getApplicationStartDate()) +
                "\",\"applicationEndDate\":\"" + sdfUTC.format(priceDTO.getApplicationEndDate()) +
                "\",\"price\":" + price +
                ",\"currency\":\"" + currency +
                "\"}";

        when(service.findPrice(sdf.parse(applicationDate), productId, brandId))
                .thenReturn(priceDTO);

        this.mockMvc.perform(get(url)).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(jsonResponse));
    }

}
