package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import org.apache.commons.cli.AmbiguousOptionException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.Arrays;

class AmbiguousOptionExceptionTest_Method_230_Run_20231028_012625 {

    @Test
    void testGetMatchingOptions_empty() {
        // Arrange
        AmbiguousOptionException exception = Mockito.mock(AmbiguousOptionException.class);
        Mockito.when(exception.getMatchingOptions()).thenReturn(Collections.emptyList());

        // Act
        Collection<String> options = exception.getMatchingOptions();

        // Assert
        assertTrue(options.isEmpty());
    }

    @Test
    void testGetMatchingOptions_singleOption() {
        // Arrange
        AmbiguousOptionException exception = Mockito.mock(AmbiguousOptionException.class);
        Mockito.when(exception.getMatchingOptions()).thenReturn(Collections.singletonList("-h"));

        // Act
        Collection<String> options = exception.getMatchingOptions();

        // Assert
        assertEquals(1, options.size());
        assertTrue(options.contains("-h"));
    }

    @Test
    void testGetMatchingOptions_multipleOptions() {
        // Arrange
        AmbiguousOptionException exception = Mockito.mock(AmbiguousOptionException.class);
        Mockito.when(exception.getMatchingOptions()).thenReturn(Arrays.asList("-h", "-help", "--help"));

        // Act
        Collection<String> options = exception.getMatchingOptions();

        // Assert
        assertEquals(3, options.size());
        assertTrue(options.contains("-h"));
        assertTrue(options.contains("-help"));
        assertTrue(options.contains("--help"));
    }
}