package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.apache.commons.cli.Parser;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicParserTest_Method_226_Run_20231023_204140 {
    @Test
    public void testFlatten() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // Create a new BasicParser instance
        BasicParser parser = new BasicParser();

        // Get the flatten method
        Method flattenMethod = parser.getClass().getDeclaredMethod("flatten", Options.class, String[].class, boolean.class);
        flattenMethod.setAccessible(true);

        // Test case 1: The method returns the input arguments array when it is called with valid arguments
        String[] arguments = new String[]{"-a", "arg1", "-b", "arg2"};
        Options options = new Options();
        options.addOption("a", false, "Option a");
        options.addOption("b", false, "Option b");
        String[] result = (String[]) flattenMethod.invoke(parser, options, arguments, false);
        assertArrayEquals(arguments, result);

        // Test case 2: The method returns an empty array when it is called with an empty arguments array
        arguments = new String[]{};
        result = (String[]) flattenMethod.invoke(parser, options, arguments, false);
        assertEquals(0, result.length);

        // Test case 3: The method returns the input arguments array when it is called with a non-empty arguments array and the stopAtNonOption flag is set to false
        arguments = new String[]{"-a", "arg1", "-b", "arg2"};
        result = (String[]) flattenMethod.invoke(parser, options, arguments, false);
        assertArrayEquals(arguments, result);
    }
}