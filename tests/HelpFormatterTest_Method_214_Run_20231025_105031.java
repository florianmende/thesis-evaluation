package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

public class HelpFormatterTest_Method_214_Run_20231025_105031 {
    private HelpFormatter formatter = new HelpFormatter();

    @Test
    public void testSetSyntaxPrefix() {
        // Test that the defaultSyntaxPrefix field is set to the correct value when the setSyntaxPrefix method is called with a valid prefix.
        formatter.setSyntaxPrefix("prefix");
        assertEquals("prefix", formatter.getSyntaxPrefix());
    }

    @Test
    public void testSetSyntaxPrefixInvalidPrefix() {
        // Test that the defaultSyntaxPrefix field is not set to an incorrect value when the setSyntaxPrefix method is called with an invalid prefix.
        formatter.setSyntaxPrefix("invalid prefix");
        assertEquals("invalid prefix", formatter.getSyntaxPrefix());
    }

    @Test
    public void testSetSyntaxPrefixNullOrEmptyPrefix() {
        // Test that the defaultSyntaxPrefix field is not changed when the setSyntaxPrefix method is called with a null or empty prefix.
        formatter.setSyntaxPrefix(null);
        assertNull(formatter.getSyntaxPrefix());

        formatter.setSyntaxPrefix("");
        assertEquals("", formatter.getSyntaxPrefix());
    }
}