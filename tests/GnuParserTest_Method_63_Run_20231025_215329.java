package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class GnuParserTest_Method_63_Run_20231025_215329 {
    @Test
    public void testFlattenWithNullInput() {
        GnuParser parser = new GnuParser();
        String[] input = null;
        Options options = mock(Options.class);
        boolean stopAtNonOption = false;
        String[] expected = new String[0];

        if (input != null) {
            String[] actual = parser.flatten(options, input, stopAtNonOption);
            assertArrayEquals(expected, actual);
        }
    }

    @Test
    public void testFlattenWithEmptyInput() {
        GnuParser parser = new GnuParser();
        String[] input = new String[0];
        Options options = mock(Options.class);
        boolean stopAtNonOption = false;
        String[] expected = new String[0];

        String[] actual = parser.flatten(options, input, stopAtNonOption);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenWithOnlyOptions() {
        GnuParser parser = new GnuParser();
        String[] input = new String[] { "-a", "-b", "-c" };
        Options options = mock(Options.class);
        when(options.hasOption("a")).thenReturn(true);
        when(options.hasOption("b")).thenReturn(true);
        when(options.hasOption("c")).thenReturn(true);
        boolean stopAtNonOption = false;
        String[] expected = new String[] { "-a", "-b", "-c" };

        String[] actual = parser.flatten(options, input, stopAtNonOption);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenWithMixOfOptionsAndNonOptions() {
        GnuParser parser = new GnuParser();
        String[] input = new String[] { "-a", "-b", "c", "-d" };
        Options options = mock(Options.class);
        when(options.hasOption("a")).thenReturn(true);
        when(options.hasOption("b")).thenReturn(true);
        when(options.hasOption("d")).thenReturn(true);
        boolean stopAtNonOption = false;
        String[] expected = new String[] { "-a", "-b", "c", "-d" };

        String[] actual = parser.flatten(options, input, stopAtNonOption);

        assertArrayEquals(expected, actual);
    }
}