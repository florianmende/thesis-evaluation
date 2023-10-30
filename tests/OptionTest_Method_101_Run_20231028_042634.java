package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OptionTest_Method_101_Run_20231028_042634 {
    @Test
    public void testSetArgName() {
        Option option = new Option("a", "arg-name", false, "description");
        option.setArgName("arg-name");
        assertEquals("arg-name", option.getArgName());

        option.setArgName(null);
        assertEquals(null, option.getArgName());

        option.setArgName("");
        assertEquals("", option.getArgName());
    }
}