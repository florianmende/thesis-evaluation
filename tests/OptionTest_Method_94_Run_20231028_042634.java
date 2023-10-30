package org.apache.commons.cli;



import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OptionTest_Method_94_Run_20231028_042634 {

    @Test
    public void testHasLongOpt() {
        Option option = new Option("a", "long-option", true, "description");
        if (option.hasLongOpt()) {
            assertTrue(option.hasLongOpt());
        } else {
            assertFalse(option.hasLongOpt());
        }

        option = new Option("a", null, true, "description");
        if (option.hasLongOpt()) {
            assertTrue(option.hasLongOpt());
        } else {
            assertFalse(option.hasLongOpt());
        }

        option = new Option(null, "long-option", true, "description");
        if (option.hasLongOpt()) {
            assertTrue(option.hasLongOpt());
        } else {
            assertFalse(option.hasLongOpt());
        }
    }
}