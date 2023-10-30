package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_89_Run_20231023_195751 {
    @Test
    public void testGetValuesList() {
        // Create a mock Option object
        Option option = Mockito.mock(Option.class);
        
        // Set up the mock to return a List of values
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        when(option.getValuesList()).thenReturn(values);
        
        // Test that the method returns the expected List of values
        assertEquals(values, option.getValuesList());
        
        // Set up the mock to return null
        when(option.getValuesList()).thenReturn(null);
        
        // Test that the method returns null
        assertNull(option.getValuesList());
        
        // Set up the mock to throw an exception when the Option is null
        when(option.getValuesList()).thenThrow(new IllegalArgumentException("Option cannot be null"));
        
        // Test that the method throws an exception when the Option is null
        assertThrows(IllegalArgumentException.class, () -> option.getValuesList());
    }
}