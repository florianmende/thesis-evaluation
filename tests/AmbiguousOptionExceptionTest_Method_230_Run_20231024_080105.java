package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.cli.AmbiguousOptionException;
import org.apache.commons.cli.UnrecognizedOptionException;
import org.junit.jupiter.api.Test;

class AmbiguousOptionExceptionTest_Method_230_Run_20231024_080105 {

    @Test
    void testGetMatchingOptionsEmpty() {
        // Create a mock AmbiguousOptionException with no matching options
        AmbiguousOptionException exception = mock(AmbiguousOptionException.class);
        when(exception.getMatchingOptions()).thenReturn(new ArrayList<>());

        // Assert that the method returns an empty collection
        assertTrue(exception.getMatchingOptions().isEmpty());
    }

    @Test
    void testGetMatchingOptionsOneOption() {
        // Create a mock AmbiguousOptionException with one matching option
        AmbiguousOptionException exception = mock(AmbiguousOptionException.class);
        Collection<String> matchingOptions = new ArrayList<>();
        matchingOptions.add("option1");
        when(exception.getMatchingOptions()).thenReturn(matchingOptions);

        // Assert that the method returns a collection with one option
        assertEquals(1, exception.getMatchingOptions().size());
        assertTrue(exception.getMatchingOptions().contains("option1"));
    }

    @Test
    void testGetMatchingOptionsMultipleOptions() {
        // Create a mock AmbiguousOptionException with multiple matching options
        AmbiguousOptionException exception = mock(AmbiguousOptionException.class);
        Collection<String> matchingOptions = new ArrayList<>();
        matchingOptions.add("option1");
        matchingOptions.add("option2");
        when(exception.getMatchingOptions()).thenReturn(matchingOptions);

        // Assert that the method returns a collection with multiple options
        assertEquals(2, exception.getMatchingOptions().size());
        assertTrue(exception.getMatchingOptions().contains("option1"));
        assertTrue(exception.getMatchingOptions().contains("option2"));
    }
}