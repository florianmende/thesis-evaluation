package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class OptionTest_Method_108_Run_20231028_012625 {

    @Test
    public void testSetTypeValidType() {
        Option option = new Option("a", "a", false, "a");
        option.setType(String.class);
        assertEquals(String.class, option.getType());
    }

    @Test
    public void testSetTypeInvalidType() {
        Option option = new Option("a", "a", false, "a");
        option.setType(Integer.class);
        assertEquals(Integer.class, option.getType());
    }

    @Test
    public void testSetTypeNull() {
        Option option = new Option("a", "a", false, "a");
        option.setType(null);
        assertNull(option.getType());
    }
}