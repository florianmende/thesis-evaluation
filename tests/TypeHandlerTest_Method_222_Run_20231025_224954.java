package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TypeHandlerTest_Method_222_Run_20231025_224954 {
    @Test
    public void testCreateURL() throws ParseException {
        TypeHandler handler = new TypeHandler();
        Assertions.assertNotNull(handler.createURL("https://www.example.com"));
    }

    @Test
    public void testCreateURLInvalidURL() {
        TypeHandler handler = new TypeHandler();
        Assertions.assertThrows(ParseException.class, () -> handler.createURL("invalid URL"));
    }

    @Test
    public void testCreateURLNullString() {
        TypeHandler handler = new TypeHandler();
        Assertions.assertThrows(ParseException.class, () -> handler.createURL(null));
    }
}