package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OptionTest_Method_103_Run_20231028_012625 {
    @Test
    public void testSetDescription() {
        // case 1: The description is set to a non-null value
        Option option = new Option("a", "arg-name", false, "description");
        option.setDescription("new description");
        assertEquals("new description", option.getDescription());

        // case 2: The description is set to a null value
        option = new Option("a", "arg-name", false, "description");
        option.setDescription(null);
        assertEquals(null, option.getDescription());

        // case 3: The description is set to an empty string
        option = new Option("a", "arg-name", false, "description");
        option.setDescription("");
        assertEquals("", option.getDescription());
    }
}