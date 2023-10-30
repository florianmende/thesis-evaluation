package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class AmbiguousOptionExceptionTest_Method_230_Run_20231026_105918 {

    @Test
    public void testGetMatchingOptions() {
        // Case 1: partial name matches a single option
        String option = "option1";
        Collection<String> matchingOptions = new ArrayList<>();
        matchingOptions.add(option);

        AmbiguousOptionException exception = new AmbiguousOptionException(option, matchingOptions);
        Collection<String> actualOptions = exception.getMatchingOptions();

        assertEquals(1, actualOptions.size());
        assertTrue(actualOptions.contains(option));

        // Case 2: partial name matches multiple options
        option = "option";
        matchingOptions = new ArrayList<>();
        matchingOptions.add("option1");
        matchingOptions.add("option2");
        matchingOptions.add("option3");

        exception = new AmbiguousOptionException(option, matchingOptions);
        actualOptions = exception.getMatchingOptions();

        assertEquals(3, actualOptions.size());
        assertTrue(actualOptions.contains("option1"));
        assertTrue(actualOptions.contains("option2"));
        assertTrue(actualOptions.contains("option3"));

        // Case 3: partial name does not match any options
        option = "invalid";
        matchingOptions = new ArrayList<>();

        exception = new AmbiguousOptionException(option, matchingOptions);
        actualOptions = exception.getMatchingOptions();

        assertEquals(0, actualOptions.size());
    }
}