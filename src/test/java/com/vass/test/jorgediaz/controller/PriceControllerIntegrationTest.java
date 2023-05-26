package com.vass.test.jorgediaz.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PriceControllerIntegrationTest {

        @Autowired
        private MockMvc mockMvc;

        @Test
        void shouldWorkWithay14thAt1000() throws Exception {

                String applicationDate = "2020-06-14T10:00:00";
                Integer productId = 35455;
                Integer brandId = 1;
                Integer priceList = 1;
                Double price = 35.5;
                String applicationStartDate = "2020-06-14T05:00:00";
                String applicationEndDate = "2021-01-01T04:59:59";
                String currency = "EUR";

                String url = "/prices?application-date=" + applicationDate + "&product-id=" + productId + "&brand-id="
                                + brandId;

                String jsonResponse = "{\"productId\":" + productId +
                                ",\"brandId\":" + brandId +
                                ",\"priceList\":" + priceList +
                                ",\"applicationStartDate\":\"" + applicationStartDate +
                                "\",\"applicationEndDate\":\"" + applicationEndDate +
                                "\",\"price\":" + price +
                                ",\"currency\":\"" + currency +
                                "\"}";

                this.mockMvc.perform(get(url)).andDo(print())
                                .andExpect(status().isOk())
                                .andExpect(content().json(jsonResponse));

        }

        @Test
        void shouldWorkWithay14thAt1600() throws Exception {

                String applicationDate = "2020-06-14T16:00:00";
                Integer productId = 35455;
                Integer brandId = 1;
                Integer priceList = 2;
                Double price = 25.45;
                String currency = "EUR";
                String applicationStartDate = "2020-06-14T20:00:00";
                String applicationEndDate = "2020-06-14T23:30:00";

                String url = "/prices?application-date=" + applicationDate + "&product-id=" + productId + "&brand-id="
                                + brandId;

                String jsonResponse = "{\"productId\":" + productId +
                                ",\"brandId\":" + brandId +
                                ",\"priceList\":" + priceList +
                                ",\"applicationStartDate\":\"" + applicationStartDate +
                                "\",\"applicationEndDate\":\"" + applicationEndDate +
                                "\",\"price\":" + price +
                                ",\"currency\":\"" + currency +
                                "\"}";

                this.mockMvc.perform(get(url)).andDo(print())
                                .andExpect(status().isOk())
                                .andExpect(content().json(jsonResponse));

        }

        @Test
        void shouldWorkWithay14thAt2100() throws Exception {

                String applicationDate = "2020-06-14T21:00:00";
                Integer productId = 35455;
                Integer brandId = 1;
                Integer priceList = 1;
                Double price = 35.5;
                String currency = "EUR";
                String applicationStartDate = "2020-06-14T05:00:00";
                String applicationEndDate = "2021-01-01T04:59:59";

                String url = "/prices?application-date=" + applicationDate + "&product-id=" + productId + "&brand-id="
                                + brandId;

                String jsonResponse = "{\"productId\":" + productId +
                                ",\"brandId\":" + brandId +
                                ",\"priceList\":" + priceList +
                                ",\"applicationStartDate\":\"" + applicationStartDate +
                                "\",\"applicationEndDate\":\"" + applicationEndDate +
                                "\",\"price\":" + price +
                                ",\"currency\":\"" + currency +
                                "\"}";

                this.mockMvc.perform(get(url)).andDo(print())
                                .andExpect(status().isOk())
                                .andExpect(content().json(jsonResponse));

        }

        @Test
        void shouldWorkWithay15thAt1000() throws Exception {

                String applicationDate = "2020-06-15T10:00:00";
                Integer productId = 35455;
                Integer brandId = 1;
                Integer priceList = 3;
                Double price = 30.5;
                String currency = "EUR";
                String applicationStartDate = "2020-06-15T05:00:00";
                String applicationEndDate = "2020-06-15T16:00:00";

                String url = "/prices?application-date=" + applicationDate + "&product-id=" + productId + "&brand-id="
                                + brandId;

                String jsonResponse = "{\"productId\":" + productId +
                                ",\"brandId\":" + brandId +
                                ",\"priceList\":" + priceList +
                                ",\"applicationStartDate\":\"" + applicationStartDate +
                                "\",\"applicationEndDate\":\"" + applicationEndDate +
                                "\",\"price\":" + price +
                                ",\"currency\":\"" + currency +
                                "\"}";

                this.mockMvc.perform(get(url)).andDo(print())
                                .andExpect(status().isOk())
                                .andExpect(content().json(jsonResponse));

        }

        @Test
        void shouldWorkWithay16thAt2100() throws Exception {

                String applicationDate = "2020-06-16T21:00:00";
                Integer productId = 35455;
                Integer brandId = 1;
                Integer priceList = 4;
                Double price = 38.95;
                String currency = "EUR";
                String applicationStartDate = "2020-06-15T21:00:00";
                String applicationEndDate = "2021-01-01T04:59:59";

                String url = "/prices?application-date=" + applicationDate + "&product-id=" + productId + "&brand-id="
                                + brandId;

                String jsonResponse = "{\"productId\":" + productId +
                                ",\"brandId\":" + brandId +
                                ",\"priceList\":" + priceList +
                                ",\"applicationStartDate\":\"" + applicationStartDate +
                                "\",\"applicationEndDate\":\"" + applicationEndDate +
                                "\",\"price\":" + price +
                                ",\"currency\":\"" + currency +
                                "\"}";

                this.mockMvc.perform(get(url)).andDo(print())
                                .andExpect(status().isOk())
                                .andExpect(content().json(jsonResponse));

        }

}
