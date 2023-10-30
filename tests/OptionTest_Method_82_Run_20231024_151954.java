package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_82_Run_20231024_151954 {
    @Test
    public void testGetOptWithShortName() {
        Option option = new Option("a", null, true, "description");
        assertEquals("a", option.getOpt());
    }

    @Test
    public void testGetOptWithLongName() {
        Option option = new Option(null, "arg-name", true, "description");
        assertEquals(null, option.getOpt());
    }

    @Test
    public void testGetOptWithBothNames() {
        Option option = new Option("a", "arg-name", true, "description");
        assertEquals("a", option.getOpt());
    }
}