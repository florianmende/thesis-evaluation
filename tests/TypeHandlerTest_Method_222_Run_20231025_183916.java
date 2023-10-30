package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;

public class TypeHandlerTest_Method_222_Run_20231025_183916 {
    @Test
    public void testCreateURL() throws MalformedURLException, ParseException {
        // Test case 1: Pass a valid URL string to the method and check that the returned URL object is not null.
        final String urlString = "https://www.example.com";
        URL url = TypeHandler.createURL(urlString);
        assertNotNull(url);

        // Test case 2: Pass an invalid URL string to the method and check that a ParseException is thrown.
        final String invalidUrlString = "invalidUrl";
        assertThrows(ParseException.class, () -> TypeHandler.createURL(invalidUrlString));

        // Test case 3: Pass a null URL string to the method and check that a ParseException is thrown.
        final String nullUrlString = null;
        assertThrows(ParseException.class, () -> TypeHandler.createURL(nullUrlString));
    }
}