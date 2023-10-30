package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.MissingOptionException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

public class MissingOptionExceptionTest_Method_228_Run_20231028_052637 {

    @Test
    public void testGetMissingOptionsEmpty() {
        MissingOptionException exception = mock(MissingOptionException.class);
        List<Object> missingOptions = new ArrayList<>();
        when(exception.getMissingOptions()).thenReturn(missingOptions);
        assertEquals(0, exception.getMissingOptions().size());
    }

    @Test
    public void testGetMissingOptionsOneOption() {
        MissingOptionException exception = mock(MissingOptionException.class);
        Option option = mock(Option.class);
        List<Object> missingOptions = new ArrayList<>();
        missingOptions.add(option);
        when(exception.getMissingOptions()).thenReturn(missingOptions);
        assertEquals(1, exception.getMissingOptions().size());
        assertTrue(exception.getMissingOptions().contains(option));
    }

    @Test
    public void testGetMissingOptionsMultipleOptions() {
        MissingOptionException exception = mock(MissingOptionException.class);
        Option option1 = mock(Option.class);
        Option option2 = mock(Option.class);
        OptionGroup group = mock(OptionGroup.class);
        List<Object> missingOptions = new ArrayList<>();
        missingOptions.add(option1);
        missingOptions.add(option2);
        missingOptions.add(group);
        when(exception.getMissingOptions()).thenReturn(missingOptions);
        assertEquals(3, exception.getMissingOptions().size());
        assertTrue(exception.getMissingOptions().contains(option1));
        assertTrue(exception.getMissingOptions().contains(option2));
        assertTrue(exception.getMissingOptions().contains(group));
    }
}