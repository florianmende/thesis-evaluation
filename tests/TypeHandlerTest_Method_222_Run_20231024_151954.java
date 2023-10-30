package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.net.URL;

public class TypeHandlerTest_Method_222_Run_20231024_151954 {
    @Test
    public void testCreateURL() throws ParseException {
        // Valid URL string
        final String urlString = "https://www.example.com";
        URL url = TypeHandler.createURL(urlString);
        Assertions.assertEquals(urlString, url.toString());

        // Invalid URL string
        final String urlString2 = "invalidUrl";
        Assertions.assertThrows(ParseException.class, () -> TypeHandler.createURL(urlString2));

        // Null input
        Assertions.assertThrows(ParseException.class, () -> TypeHandler.createURL(null));
    }
}