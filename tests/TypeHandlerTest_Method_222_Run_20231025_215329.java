package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.apache.commons.cli.TypeHandler;
import org.junit.jupiter.api.Test;

public class TypeHandlerTest_Method_222_Run_20231025_215329 {

    @Test
    public void testCreateURL() throws MalformedURLException, ParseException {
        String urlString = "https://www.example.com";
        URL expectedURL = new URL(urlString);

        URL actualURL = TypeHandler.createURL(urlString);

        assertEquals(expectedURL, actualURL);
    }

    @Test
    public void testCreateURLWithMalformedURL() {
        String urlString = "malformed-url";

        assertThrows(ParseException.class, () -> TypeHandler.createURL(urlString));
    }

    @Test
    public void testCreateURLWithNullString() {
        String urlString = null;

        assertThrows(ParseException.class, () -> TypeHandler.createURL(urlString));
    }

    @Test
    public void testCreateURLWithEmptyString() {
        String urlString = "";

        assertThrows(ParseException.class, () -> TypeHandler.createURL(urlString));
    }
}