package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OptionTest_Method_90_Run_20231024_004630 {
    @Test
    public void testHasArg_optionRequiresArgument() {
        Option option = new Option("a", "arg-name", true, "This option requires an argument");
        assertEquals(true, option.hasArg());
    }

    @Test
    public void testHasArg_optionDoesNotRequireArgument() {
        Option option = new Option("a", "arg-name", false, "This option does not require an argument");
        assertEquals(false, option.hasArg());
    }

    @Test
    public void testHasArg_optionHasOptionalArgument() {
        Option option = new Option("a", "arg-name", true, "This option has an optional argument");
        assertEquals(true, option.hasArg());
    }
}