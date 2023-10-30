package org.apache.commons.cli;


import org.apache.commons.cli.AmbiguousOptionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class AmbiguousOptionExceptionTest_Method_230_Run_20231025_121248 {

    @Test
    void testGetMatchingOptionsEmpty() {
        // Create a mock AmbiguousOptionException with an empty list of matching options
        AmbiguousOptionException mockException = Mockito.mock(AmbiguousOptionException.class);
        Mockito.when(mockException.getMatchingOptions()).thenReturn(Arrays.asList());

        // Verify that the method returns an empty collection
        Collection<String> matchingOptions = mockException.getMatchingOptions();
        Assertions.assertTrue(matchingOptions.isEmpty());
    }

    @Test
    void testGetMatchingOptionsSingleOption() {
        // Create a mock AmbiguousOptionException with a list of one matching option
        AmbiguousOptionException mockException = Mockito.mock(AmbiguousOptionException.class);
        Mockito.when(mockException.getMatchingOptions()).thenReturn(Arrays.asList("option1"));

        // Verify that the method returns a collection with one option
        Collection<String> matchingOptions = mockException.getMatchingOptions();
        Assertions.assertEquals(1, matchingOptions.size());
        Assertions.assertEquals("option1", matchingOptions.iterator().next());
    }

    @Test
    void testGetMatchingOptionsMultipleOptions() {
        // Create a mock AmbiguousOptionException with a list of multiple matching options
        AmbiguousOptionException mockException = Mockito.mock(AmbiguousOptionException.class);
        Mockito.when(mockException.getMatchingOptions()).thenReturn(Arrays.asList("option1", "option2", "option3"));

        // Verify that the method returns a collection with multiple options
        Collection<String> matchingOptions = mockException.getMatchingOptions();
        Assertions.assertEquals(3, matchingOptions.size());
        Iterator<String> it = matchingOptions.iterator();
        Assertions.assertEquals("option1", it.next());
        Assertions.assertEquals("option2", it.next());
        Assertions.assertEquals("option3", it.next());
    }
}