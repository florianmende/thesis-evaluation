package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_213_Run_20231025_215329 {

    @Test
    public void testSetOptPrefixValidString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("-");
        assertEquals("-", formatter.getOptPrefix());
    }

    @Test
    public void testSetOptPrefixEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("");
        assertEquals("", formatter.getOptPrefix());
    }

    @Test
    public void testSetOptPrefixNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix(null);
        assertNull(formatter.getOptPrefix());
    }
}