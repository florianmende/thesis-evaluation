package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class OptionTest_Method_88_Run_20231028_012625 {
    @Mock
    private Option option;

    @Test
    public void testGetValueSeparator_noValueSeparator() throws Exception {
        // Setup
        Mockito.when(option.getValueSeparator()).thenReturn(' ');

        // Execute
        char valueSeparator = option.getValueSeparator();

        // Verify
        assertEquals(' ', valueSeparator);
    }

    @Test
    public void testGetValueSeparator_customValueSeparator() throws Exception {
        // Setup
        Mockito.when(option.getValueSeparator()).thenReturn('=');

        // Execute
        char valueSeparator = option.getValueSeparator();

        // Verify
        assertEquals('=', valueSeparator);
    }

    @Test
    public void testGetValueSeparator_nullValueSeparator() throws Exception {
        // Setup
        Mockito.when(option.getValueSeparator()).thenReturn(' ');

        // Execute
        char valueSeparator = option.getValueSeparator();

        // Verify
        assertEquals(' ', valueSeparator);
    }
}