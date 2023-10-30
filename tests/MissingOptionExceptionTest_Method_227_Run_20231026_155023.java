package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingOptionExceptionTest_Method_227_Run_20231026_155023 {
    @Test
    public void testCreateMessage() {
        // Create a list of missing options and groups
        List<String> missingOptions = new ArrayList<>();
        missingOptions.add("option1");
        missingOptions.add("option2");
        missingOptions.add("option3");

        // Create a mock instance of the MissingOptionException class
        MissingOptionException mockException = Mockito.mock(MissingOptionException.class);

        // Configure the mock to return the expected list of missing options
        Mockito.when(mockException.getMissingOptions()).thenReturn(missingOptions);

        // Call the getMissingOptions method with the list of missing options and groups
        List<String> actualMissingOptions = mockException.getMissingOptions();

        // Assert that the list of missing options is correct
        assertEquals(missingOptions, actualMissingOptions);
    }

    @Test
    public void testCreateMessageWithEmptyList() {
        // Create an empty list of missing options and groups
        List<String> missingOptions = new ArrayList<>();

        // Create a mock instance of the MissingOptionException class
        MissingOptionException mockException = Mockito.mock(MissingOptionException.class);

        // Configure the mock to return an empty list of missing options
        Mockito.when(mockException.getMissingOptions()).thenReturn(missingOptions);

        // Call the getMissingOptions method with the empty list
        List<String> actualMissingOptions = mockException.getMissingOptions();

        // Assert that the list of missing options is correct
        assertEquals(missingOptions, actualMissingOptions);
    }

    @Test
    public void testCreateMessageWithSingleOption() {
        // Create a list of missing options and groups with a single option
        List<String> missingOptions = new ArrayList<>();
        missingOptions.add("option1");

        // Create a mock instance of the MissingOptionException class
        MissingOptionException mockException = Mockito.mock(MissingOptionException.class);

        // Configure the mock to return the expected list of missing options
        Mockito.when(mockException.getMissingOptions()).thenReturn(missingOptions);

        // Call the getMissingOptions method with the list of missing options and groups
        List<String> actualMissingOptions = mockException.getMissingOptions();

        // Assert that the list of missing options is correct
        assertEquals(missingOptions, actualMissingOptions);
    }
}