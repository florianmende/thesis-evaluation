package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasicParserTest_Method_226_Run_20231027_222616 extends BasicParser {

    @Override
    protected String[] flatten(Options options, String[] arguments, boolean stopAtNonOption) {
        return super.flatten(options, arguments, stopAtNonOption);
    }

    @Test
    public void testFlatten() {
        Options options = new Options();
        String[] arguments = new String[] {"-a", "foo", "-b", "bar"};
        String[] expected = arguments;
        String[] actual = flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenWithStopAtNonOption() {
        Options options = new Options();
        String[] arguments = new String[] {"-a", "foo", "-b", "bar"};
        String[] expected = new String[] {"-a", "foo", "-b", "bar"};
        String[] actual = flatten(options, arguments, true);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenWithNonOptionArguments() {
        Options options = new Options();
        String[] arguments = new String[] {"foo", "bar"};
        String[] expected = new String[] {"foo", "bar"};
        String[] actual = flatten(options, arguments, true);
        assertArrayEquals(expected, actual);
    }
}