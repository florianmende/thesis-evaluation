package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HelpFormatterTest_Method_205_Run_20231028_022628 {
    @Test
    void testRtrim() throws Exception {
        // Case 1: Input String is null or empty
        HelpFormatter formatter = new HelpFormatter();
        String input = null;
        String output = formatter.rtrim(input);
        Assertions.assertEquals(input, output);

        // Case 2: Input String contains only whitespace characters
        input = "   ";
        output = formatter.rtrim(input);
        Assertions.assertEquals("", output);

        // Case 3: Input String contains a mix of whitespace and non-whitespace characters
        input = "Hello World   ";
        output = formatter.rtrim(input);
        Assertions.assertEquals("Hello World", output);
    }
}