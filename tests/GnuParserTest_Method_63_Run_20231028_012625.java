package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GnuParserTest_Method_63_Run_20231028_012625 {

    @Test
    public void testFlatten() {
        GnuParser parser = new GnuParser();

        // Test case 1: No options
        String[] arguments = new String[]{"arg1", "arg2"};
        String[] expected = new String[]{"arg1", "arg2"};
        String[] actual = parser.flatten(null, arguments, false);
        assertArrayEquals(expected, actual);

        // Test case 2: Options with no arguments
        Options options = new Options();
        options.addOption(Option.builder("a").build());
        options.addOption(Option.builder("b").build());
        arguments = new String[]{"-a", "-b"};
        expected = new String[]{"-a", "-b"};
        actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);

        // Test case 3: Options with arguments
        options = new Options();
        options.addOption(Option.builder("a").hasArg().build());
        options.addOption(Option.builder("b").hasArg().build());
        arguments = new String[]{"-a", "value1", "-b", "value2"};
        expected = new String[]{"-a", "value1", "-b", "value2"};
        actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);

        // Test case 4: Mixed options and arguments
        options = new Options();
        options.addOption(Option.builder("a").hasArg().build());
        options.addOption(Option.builder("b").hasArg().build());
        arguments = new String[]{"arg1", "-a", "value1", "arg2", "-b", "value2"};
        expected = new String[]{"arg1", "-a", "value1", "arg2", "-b", "value2"};
        actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);

        // Test case 5: Stop at non-option
        options = new Options();
        options.addOption(Option.builder("a").hasArg().build());
        options.addOption(Option.builder("b").hasArg().build());
        arguments = new String[]{"arg1", "-a", "value1", "arg2", "-b", "value2"};
        expected = new String[]{"arg1", "-a", "value1", "arg2", "-b", "value2"};
        actual = parser.flatten(options, arguments, true);
        assertArrayEquals(expected, actual);

        // Test case 6: Special properties option
        options = new Options();
        options.addOption(Option.builder("D").hasArg().build());
        arguments = new String[]{"-Dproperty=value"};
        expected = new String[]{"-D", "property=value"};
        actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);

        // Test case 7: Multiple special properties options
        options = new Options();
        options.addOption(Option.builder("D").hasArg().build());
        arguments = new String[]{"-Dproperty1=value1", "-Dproperty2=value2"};
        expected = new String[]{"-D", "property1=value1", "-D", "property2=value2"};
        actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);

        // Test case 8: Mixed special properties options and regular options
        options = new Options();
        options.addOption(Option.builder("D").hasArg().build());
        options.addOption(Option.builder("a").hasArg().build());
        arguments = new String[]{"-Dproperty=value", "-a", "value"};
        expected = new String[]{"-D", "property=value", "-a", "value"};
        actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }
}