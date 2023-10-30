package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_80_Run_20231028_032631 {
    @Test
    public void testGetKey() {
        Option option = new Option("a", "longOption", true, "description");
        assertEquals("a", option.getKey());

        option = new Option(null, "longOption", true, "description");
        assertEquals("longOption", option.getKey());

        option = new Option(null, null, true, "description");
        assertNull(option.getKey());
    }
}