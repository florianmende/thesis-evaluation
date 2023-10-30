package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MissingOptionExceptionTest_Method_228_Run_20231024_082502 {
    @Test
    public void testGetMissingOptions_emptyList() {
        // Create a mock MissingOptionException object with an empty list of missing options
        MissingOptionException mockException = Mockito.mock(MissingOptionException.class);
        Mockito.when(mockException.getMissingOptions()).thenReturn(List.of());

        // Call the getMissingOptions() method and verify that it returns an empty list
        List<String> missingOptions = mockException.getMissingOptions();
        assertTrue(missingOptions.isEmpty());
    }

    @Test
    public void testGetMissingOptions_singleOption() {
        // Create a mock MissingOptionException object with a list of one missing option
        MissingOptionException mockException = Mockito.mock(MissingOptionException.class);
        Mockito.when(mockException.getMissingOptions()).thenReturn(List.of("-a"));

        // Call the getMissingOptions() method and verify that it returns a list with one option
        List<String> missingOptions = mockException.getMissingOptions();
        assertEquals(1, missingOptions.size());
        assertEquals("-a", missingOptions.get(0));
    }

    @Test
    public void testGetMissingOptions_multipleOptions() {
        // Create a mock MissingOptionException object with a list of multiple missing options
        MissingOptionException mockException = Mockito.mock(MissingOptionException.class);
        Mockito.when(mockException.getMissingOptions()).thenReturn(List.of("-a", "-b", "-c"));

        // Call the getMissingOptions() method and verify that it returns a list with multiple options
        List<String> missingOptions = mockException.getMissingOptions();
        assertEquals(3, missingOptions.size());
        assertEquals("-a", missingOptions.get(0));
        assertEquals("-b", missingOptions.get(1));
        assertEquals("-c", missingOptions.get(2));
    }
}