package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_187_Run_20231023_214133 {
    @Test
    public void testGetSyntaxPrefix() {
        // Case 1: defaultSyntaxPrefix is not null
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("test");
        assertEquals("test", formatter.getSyntaxPrefix());

        // Case 2: defaultSyntaxPrefix is null
        formatter = new HelpFormatter();
        formatter.setSyntaxPrefix(null);
        assertEquals(null, formatter.getSyntaxPrefix());

        // Case 3: defaultSyntaxPrefix is empty
        formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("");
        assertEquals("", formatter.getSyntaxPrefix());
    }
}