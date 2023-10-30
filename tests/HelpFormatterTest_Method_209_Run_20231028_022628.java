package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HelpFormatterTest_Method_209_Run_20231028_022628 {
    @Test
    public void testSetLongOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("--");
        assertEquals("--", formatter.getLongOptPrefix());
    }

    @Test
    public void testSetLongOptPrefixNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix(null);
        assertNull(formatter.getLongOptPrefix());
    }

    @Test
    public void testSetLongOptPrefixNullWithExistingValue() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("--");
        assertEquals("--", formatter.getLongOptPrefix());
        formatter.setLongOptPrefix(null);
        assertNull(formatter.getLongOptPrefix());
    }
}