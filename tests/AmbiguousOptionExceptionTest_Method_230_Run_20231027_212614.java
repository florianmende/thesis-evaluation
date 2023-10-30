package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AmbiguousOptionExceptionTest_Method_230_Run_20231027_212614 {

    @Test
    void testGetMatchingOptions_empty() {
        // Given
        Collection<String> matchingOptions = new HashSet<>();
        AmbiguousOptionException exception = new AmbiguousOptionException("test", matchingOptions);

        // When
        Collection<String> result = exception.getMatchingOptions();

        // Then
        assertTrue(result.isEmpty());
    }

    @Test
    void testGetMatchingOptions_oneOption() {
        // Given
        Collection<String> matchingOptions = new HashSet<>();
        matchingOptions.add("test");
        AmbiguousOptionException exception = new AmbiguousOptionException("test", matchingOptions);

        // When
        Collection<String> result = exception.getMatchingOptions();

        // Then
        assertEquals(1, result.size());
        assertTrue(result.contains("test"));
    }

    @Test
    void testGetMatchingOptions_multipleOptions() {
        // Given
        Collection<String> matchingOptions = new HashSet<>();
        matchingOptions.add("test1");
        matchingOptions.add("test2");
        AmbiguousOptionException exception = new AmbiguousOptionException("test", matchingOptions);

        // When
        Collection<String> result = exception.getMatchingOptions();

        // Then
        assertEquals(2, result.size());
        assertTrue(result.contains("test1"));
        assertTrue(result.contains("test2"));
    }
}