package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_187_Run_20231025_215329 {
    @Test
    public void testGetSyntaxPrefix_NonDefault() {
        // Set up
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("MyPrefix");

        // Exercise
        String syntaxPrefix = formatter.getSyntaxPrefix();

        // Verify
        assertEquals("MyPrefix", syntaxPrefix);
    }

    @Test
    public void testGetSyntaxPrefix_Default() {
        // Set up
        HelpFormatter formatter = new HelpFormatter();

        // Exercise
        String syntaxPrefix = formatter.getSyntaxPrefix();

        // Verify
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, syntaxPrefix);
    }

    @Test
    public void testGetSyntaxPrefix_NotSet() {
        // Set up
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix(null);

        // Exercise
        String syntaxPrefix = formatter.getSyntaxPrefix();

        // Verify
        assertEquals(null, syntaxPrefix);
    }
}