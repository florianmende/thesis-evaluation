package org.apache.commons.cli;


import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OptionsTest_Method_4_Run_20231023_195751 {
    @Test
    public void testAddOption() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "This is option a");
        options.addOption("b", "bravo", true, "This is option b");
        options.addOption("c", "charlie", false, "This is option c");

        // Test that the option was added with the correct short name and long name
        assertEquals("a", options.getOption("a").getOpt());
        assertEquals("alpha", options.getOption("a").getLongOpt());

        // Test that the option was correctly set as requiring an argument
        assertEquals(false, options.getOption("a").hasArg());
        assertEquals(true, options.getOption("b").hasArg());

        // Test that the option was correctly added to the shortOpts and longOpts maps
        assertNotNull(options.getOption("a"));
        assertNotNull(options.getOption("b"));
        assertNotNull(options.getOption("c"));
    }
}