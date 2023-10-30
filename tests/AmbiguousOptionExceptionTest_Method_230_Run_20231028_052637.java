package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.cli.AmbiguousOptionException;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class AmbiguousOptionExceptionTest_Method_230_Run_20231028_052637 {

    @Test
    public void testGetMatchingOptions() {
        // Set up
        final String option = "option";
        final Collection<String> matchingOptions = new ArrayList<>();
        matchingOptions.add("option1");
        matchingOptions.add("option2");
        matchingOptions.add("option3");

        // Mock the AmbiguousOptionException
        AmbiguousOptionException mockException = mock(AmbiguousOptionException.class);
        when(mockException.getMatchingOptions()).thenReturn(matchingOptions);

        // Call the method and verify the result
        Collection<String> result = mockException.getMatchingOptions();
        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals("option1", result.iterator().next());
    }
}