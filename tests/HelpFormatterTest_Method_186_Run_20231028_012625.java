package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_186_Run_20231028_012625 {
    @Test
    public void testGetOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultOptPrefix = "--";
        Assertions.assertEquals("--", formatter.getOptPrefix());
    }

    @Test
    public void testGetOptPrefixEmpty() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultOptPrefix = "";
        Assertions.assertEquals("", formatter.getOptPrefix());
    }

    @Test
    public void testGetOptPrefixNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultOptPrefix = null;
        Assertions.assertEquals(null, formatter.getOptPrefix());
    }
}