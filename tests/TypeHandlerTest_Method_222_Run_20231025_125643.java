package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.net.URL;
import java.net.MalformedURLException;

class TypeHandlerTest_Method_222_Run_20231025_125643 {
    @Test
    void testCreateURL() throws MalformedURLException, ParseException {
        String str = "http://www.example.com";
        URL url = new URL(str);
        TypeHandler typeHandler = new TypeHandler();
        URL result = typeHandler.createURL(str);
        assertEquals(url, result);
    }

    @Test
    void testCreateURLWithMalformedURLException() {
        String str = "malformed_url";
        TypeHandler typeHandler = new TypeHandler();
        assertThrows(ParseException.class, () -> typeHandler.createURL(str));
    }
}