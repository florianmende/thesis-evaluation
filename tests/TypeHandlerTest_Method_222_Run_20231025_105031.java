package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.URL;

import org.junit.jupiter.api.Test;

public class TypeHandlerTest_Method_222_Run_20231025_105031 {

    @Test
    public void testCreateURLThrowsParseExceptionForInvalidURL() {
        assertThrows(ParseException.class, () -> TypeHandler.createURL("invalid-url"));
    }

    @Test
    public void testCreateURLReturnsURLObjectForValidURL() throws ParseException {
        URL url = TypeHandler.createURL("http://www.example.com");
        assertTrue(url instanceof URL);
    }

    @Test
    public void testCreateURLThrowsExceptionForNullOrEmptyURLString() {
        assertThrows(ParseException.class, () -> TypeHandler.createURL(null));
        assertThrows(ParseException.class, () -> TypeHandler.createURL(""));
    }
}