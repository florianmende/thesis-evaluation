package org.apache.commons.cli;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_186_Run_20231026_155023 {

    @Test
    public void testGetOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("-");
        Assertions.assertEquals("-", formatter.getOptPrefix());
    }

    @Test
    public void testGetOptPrefixEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("");
        Assertions.assertEquals("", formatter.getOptPrefix());
    }

    @Test
    public void testGetOptPrefixNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix(null);
        Assertions.assertEquals(null, formatter.getOptPrefix());
    }
}