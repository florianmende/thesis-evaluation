package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OptionTest_Method_83_Run_20231027_232619 {
    @Test
    public void testGetTypeNoType() {
        Option option = new Option("a", null, false, "description");
        assertEquals(String.class, option.getType());
    }

    @Test
    public void testGetTypeNonStringType() {
        Option option = new Option("a", null, false, "description");
        option.setType(Integer.class);
        assertEquals(Integer.class, option.getType());
    }

    @Test
    public void testGetTypeStringType() {
        Option option = new Option("a", null, false, "description");
        option.setType(String.class);
        assertEquals(String.class, option.getType());
    }
}