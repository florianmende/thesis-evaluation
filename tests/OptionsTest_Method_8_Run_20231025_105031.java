package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.junit.Assert;
import org.junit.Test;

public class OptionsTest_Method_8_Run_20231025_105031 {
    @Test
    public void testGetOption() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "First option");
        options.addOption("b", "bravo", false, "Second option");
        options.addOption("c", "charlie", false, "Third option");

        // Case 1: The option with the specified name exists in the shortOpts or longOpts map.
        Assert.assertEquals("First option", options.getOption("a").getDescription());
        Assert.assertEquals("Second option", options.getOption("b").getDescription());
        Assert.assertEquals("Third option", options.getOption("c").getDescription());

        // Case 2: The option with the specified name does not exist in the shortOpts or longOpts map.
        Assert.assertNull(options.getOption("d"));

        // Case 3: The specified name is null or empty.
        Assert.assertNull(options.getOption(null));
        Assert.assertNull(options.getOption(""));
    }
}