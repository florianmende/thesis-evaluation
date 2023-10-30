package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_214_Run_20231024_151954 {

    @Test
    public void testSetSyntaxPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("test");
        Assertions.assertEquals("test", formatter.getSyntaxPrefix());
    }

    @Test
    public void testSetSyntaxPrefixNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix(null);
        Assertions.assertNull(formatter.getSyntaxPrefix());
    }

    @Test
    public void testSetSyntaxPrefixEmpty() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("");
        Assertions.assertEquals("", formatter.getSyntaxPrefix());
    }
}