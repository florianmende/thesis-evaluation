package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;

public class OptionsTest_Method_6_Run_20231026_155023 {
    @Test
    public void testAddRequiredOption() {
        Options options = new Options();
        options.addRequiredOption("t", "test", false, "A test option");
        Option option = options.getOption("t");
        assertEquals("test", option.getLongOpt());
        assertEquals("A test option", option.getDescription());
        assertTrue(option.isRequired());
        assertEquals(options, options.addRequiredOption("t", "test", false, "A test option"));
    }
}