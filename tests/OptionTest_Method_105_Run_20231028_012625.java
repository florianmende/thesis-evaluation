package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_105_Run_20231028_012625 {
    @Test
    public void testSetOptionalArg() {
        Option option = Mockito.mock(Option.class);

        // case 1: option has an optional argument, optionalArg is set to true
        when(option.hasArg()).thenReturn(true);
        option.setOptionalArg(true);

        // case 2: option does not have an optional argument, optionalArg is set to false
        when(option.hasArg()).thenReturn(false);
        option.setOptionalArg(false);

        // case 3: option has an optional argument, optionalArg is set to false
        when(option.hasArg()).thenReturn(true);
        option.setOptionalArg(false);
    }
}