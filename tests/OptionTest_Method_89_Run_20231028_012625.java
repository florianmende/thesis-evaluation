package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OptionTest_Method_89_Run_20231028_012625 {

    @Mock
    private Option option;

    @Test
    public void testGetValuesList_noValues() {
        // given
        when(option.getValuesList()).thenReturn(new ArrayList<>());

        // when
        List<String> values = option.getValuesList();

        // then
        assertTrue(values.isEmpty());
    }

    @Test
    public void testGetValuesList_oneValue() {
        // given
        when(option.getValuesList()).thenReturn(List.of("value1"));

        // when
        List<String> values = option.getValuesList();

        // then
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    @Test
    public void testGetValuesList_multipleValues() {
        // given
        when(option.getValuesList()).thenReturn(List.of("value1", "value2", "value3"));

        // when
        List<String> values = option.getValuesList();

        // then
        assertEquals(3, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
        assertEquals("value3", values.get(2));
    }
}