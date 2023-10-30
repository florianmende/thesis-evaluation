package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;

public class OptionTest_Method_104_Run_20231028_042634 {
    @Test
    public void testSetLongOpt() {
        Option option = new Option("a", "arg-name", false, "description");
        option.setLongOpt("long-arg-name");
        assertEquals("long-arg-name", option.getLongOpt());
    }
}