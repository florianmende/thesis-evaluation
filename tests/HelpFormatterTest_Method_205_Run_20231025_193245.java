package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_205_Run_20231025_193245 {
    @Test
    public void testRtrimNull() {
        HelpFormatter formatter = new HelpFormatter();
        String result = formatter.rtrim(null);
        assertEquals(null, result);
    }

    @Test
    public void testRtrimEmpty() {
        HelpFormatter formatter = new HelpFormatter();
        String result = formatter.rtrim("");
        assertEquals("", result);
    }

    @Test
    public void testRtrimWhitespace() {
        HelpFormatter formatter = new HelpFormatter();
        String result = formatter.rtrim("   Hello World   ");
        assertEquals("   Hello World", result);
    }

    @Test
    public void testRtrimNoWhitespace() {
        HelpFormatter formatter = new HelpFormatter();
        String result = formatter.rtrim("Hello World");
        assertEquals("Hello World", result);
    }
}