package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_90_Run_20231024_165833 {

    @Test
    public void testHasArg() {
        Option option = Option.builder("opt").hasArg(true).build();
        assertTrue(option.hasArg());

        option = Option.builder("longOpt").hasArg(false).build();
        assertFalse(option.hasArg());

        option = Option.builder("opt").hasArgs().build();
        assertTrue(option.hasArg());

        option = Option.builder("longOpt").optionalArg(true).build();
        assertTrue(option.hasArg());

        option = Option.builder("longOpt").optionalArg(false).build();
        assertFalse(option.hasArg());
    }
}