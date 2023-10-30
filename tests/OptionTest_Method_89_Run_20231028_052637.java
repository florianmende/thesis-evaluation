package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_89_Run_20231028_052637 {

    @Test
    public void testGetValuesList_noValues() {
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(null);
        assertNull(option.getValuesList());
    }

    @Test
    public void testGetValuesList_oneValue() {
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(List.of("value1"));
        assertEquals(List.of("value1"), option.getValuesList());
    }

    @Test
    public void testGetValuesList_multipleValues() {
        Option option = mock(Option.class);
        when(option.getValuesList()).thenReturn(List.of("value1", "value2", "value3"));
        assertEquals(List.of("value1", "value2", "value3"), option.getValuesList());
    }
}