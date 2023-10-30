package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.MissingOptionException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

public class MissingOptionExceptionTest_Method_228_Run_20231028_032631 {

    @Test
    public void testGetMissingOptionsEmpty() throws Exception {
        MissingOptionException ex = new MissingOptionException(new ArrayList<>());
        Field missingOptionsField = MissingOptionException.class.getDeclaredField("missingOptions");
        missingOptionsField.setAccessible(true);
        List<Option> missingOptions = (List<Option>) missingOptionsField.get(ex);
        assertNotNull(missingOptions);
        assertEquals(0, missingOptions.size());
    }

    @Test
    public void testGetMissingOptionsSingle() throws Exception {
        Option option = mock(Option.class);
        when(option.getOpt()).thenReturn("option1");
        List<Option> missingOptions = new ArrayList<>();
        missingOptions.add(option);
        MissingOptionException ex = new MissingOptionException(missingOptions);
        Field missingOptionsField = MissingOptionException.class.getDeclaredField("missingOptions");
        missingOptionsField.setAccessible(true);
        List<Option> actualMissingOptions = (List<Option>) missingOptionsField.get(ex);
        assertNotNull(actualMissingOptions);
        assertEquals(1, actualMissingOptions.size());
        assertEquals(option, actualMissingOptions.get(0));
    }

    @Test
    public void testGetMissingOptionsMultiple() throws Exception {
        Option option1 = mock(Option.class);
        when(option1.getOpt()).thenReturn("option1");
        Option option2 = mock(Option.class);
        when(option2.getOpt()).thenReturn("option2");
        List<Option> missingOptions = new ArrayList<>();
        missingOptions.add(option1);
        missingOptions.add(option2);
        MissingOptionException ex = new MissingOptionException(missingOptions);
        Field missingOptionsField = MissingOptionException.class.getDeclaredField("missingOptions");
        missingOptionsField.setAccessible(true);
        List<Option> actualMissingOptions = (List<Option>) missingOptionsField.get(ex);
        assertNotNull(actualMissingOptions);
        assertEquals(2, actualMissingOptions.size());
        assertEquals(option1, actualMissingOptions.get(0));
        assertEquals(option2, actualMissingOptions.get(1));
    }
}