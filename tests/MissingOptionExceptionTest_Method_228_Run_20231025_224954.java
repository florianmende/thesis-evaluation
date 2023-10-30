package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.MissingOptionException;
import org.junit.jupiter.api.Test;

public class MissingOptionExceptionTest_Method_228_Run_20231025_224954 {

    @Test
    public void testGetMissingOptions_emptyList() {
        MissingOptionException exception = new MissingOptionException(new ArrayList<>());
        assertTrue(exception.getMissingOptions().isEmpty());
    }

    @Test
    public void testGetMissingOptions_singleOption() {
        List<String> options = new ArrayList<>();
        options.add("option1");
        MissingOptionException exception = new MissingOptionException(options);
        assertEquals(1, exception.getMissingOptions().size());
        assertEquals("option1", exception.getMissingOptions().get(0));
    }

    @Test
    public void testGetMissingOptions_multipleOptions() {
        List<String> options = new ArrayList<>();
        options.add("option1");
        options.add("option2");
        MissingOptionException exception = new MissingOptionException(options);
        assertEquals(2, exception.getMissingOptions().size());
        assertEquals("option1", exception.getMissingOptions().get(0));
        assertEquals("option2", exception.getMissingOptions().get(1));
    }
}