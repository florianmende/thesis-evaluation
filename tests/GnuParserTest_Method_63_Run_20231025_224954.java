package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Options;
import org.apache.commons.cli.Parser;
import org.junit.jupiter.api.Test;

public class GnuParserTest_Method_63_Run_20231025_224954 {
    @Test
    public void testFlatten_emptyArguments() {
        Options options = mock(Options.class);
        String[] arguments = new String[0];
        boolean stopAtNonOption = false;

        String[] expected = new String[0];
        String[] actual = new GnuParser().flatten(options, arguments, stopAtNonOption);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlatten_singleArgument() {
        Options options = mock(Options.class);
        String[] arguments = new String[] { "--foo" };
        boolean stopAtNonOption = false;

        String[] expected = new String[] { "--foo" };
        String[] actual = new GnuParser().flatten(options, arguments, stopAtNonOption);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlatten_multipleArguments() {
        Options options = mock(Options.class);
        String[] arguments = new String[] { "--foo", "bar", "--baz" };
        boolean stopAtNonOption = false;

        String[] expected = new String[] { "--foo", "bar", "--baz" };
        String[] actual = new GnuParser().flatten(options, arguments, stopAtNonOption);

        assertArrayEquals(expected, actual);
    }
}