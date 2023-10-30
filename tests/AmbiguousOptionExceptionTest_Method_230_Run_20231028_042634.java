package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.cli.AmbiguousOptionException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AmbiguousOptionExceptionTest_Method_230_Run_20231028_042634 {
    @Test
    public void testGetMatchingOptions() {
        // Create a mock collection of options
        Collection<String> options = mock(Collection.class);
        when(options.iterator()).thenReturn(new ArrayList<String>().iterator());

        // Create a mock AmbiguousOptionException
        AmbiguousOptionException exception = mock(AmbiguousOptionException.class);
        when(exception.getMatchingOptions()).thenReturn(options);

        // Test that the method returns the expected collection
        Collection<String> actualOptions = exception.getMatchingOptions();
        assertEquals(options, actualOptions);
    }

    @Test
    public void testGetMatchingOptionsWithNull() {
        // Create a mock AmbiguousOptionException
        AmbiguousOptionException exception = mock(AmbiguousOptionException.class);
        when(exception.getMatchingOptions()).thenReturn(null);

        // Test that the method returns null
        Collection<String> actualOptions = exception.getMatchingOptions();
        assertEquals(null, actualOptions);
    }

    @Test
    public void testGetMatchingOptionsWithEmpty() {
        // Create a mock AmbiguousOptionException
        AmbiguousOptionException exception = mock(AmbiguousOptionException.class);
        when(exception.getMatchingOptions()).thenReturn(new ArrayList<String>());

        // Test that the method returns an empty collection
        Collection<String> actualOptions = exception.getMatchingOptions();
        assertNotNull(actualOptions);
        assertEquals(0, actualOptions.size());
    }
}