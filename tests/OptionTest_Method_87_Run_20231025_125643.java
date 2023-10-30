package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OptionTest_Method_87_Run_20231025_125643 {
    @Test
    void testGetValuesNoValues() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getValues()).thenReturn(null);
        assertNull(option.getValues());
    }

    @Test
    void testGetValuesOneValue() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getValues()).thenReturn(new String[]{"value1"});
        assertEquals(1, option.getValues().length);
        assertEquals("value1", option.getValues()[0]);
    }

    @Test
    void testGetValuesMultipleValues() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getValues()).thenReturn(new String[]{"value1", "value2", "value3"});
        assertEquals(3, option.getValues().length);
        assertEquals("value1", option.getValues()[0]);
        assertEquals("value2", option.getValues()[1]);
        assertEquals("value3", option.getValues()[2]);
    }
}