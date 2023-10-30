package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MissingOptionExceptionTest_Method_228_Run_20231023_195751 {
    @Test
    public void testGetMissingOptions_EmptyList() {
        // Arrange
        MissingOptionException exception = Mockito.mock(MissingOptionException.class);
        List<String> missingOptions = new ArrayList<>();
        Mockito.when(exception.getMissingOptions()).thenReturn(missingOptions);

        // Act
        List<String> actualMissingOptions = exception.getMissingOptions();

        // Assert
        assertNotNull(actualMissingOptions);
        assertTrue(actualMissingOptions.isEmpty());
    }

    @Test
    public void testGetMissingOptions_OneOption() {
        // Arrange
        MissingOptionException exception = Mockito.mock(MissingOptionException.class);
        List<String> missingOptions = new ArrayList<>();
        missingOptions.add("--option1");
        Mockito.when(exception.getMissingOptions()).thenReturn(missingOptions);

        // Act
        List<String> actualMissingOptions = exception.getMissingOptions();

        // Assert
        assertNotNull(actualMissingOptions);
        assertEquals(1, actualMissingOptions.size());
        assertEquals("--option1", actualMissingOptions.get(0));
    }

    @Test
    public void testGetMissingOptions_MultipleOptions() {
        // Arrange
        MissingOptionException exception = Mockito.mock(MissingOptionException.class);
        List<String> missingOptions = new ArrayList<>();
        missingOptions.add("--option1");
        missingOptions.add("--option2");
        Mockito.when(exception.getMissingOptions()).thenReturn(missingOptions);

        // Act
        List<String> actualMissingOptions = exception.getMissingOptions();

        // Assert
        assertNotNull(actualMissingOptions);
        assertEquals(2, actualMissingOptions.size());
        assertEquals("--option1", actualMissingOptions.get(0));
        assertEquals("--option2", actualMissingOptions.get(1));
    }

    @Test
    public void testGetMissingOptions_OneOptionGroup() {
        // Arrange
        MissingOptionException exception = Mockito.mock(MissingOptionException.class);
        List<String> missingOptions = new ArrayList<>();
        missingOptions.add("--option-group1");
        Mockito.when(exception.getMissingOptions()).thenReturn(missingOptions);

        // Act
        List<String> actualMissingOptions = exception.getMissingOptions();

        // Assert
        assertNotNull(actualMissingOptions);
        assertEquals(1, actualMissingOptions.size());
        assertEquals("--option-group1", actualMissingOptions.get(0));
    }

    @Test
    public void testGetMissingOptions_MultipleOptionGroups() {
        // Arrange
        MissingOptionException exception = Mockito.mock(MissingOptionException.class);
        List<String> missingOptions = new ArrayList<>();
        missingOptions.add("--option-group1");
        missingOptions.add("--option-group2");
        Mockito.when(exception.getMissingOptions()).thenReturn(missingOptions);

        // Act
        List<String> actualMissingOptions = exception.getMissingOptions();

        // Assert
        assertNotNull(actualMissingOptions);
        assertEquals(2, actualMissingOptions.size());
        assertEquals("--option-group1", actualMissingOptions.get(0));
        assertEquals("--option-group2", actualMissingOptions.get(1));
    }
}