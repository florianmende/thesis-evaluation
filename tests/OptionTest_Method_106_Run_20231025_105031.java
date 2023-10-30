package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_106_Run_20231025_105031 {
    @Test
    public void testSetRequired() {
        Option option = new Option("a", "arg-name", false, "This is a test option");
        option.setRequired(true);
        assertTrue(option.isRequired());
        option.setRequired(false);
        assertFalse(option.isRequired());
    }
}