package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;

class TypeHandlerTest_Method_222_Run_20231024_091429 {

    @Test
    void testCreateURL() throws MalformedURLException, ParseException {
        final String urlString = "https://www.example.com";
        URL url = TypeHandler.createURL(urlString);
        assertEquals(urlString, url.toString());

        final String invalidUrlString = "invalid url";
        assertThrows(ParseException.class, () -> TypeHandler.createURL(invalidUrlString));

        final String nullUrlString = null;
        assertThrows(ParseException.class, () -> TypeHandler.createURL(nullUrlString));
    }

}