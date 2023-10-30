package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import java.net.URL;

public class TypeHandlerTest_Method_222_Run_20231028_012625 {
    @Test
    public void testCreateURLValid() throws ParseException {
        // Create a mock URL object
        URL mockUrl = Mockito.mock(URL.class);
        
        // Set up the mock URL object to return a valid URL string
        Mockito.when(mockUrl.toString()).thenReturn("https://www.example.com");
        
        // Call the createURL method with the mock URL object
        URL result = TypeHandler.createURL(mockUrl.toString());
        
        // Verify that the result is a URL object
        Assertions.assertEquals(URL.class, result.getClass());
        
        // Verify that the result has the expected URL string
        Assertions.assertEquals("https://www.example.com", result.toString());
    }
    
    @Test
    public void testCreateURLInvalid() {
        // Create a mock URL object
        URL mockUrl = Mockito.mock(URL.class);
        
        // Set up the mock URL object to return an invalid URL string
        Mockito.when(mockUrl.toString()).thenReturn("invalid_url");
        
        // Call the createURL method with the mock URL object
        try {
            TypeHandler.createURL(mockUrl.toString());
            Assertions.fail("Expected ParseException");
        } catch (ParseException e) {
            // Verify that a ParseException is thrown
            Assertions.assertEquals("Unable to parse the URL: invalid_url", e.getMessage());
        }
    }
    
    @Test
    public void testCreateURLNull() {
        // Call the createURL method with a null URL string
        try {
            TypeHandler.createURL(null);
            Assertions.fail("Expected ParseException");
        } catch (ParseException e) {
            // Verify that a ParseException is thrown
            Assertions.assertEquals("Unable to parse the URL: null", e.getMessage());
        }
    }
}