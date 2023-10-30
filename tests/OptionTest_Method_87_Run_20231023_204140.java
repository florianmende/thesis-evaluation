package org.apache.commons.cli;


import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class OptionTest_Method_87_Run_20231023_204140 {
    @Test
    public void testGetValuesNoValues() {
        Option option = new Option("a", false, "");
        assertNull(option.getValues());
    }

    @Test
    public void testGetValuesOneValue() {
        Option option = new Option("a", true, "");
        List<String> values = new ArrayList<>();
        values.add("value1");
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    @Test
    public void testGetValuesMultipleValues() {
        Option option = new Option("a", true, "");
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
    }
}