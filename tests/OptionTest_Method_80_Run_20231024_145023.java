package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OptionTest_Method_80_Run_20231024_145023 {
    @Test
    public void testGetKey_NullOption() {
        Option option = new Option(null, "longOption", true, "description");
        assertEquals("longOption", option.getKey());
    }

    @Test
    public void testGetKey_NonNullOption() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals("option", option.getKey());
    }

    @Test
    public void testGetKey_NullOptionAndLongOption() {
        Option option = new Option(null, null, true, "description");
        assertEquals(null, option.getKey());
    }
}