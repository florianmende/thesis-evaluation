package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class OptionTest_Method_82_Run_20231025_105031 {
    @Test
    public void testGetOptNull() {
        Option option = new Option(null, false, "This is a test option");
        Assertions.assertNull(option.getOpt());
    }

    @Test
    public void testGetOptEmpty() {
        Option option = new Option("", false, "This is a test option");
        Assertions.assertEquals("", option.getOpt());
    }

    @Test
    public void testGetOptValid() {
        Option option = new Option("test", false, "This is a test option");
        Assertions.assertEquals("test", option.getOpt());
    }
}