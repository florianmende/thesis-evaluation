package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class AmbiguousOptionExceptionTest_Method_229_Run_20231023_214133 {
    @Test
    void testCreateMessage() {
        // Set up the mocks
        Collection<String> matchingOptions = Arrays.asList("option1", "option2", "option3");
        Iterator<String> it = matchingOptions.iterator();
        String option = "option";

        // Call the method
        AmbiguousOptionException exception = new AmbiguousOptionException(option, matchingOptions);
        String actual = exception.getMessage();

        // Assert the result
        assertEquals("Ambiguous option: 'option'  (could be: 'option1', 'option2', 'option3')", actual);
    }
}