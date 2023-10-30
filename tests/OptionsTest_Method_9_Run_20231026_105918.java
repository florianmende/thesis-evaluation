package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OptionsTest_Method_9_Run_20231026_105918 {
    @Test
    public void testGetOptionGroup() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "alpha");
        group.addOption(option);
        options.addOptionGroup(group);

        assertEquals(group, options.getOptionGroup(option));
    }
}