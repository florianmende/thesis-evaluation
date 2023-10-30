package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.cli.AmbiguousOptionException;
import org.junit.jupiter.api.Test;

class AmbiguousOptionExceptionTest_Method_230_Run_20231024_145023 {

    @Test
    void testGetMatchingOptions_EmptyCollection() {
        // Arrange
        Collection<String> matchingOptions = new ArrayList<>();
        AmbiguousOptionException exception = new AmbiguousOptionException("test", matchingOptions);

        // Act
        Collection<String> result = exception.getMatchingOptions();

        // Assert
        assertTrue(result.isEmpty());
    }

    @Test
    void testGetMatchingOptions_SingleOption() {
        // Arrange
        Collection<String> matchingOptions = new ArrayList<>();
        matchingOptions.add("test");
        AmbiguousOptionException exception = new AmbiguousOptionException("test", matchingOptions);

        // Act
        Collection<String> result = exception.getMatchingOptions();

        // Assert
        assertEquals(1, result.size());
        assertTrue(result.contains("test"));
    }

    @Test
    void testGetMatchingOptions_MultipleOptions() {
        // Arrange
        Collection<String> matchingOptions = new ArrayList<>();
        matchingOptions.add("test1");
        matchingOptions.add("test2");
        matchingOptions.add("test3");
        AmbiguousOptionException exception = new AmbiguousOptionException("test", matchingOptions);

        // Act
        Collection<String> result = exception.getMatchingOptions();

        // Assert
        assertEquals(3, result.size());
        assertTrue(result.contains("test1"));
        assertTrue(result.contains("test2"));
        assertTrue(result.contains("test3"));
    }
}