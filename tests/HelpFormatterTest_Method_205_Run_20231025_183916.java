package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class HelpFormatterTest_Method_205_Run_20231025_183916 {
    @Test
    void testRtrimNull() {
        String input = null;
        HelpFormatter formatter = new HelpFormatter();
        String output = formatter.rtrim(input);
        Assertions.assertEquals(input, output);
    }

    @Test
    void testRtrimEmpty() {
        String input = "";
        HelpFormatter formatter = new HelpFormatter();
        String output = formatter.rtrim(input);
        Assertions.assertEquals(input, output);
    }

    @Test
    void testRtrimWhitespace() {
        String input = "   ";
        HelpFormatter formatter = new HelpFormatter();
        String output = formatter.rtrim(input);
        Assertions.assertEquals("", output);
    }
}