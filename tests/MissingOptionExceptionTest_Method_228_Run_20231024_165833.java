package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.MissingOptionException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MissingOptionExceptionTest_Method_228_Run_20231024_165833 {

    @Test
    public void testGetMissingOptions_EmptyList() {
        MissingOptionException exception = new MissingOptionException(new ArrayList<>());
        List<Object> missingOptions = exception.getMissingOptions();
        assertNotNull(missingOptions);
        assertTrue(missingOptions.isEmpty());
    }

    @Test
    public void testGetMissingOptions_OneMissingOption() {
        List<String> missingOptions = new ArrayList<>();
        missingOptions.add("option1");
        MissingOptionException exception = new MissingOptionException(missingOptions);
        List<Object> actualMissingOptions = exception.getMissingOptions();
        assertEquals(1, actualMissingOptions.size());
        assertEquals("option1", actualMissingOptions.get(0));
    }

    @Test
    public void testGetMissingOptions_MultipleMissingOptions() {
        List<String> missingOptions = new ArrayList<>();
        missingOptions.add("option1");
        missingOptions.add("option2");
        MissingOptionException exception = new MissingOptionException(missingOptions);
        List<Object> actualMissingOptions = exception.getMissingOptions();
        assertEquals(2, actualMissingOptions.size());
        assertEquals("option1", actualMissingOptions.get(0));
        assertEquals("option2", actualMissingOptions.get(1));
    }

    @Test
    public void testGetMissingOptions_OneMissingOptionGroup() {
        List<Object> missingOptions = new ArrayList<>();
        missingOptions.add(Mockito.mock(OptionGroup.class));
        MissingOptionException exception = new MissingOptionException(missingOptions);
        List<Object> actualMissingOptions = exception.getMissingOptions();
        assertEquals(1, actualMissingOptions.size());
        assertTrue(actualMissingOptions.get(0) instanceof OptionGroup);
    }

    @Test
    public void testGetMissingOptions_MultipleMissingOptionGroups() {
        List<Object> missingOptions = new ArrayList<>();
        missingOptions.add(Mockito.mock(OptionGroup.class));
        missingOptions.add(Mockito.mock(OptionGroup.class));
        MissingOptionException exception = new MissingOptionException(missingOptions);
        List<Object> actualMissingOptions = exception.getMissingOptions();
        assertEquals(2, actualMissingOptions.size());
        assertTrue(actualMissingOptions.get(0) instanceof OptionGroup);
        assertTrue(actualMissingOptions.get(1) instanceof OptionGroup);
    }
}