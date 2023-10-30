package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.when;

public class BasicParserTest_Method_226_Run_20231024_004630 {
    @Test
    void testFlattenEmptyArguments() {
        // Given
        Options options = Mockito.mock(Options.class);
        String[] arguments = new String[0];
        boolean stopAtNonOption = false;

        // When
        String[] result = new BasicParser().flatten(options, arguments, stopAtNonOption);

        // Then
        assertArrayEquals(arguments, result);
    }

    @Test
    void testFlattenValidOptions() {
        // Given
        Options options = Mockito.mock(Options.class);
        String[] arguments = new String[]{"-a", "-b"};
        boolean stopAtNonOption = false;

        // When
        String[] result = new BasicParser().flatten(options, arguments, stopAtNonOption);

        // Then
        assertArrayEquals(arguments, result);
    }

    @Test
    void testFlattenMixedOptionsAndNonOptions() {
        // Given
        Options options = Mockito.mock(Options.class);
        String[] arguments = new String[]{"-a", "-b", "--", "non-option"};
        boolean stopAtNonOption = true;

        // When
        String[] result = new BasicParser().flatten(options, arguments, stopAtNonOption);

        // Then
        assertArrayEquals(arguments, result);
    }
}