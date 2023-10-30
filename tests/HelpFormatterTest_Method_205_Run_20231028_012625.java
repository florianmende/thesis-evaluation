package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HelpFormatterTest_Method_205_Run_20231028_012625 {
    
    @Test
    public void testNullOrEmptyString() {
        String input = null;
        String output = rtrim(input);
        Assertions.assertEquals(input, output);
    }
    
    @Test
    public void testWhitespaceString() {
        String input = "   ";
        String output = rtrim(input);
        Assertions.assertEquals("", output);
    }
    
    @Test
    public void testMixedString() {
        String input = "hello world   ";
        String output = rtrim(input);
        Assertions.assertEquals("hello world", output);
    }
    
    private String rtrim(String input) {
        if (input == null) {
            return null;
        }
        int length = input.length();
        while (length > 0 && Character.isWhitespace(input.charAt(length - 1))) {
            length--;
        }
        return input.substring(0, length);
    }
}