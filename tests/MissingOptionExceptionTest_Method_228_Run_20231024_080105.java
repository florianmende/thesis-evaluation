package org.apache.commons.cli;

import org.apache.commons.cli.MissingOptionException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MissingOptionExceptionTest_Method_228_Run_20231024_080105 {

    @Test
    void testGetMissingOptionsEmptyList() {
        MissingOptionException exception = new MissingOptionException(new ArrayList<>());
        List<String> missingOptions = exception.getMissingOptions();
        assertTrue(missingOptions.isEmpty());
    }

    @Test
    void testGetMissingOptionsSingleElement() {
        List<String> missingOptions = new ArrayList<>();
        missingOptions.add("-a");
        MissingOptionException exception = new MissingOptionException(missingOptions);
        assertEquals(1, exception.getMissingOptions().size());
        assertEquals("-a", exception.getMissingOptions().get(0));
    }

    @Test
    void testGetMissingOptionsMultipleElements() {
        List<String> missingOptions = new ArrayList<>();
        missingOptions.add("-a");
        missingOptions.add("-b");
        MissingOptionException exception = new MissingOptionException(missingOptions);
        assertEquals(2, exception.getMissingOptions().size());
        assertEquals("-a", exception.getMissingOptions().get(0));
        assertEquals("-b", exception.getMissingOptions().get(1));
    }
}