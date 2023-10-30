package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HelpFormatterTest_Method_183_Run_20231027_232619 {

    @Test
    public void testGetLongOptSeparator() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());
    }

    @Test
    public void testGetLongOptSeparatorEmpty() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("");
        assertEquals("", formatter.getLongOptSeparator());
    }

    @Test
    public void testGetLongOptSeparatorNull() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator(null);
        assertNull(formatter.getLongOptSeparator());
    }
}