package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class OptionTest_Method_97_Run_20231023_204140 {
    @Test
    public void testHasValueSeparator() {
        Option option = new Option("a", "arg-name", false, "description");
        option.setValueSeparator('=');
        assertTrue(option.hasValueSeparator());

        option = new Option("a", "arg-name", false, "description");
        assertFalse(option.hasValueSeparator());

        option = new Option("a", "arg-name", false, "description");
        option.setValueSeparator(':');
        assertTrue(option.hasValueSeparator());
    }
}