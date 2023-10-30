package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_182_Run_20231024_165833 {

    @Test
    public void testGetLongOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("--");
        assertEquals("--", formatter.getLongOptPrefix());
    }

    @Test
    public void testGetLongOptPrefixWithEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("");
        assertEquals("", formatter.getLongOptPrefix());
    }

    @Test
    public void testGetLongOptPrefixWithNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix(null);
        assertEquals(null, formatter.getLongOptPrefix());
    }
}