package ru.fazlyev.stockparser.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import ru.fazlyev.stockparser.service.NasdaqStockService;
import ru.fazlyev.stockparser.service.StockGetterServiceImpl;

import static org.junit.jupiter.api.Assertions.assertTrue;

@WebMvcTest({StockController.class, StockGetterServiceImpl.class, NasdaqStockService.class})
class StockControllerTest {
    @Autowired
    private MockMvc mockMvc;

    private final String expectedStock = "{\"id\":1,\"symbol\":\"AAPL\",\"name\":\"Apple\",\"price\":";

    @Test
    void shouldReturnCorrectStringOfAllStocks() throws Exception {
        final String actual = mockMvc.perform(MockMvcRequestBuilders.get
                ("/api/stocks/all"))
                .andReturn().getResponse().getContentAsString();

        assertTrue(actual.startsWith('[' + expectedStock));
    }

    @Test
    void shouldReturnCorrectStringOfStockByName() throws Exception {
        final String actual = mockMvc.perform(MockMvcRequestBuilders.get("/api/stocks/apple"))
                .andReturn().getResponse().getContentAsString();

        assertTrue(actual.startsWith(expectedStock));
    }
}
