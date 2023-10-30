package org.apache.commons.cli;

import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GnuParserTest_Method_63_Run_20231028_022628 {

    @Test
    public void testFlattenEmptyArguments() {
        GnuParser parser = new GnuParser();
        Options options = mock(Options.class);
        String[] arguments = new String[0];
        boolean stopAtNonOption = false;
        String[] expected = new String[0];

        String[] actual = parser.flatten(options, arguments, stopAtNonOption);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenNonOptionArguments() {
        GnuParser parser = new GnuParser();
        Options options = mock(Options.class);
        String[] arguments = new String[]{"arg1", "arg2"};
        boolean stopAtNonOption = false;
        String[] expected = new String[]{"arg1", "arg2"};

        String[] actual = parser.flatten(options, arguments, stopAtNonOption);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenOptionArguments() {
        GnuParser parser = new GnuParser();
        Options options = mock(Options.class);
        String[] arguments = new String[]{"-a", "--b", "-c"};
        boolean stopAtNonOption = false;
        String[] expected = new String[]{"-a", "--b", "-c"};

        when(options.hasOption("a")).thenReturn(true);
        when(options.hasOption("b")).thenReturn(true);
        when(options.hasOption("c")).thenReturn(true);

        String[] actual = parser.flatten(options, arguments, stopAtNonOption);

        assertArrayEquals(expected, actual);
    }
}