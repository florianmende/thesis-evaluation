package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Collection;
import java.util.ArrayList;

class AmbiguousOptionExceptionTest_Method_230_Run_20231025_215329 {
    @Test
    void testGetMatchingOptions_EmptyCollection() {
        // Arrange
        Collection<String> matchingOptions = new ArrayList<>();
        AmbiguousOptionException exception = new AmbiguousOptionException("test", matchingOptions);

        // Act
        Collection<String> result = exception.getMatchingOptions();

        // Assert
        assertEquals(matchingOptions, result);
    }

    @Test
    void testGetMatchingOptions_SingleMatchingOption() {
        // Arrange
        Collection<String> matchingOptions = new ArrayList<>();
        matchingOptions.add("test");
        AmbiguousOptionException exception = new AmbiguousOptionException("test", matchingOptions);

        // Act
        Collection<String> result = exception.getMatchingOptions();

        // Assert
        assertEquals(matchingOptions, result);
    }

    @Test
    void testGetMatchingOptions_MultipleMatchingOptions() {
        // Arrange
        Collection<String> matchingOptions = new ArrayList<>();
        matchingOptions.add("test1");
        matchingOptions.add("test2");
        AmbiguousOptionException exception = new AmbiguousOptionException("test", matchingOptions);

        // Act
        Collection<String> result = exception.getMatchingOptions();

        // Assert
        assertEquals(matchingOptions, result);
    }
}