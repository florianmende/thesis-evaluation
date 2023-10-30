package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_213_Run_20231024_091429 {
    
    @Test
    public void testSetOptPrefixValidString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("-");
        assertEquals("-", formatter.getOptPrefix());
    }
    
    @Test
    public void testSetOptPrefixNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix(null);
        assertEquals(null, formatter.getOptPrefix());
    }
    
    @Test
    public void testSetOptPrefixEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("");
        assertEquals("", formatter.getOptPrefix());
    }
}