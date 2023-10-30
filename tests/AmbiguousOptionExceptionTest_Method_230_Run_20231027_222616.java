package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class AmbiguousOptionExceptionTest_Method_230_Run_20231027_222616 {
    @Test
    public void testGetMatchingOptionsEmpty() {
        // Create an instance of the class under test
        AmbiguousOptionException exception = new AmbiguousOptionException("test", new ArrayList<>());

        // Call the method and get the result
        Collection<String> result = exception.getMatchingOptions();

        // Assert that the result is an empty collection
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetMatchingOptionsSingle() {
        // Create an instance of the class under test
        AmbiguousOptionException exception = new AmbiguousOptionException("test", List.of("test"));

        // Call the method and get the result
        Collection<String> result = exception.getMatchingOptions();

        // Assert that the result is a collection with a single element
        assertEquals(1, result.size());
        assertEquals("test", result.iterator().next());
    }

    @Test
    public void testGetMatchingOptionsMultiple() {
        // Create an instance of the class under test
        AmbiguousOptionException exception = new AmbiguousOptionException("test", List.of("test1", "test2"));

        // Call the method and get the result
        Collection<String> result = exception.getMatchingOptions();

        // Assert that the result is a collection with multiple elements
        assertTrue(result.size() > 1);
        assertTrue(result.contains("test1"));
        assertTrue(result.contains("test2"));
    }
}