package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GnuParserTest_Method_63_Run_20231027_222616 {
    @Test
    public void testFlattenEmptyArguments() {
        Options options = new Options();
        String[] arguments = new String[0];
        boolean stopAtNonOption = false;
        String[] expected = new String[0];
        GnuParser parser = new GnuParser();
        String[] actual = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenSingleArgument() {
        Options options = new Options();
        String[] arguments = new String[]{"-a"};
        boolean stopAtNonOption = false;
        String[] expected = new String[]{"-a"};
        GnuParser parser = new GnuParser();
        String[] actual = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenMultipleArguments() {
        Options options = new Options();
        String[] arguments = new String[]{"-a", "--b", "-c"};
        boolean stopAtNonOption = false;
        String[] expected = new String[]{"-a", "--b", "-c"};
        GnuParser parser = new GnuParser();
        String[] actual = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }
}