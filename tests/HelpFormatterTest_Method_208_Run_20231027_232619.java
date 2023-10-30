package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_208_Run_20231027_232619 {
 
    @Test
    public void testSetLeftPaddingWithValidValue() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());
    }
 
    @Test
    public void testSetLeftPaddingWithNegativeValue() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(-5);
        assertEquals(-5, formatter.getLeftPadding());
    }
 
    @Test
    public void testSetLeftPaddingWithZeroValue() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(0);
        assertEquals(0, formatter.getLeftPadding());
    }
}