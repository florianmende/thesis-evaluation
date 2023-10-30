package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Options;
import org.apache.commons.cli.Parser;
import org.junit.jupiter.api.Test;

public class GnuParserTest_Method_63_Run_20231030_094427 {
    @Test
    public void testFlattenEmptyArguments() {
        // Given
        Options options = mock(Options.class);
        String[] arguments = new String[0];
        boolean stopAtNonOption = false;

        // When
        String[] result = new GnuParser().flatten(options, arguments, stopAtNonOption);

        // Then
        assertArrayEquals(new String[0], result);
    }

    @Test
    public void testFlattenOnlyOptions() {
        // Given
        Options options = mock(Options.class);
        String[] arguments = new String[] {"-a", "-b"};
        boolean stopAtNonOption = false;

        // When
        String[] result = new GnuParser().flatten(options, arguments, stopAtNonOption);

        // Then
        assertArrayEquals(new String[] {"-a", "-b"}, result);
    }

    @Test
    public void testFlattenMixedOptionsAndNonOptions() {
        // Given
        Options options = mock(Options.class);
        String[] arguments = new String[] {"-a", "foo", "-b"};
        boolean stopAtNonOption = false;

        // When
        String[] result = new GnuParser().flatten(options, arguments, stopAtNonOption);

        // Then
        assertArrayEquals(new String[] {"-a", "foo", "-b"}, result);
    }
}