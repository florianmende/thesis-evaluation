package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class AmbiguousOptionExceptionTest_Method_230_Run_20231025_100630 {
    @Test
    void testGetMatchingOptions_empty() {
        // Given
        final String option = "test";
        final Collection<String> matchingOptions = Collections.emptyList();

        // When
        final Collection<String> actual = new AmbiguousOptionException(option, matchingOptions).getMatchingOptions();

        // Then
        assertTrue(actual.isEmpty());
    }

    @Test
    void testGetMatchingOptions_single() {
        // Given
        final String option = "test";
        final Collection<String> matchingOptions = Collections.singletonList("test");

        // When
        final Collection<String> actual = new AmbiguousOptionException(option, matchingOptions).getMatchingOptions();

        // Then
        assertEquals(1, actual.size());
        assertEquals("test", actual.iterator().next());
    }

    @Test
    void testGetMatchingOptions_multiple() {
        // Given
        final String option = "test";
        final Collection<String> matchingOptions = Arrays.asList("test1", "test2", "test3");

        // When
        final Collection<String> actual = new AmbiguousOptionException(option, matchingOptions).getMatchingOptions();

        // Then
        assertEquals(3, actual.size());
        assertTrue(actual.contains("test1"));
        assertTrue(actual.contains("test2"));
        assertTrue(actual.contains("test3"));
    }
}