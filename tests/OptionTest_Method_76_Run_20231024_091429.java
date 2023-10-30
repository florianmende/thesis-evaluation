package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_76_Run_20231024_091429 {
    @Test
    public void testGetArgName() {
        // Case 1: The method returns the correct argument name when it is set.
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getArgName()).thenReturn("argName");
        assertEquals("argName", option.getArgName());

        // Case 2: The method returns the empty string when the argument name is not set.
        option = Mockito.mock(Option.class);
        Mockito.when(option.getArgName()).thenReturn("");
        assertEquals("", option.getArgName());

        // Case 3: The method returns the correct argument name when it is set to a non-string value.
        option = Mockito.mock(Option.class);
        Mockito.when(option.getArgName()).thenReturn(String.valueOf(123));
        assertEquals("123", option.getArgName());
    }
}