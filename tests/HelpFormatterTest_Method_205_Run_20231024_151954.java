package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HelpFormatterTest_Method_205_Run_20231024_151954 {
    @Test
    public void testRtrimNull() {
        HelpFormatter formatter = new HelpFormatter();
        String input = null;
        String output = formatter.rtrim(input);
        assertNull(output);
    }

    @Test
    public void testRtrimEmpty() {
        HelpFormatter formatter = new HelpFormatter();
        String input = "";
        String output = formatter.rtrim(input);
        assertEquals("", output);
    }

    @Test
    public void testRtrimWhitespace() {
        HelpFormatter formatter = new HelpFormatter();
        String input = "   ";
        String output = formatter.rtrim(input);
        assertEquals("", output);
    }
}