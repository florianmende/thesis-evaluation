package org.apache.commons.cli;

import org.apache.commons.cli.MissingOptionException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MissingOptionExceptionTest_Method_228_Run_20231028_022628 {

    @Test
    void testGetMissingOptionsWithMissingOptions() {
        // Arrange
        List<String> missingOptions = new ArrayList<>();
        missingOptions.add("option1");
        missingOptions.add("option2");
        MissingOptionException exception = new MissingOptionException(missingOptions);

        // Act
        List<String> actualMissingOptions = exception.getMissingOptions();

        // Assert
        assertEquals(missingOptions, actualMissingOptions);
    }

    @Test
    void testGetMissingOptionsWithNoMissingOptions() {
        // Arrange
        List<String> missingOptions = new ArrayList<>();
        MissingOptionException exception = new MissingOptionException(missingOptions);

        // Act
        List<String> actualMissingOptions = exception.getMissingOptions();

        // Assert
        assertTrue(actualMissingOptions.isEmpty());
    }

    @Test
    void testGetMissingOptionsWithMultipleMissingOptions() {
        // Arrange
        List<String> missingOptions = new ArrayList<>();
        missingOptions.add("option1");
        missingOptions.add("option2");
        missingOptions.add("option3");
        MissingOptionException exception = new MissingOptionException(missingOptions);

        // Act
        List<String> actualMissingOptions = exception.getMissingOptions();

        // Assert
        assertEquals(missingOptions, actualMissingOptions);
    }
}