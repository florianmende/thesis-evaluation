package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_182_Run_20231025_193245 {
    @Test
    public void testGetLongOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("--");
        assertEquals("--", formatter.getLongOptPrefix());
    }

    @Test
    public void testGetLongOptPrefixEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("");
        assertEquals("", formatter.getLongOptPrefix());
    }

    @Test
    public void testGetLongOptPrefixWithSpace() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("-- ");
        assertEquals("-- ", formatter.getLongOptPrefix());
    }
}