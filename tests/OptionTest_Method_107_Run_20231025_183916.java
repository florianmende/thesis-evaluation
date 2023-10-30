package org.apache.commons.cli;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OptionTest_Method_107_Run_20231025_183916 {
    @Test
    public void testSetTypeWithValidType() {
        Option option = new Option("a", "description");
        option.setType(String.class);
        assertEquals(String.class, option.getType());
    }

    @Test
    public void testSetTypeWithInvalidType() {
        Option option = new Option("a", "description");
        option.setType(null);
        assertEquals(null, option.getType());
    }

    @Test
    public void testSetTypeWithNullType() {
        Option option = new Option("a", "description");
        option.setType(null);
        assertEquals(null, option.getType());
    }
}