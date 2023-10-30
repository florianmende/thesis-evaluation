package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.cli.AmbiguousOptionException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AmbiguousOptionExceptionTest_Method_230_Run_20231028_032631 {

    @Test
    void testGetMatchingOptions_SingleMatch() {
        // Set up mocks
        Collection<String> matchingOptions = new ArrayList<>();
        matchingOptions.add("option1");
        AmbiguousOptionException exception = new AmbiguousOptionException("option1", matchingOptions);

        // Call the method and verify the result
        Collection<String> result = exception.getMatchingOptions();
        assertEquals(matchingOptions, result);
    }

    @Test
    void testGetMatchingOptions_MultipleMatches() {
        // Set up mocks
        Collection<String> matchingOptions = new ArrayList<>();
        matchingOptions.add("option1");
        matchingOptions.add("option2");
        AmbiguousOptionException exception = new AmbiguousOptionException("option1", matchingOptions);

        // Call the method and verify the result
        Collection<String> result = exception.getMatchingOptions();
        assertEquals(matchingOptions, result);
    }

    @Test
    void testGetMatchingOptions_NoMatches() {
        // Set up mocks
        Collection<String> matchingOptions = new ArrayList<>();
        AmbiguousOptionException exception = new AmbiguousOptionException("option1", matchingOptions);

        // Call the method and verify the result
        Collection<String> result = exception.getMatchingOptions();
        assertEquals(0, result.size());
    }
}