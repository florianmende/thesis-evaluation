package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionTest_Method_90_Run_20231024_091429 {
    @Test
    public void testHasArgFalse() {
        Option option = new Option("a", false, "description");
        assertFalse(option.hasArg());
    }

    @Test
    public void testHasArgTrue() {
        Option option = new Option("a", true, "description");
        assertTrue(option.hasArg());
    }

    @Test
    public void testHasArgsUnlimited() {
        Option option = new Option("a", true, "description");
        assertTrue(option.hasArg());
    }
}