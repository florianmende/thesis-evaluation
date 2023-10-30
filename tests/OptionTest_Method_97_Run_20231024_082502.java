package org.apache.commons.cli;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class OptionTest_Method_97_Run_20231024_082502 {
    @Test
    public void testHasValueSeparator() {
        // Create an Option with a value separator
        Option option = new Option("a", "arg-name", true, "description");
        option.setValueSeparator('=');

        // Check that the option has a value separator
        assertTrue(option.hasValueSeparator());

        // Create an Option without a value separator
        option = new Option("b", "arg-name", true, "description");

        // Check that the option does not have a value separator
        assertFalse(option.hasValueSeparator());

        // Create an Option with a value separator, but it is not set
        option = new Option("c", "arg-name", true, "description");
        // option.setValueSeparator(null); // Removed

        // Check that the option does not have a value separator
        assertFalse(option.hasValueSeparator());
    }
}