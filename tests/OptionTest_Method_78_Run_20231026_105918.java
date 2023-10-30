package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class OptionTest_Method_78_Run_20231026_105918 {

    @Test
    public void testGetDescription() {
        Option option = new Option("a", "arg-name", false, "description");
        assertEquals("description", option.getDescription());
    }

    @Test
    public void testGetDescriptionNull() {
        Option option = new Option("a", "arg-name", false, null);
        assertNull(option.getDescription());
    }
}