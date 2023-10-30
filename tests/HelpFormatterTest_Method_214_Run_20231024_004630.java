package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HelpFormatterTest_Method_214_Run_20231024_004630 {
    @Test
    public void testSetSyntaxPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("prefix");
        assertEquals("prefix", formatter.getSyntaxPrefix());
    }

    @Test
    public void testSetSyntaxPrefixNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix(null);
        assertNull(formatter.getSyntaxPrefix());
    }

    @Test
    public void testSetSyntaxPrefixEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("");
        assertEquals("", formatter.getSyntaxPrefix());
    }
}