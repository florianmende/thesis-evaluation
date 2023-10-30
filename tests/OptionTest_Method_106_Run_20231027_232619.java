package org.apache.commons.cli;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class OptionTest_Method_106_Run_20231027_232619 {
    @Test
    public void testSetRequiredTrue() {
        Option option = new Option("a", "arg-name", false, "description");
        option.setRequired(true);
        assertEquals(true, option.isRequired());
    }

    @Test
    public void testSetRequiredFalse() {
        Option option = new Option("a", "arg-name", true, "description");
        option.setRequired(false);
        assertEquals(false, option.isRequired());
    }

    @Test
    public void testSetRequiredNull() {
        Option option = new Option("a", "arg-name", true, "description");
        option.setRequired(false);
        assertEquals(false, option.isRequired());
    }
}