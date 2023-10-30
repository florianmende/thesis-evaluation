package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelpFormatterTest_Method_187_Run_20231024_082502 {
    @Test
    public void testGetSyntaxPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("Syntax: ");
        assertEquals("Syntax: ", formatter.getSyntaxPrefix());
    }

    @Test
    public void testGetSyntaxPrefixEmpty() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("");
        assertEquals("", formatter.getSyntaxPrefix());
    }

    @Test
    public void testGetSyntaxPrefixNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix(null);
        assertNull(formatter.getSyntaxPrefix());
    }
}