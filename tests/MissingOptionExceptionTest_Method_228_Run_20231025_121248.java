package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class MissingOptionExceptionTest_Method_228_Run_20231025_121248 {

    @Test
    public void testGetMissingOptions() {
        List<String> missingOptions = new ArrayList<>();
        missingOptions.add("option1");
        missingOptions.add("option2");

        MissingOptionException exception = new MissingOptionException(missingOptions);

        List<String> actualMissingOptions = exception.getMissingOptions();

        assertNotNull(actualMissingOptions);
        assertEquals(2, actualMissingOptions.size());
        assertEquals("option1", actualMissingOptions.get(0));
        assertEquals("option2", actualMissingOptions.get(1));
    }
}