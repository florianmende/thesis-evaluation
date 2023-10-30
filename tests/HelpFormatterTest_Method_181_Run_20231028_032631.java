package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_181_Run_20231028_032631 {
    @Test
    public void testGetLeftPaddingPositive() {
        // Set up mock object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getLeftPadding()).thenReturn(10);
        
        // Verify that getLeftPadding() returns the correct value
        assertEquals(10, formatter.getLeftPadding());
    }
    
    @Test
    public void testGetLeftPaddingNegative() {
        // Set up mock object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getLeftPadding()).thenReturn(-10);
        
        // Verify that getLeftPadding() returns the correct value
        assertEquals(-10, formatter.getLeftPadding());
    }
    
    @Test
    public void testGetLeftPaddingZero() {
        // Set up mock object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getLeftPadding()).thenReturn(0);
        
        // Verify that getLeftPadding() returns the correct value
        assertEquals(0, formatter.getLeftPadding());
    }
}