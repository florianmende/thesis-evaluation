package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_89_Run_20231024_060930 {
    @Test
    public void testGetValuesList_emptyList() {
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(new ArrayList<>());
        assertEquals(0, option.getValuesList().size());
    }

    @Test
    public void testGetValuesList_singleElement() {
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(Arrays.asList("arg1"));
        assertEquals(1, option.getValuesList().size());
    }

    @Test
    public void testGetValuesList_multipleElements() {
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(Arrays.asList("arg1", "arg2", "arg3"));
        assertEquals(3, option.getValuesList().size());
    }
}