package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import java.net.URL;

public class TypeHandlerTest_Method_222_Run_20231023_214133 {
    @Test
    public void testCreateURLValid() throws Exception {
        String urlString = "https://www.example.com";
        URL expectedURL = new URL(urlString);
        URL actualURL = TypeHandler.createURL(urlString);
        Assertions.assertEquals(expectedURL, actualURL);
    }

    @Test
    public void testCreateURLInvalid() throws Exception {
        String urlString = "invalid_url";
        Assertions.assertThrows(ParseException.class, () -> {
            TypeHandler.createURL(urlString);
        });
    }

    @Test
    public void testCreateURLMalformed() throws Exception {
        String urlString = "http://www.example.com/";
        URL expectedURL = new URL(urlString);
        URL actualURL = TypeHandler.createURL(urlString);
        Assertions.assertEquals(expectedURL, actualURL);
    }
}