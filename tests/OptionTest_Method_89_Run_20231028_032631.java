package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_89_Run_20231028_032631 {
    @Test
    public void testGetValuesList_noValues() {
        Option option = Mockito.mock(Option.class);
        when(option.getValuesList()).thenReturn(new ArrayList<>());
        List<String> valuesList = option.getValuesList();
        assertTrue(valuesList.isEmpty());
    }

    @Test
    public void testGetValuesList_oneValue() {
        Option option = Mockito.mock(Option.class);
        when(option.getValuesList()).thenReturn(List.of("value1"));
        List<String> valuesList = option.getValuesList();
        assertEquals(1, valuesList.size());
        assertEquals("value1", valuesList.get(0));
    }

    @Test
    public void testGetValuesList_multipleValues() {
        Option option = Mockito.mock(Option.class);
        when(option.getValuesList()).thenReturn(List.of("value1", "value2", "value3"));
        List<String> valuesList = option.getValuesList();
        assertEquals(3, valuesList.size());
        assertEquals("value1", valuesList.get(0));
        assertEquals("value2", valuesList.get(1));
        assertEquals("value3", valuesList.get(2));
    }
}