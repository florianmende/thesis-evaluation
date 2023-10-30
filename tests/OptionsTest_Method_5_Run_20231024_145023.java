package org.apache.commons.cli;


import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class OptionsTest_Method_5_Run_20231024_145023 {
    @Test
    public void testAddOptionGroup() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option option1 = new Option("opt1", "description1");
        Option option2 = new Option("opt2", "description2");
        group.addOption(option1);
        group.addOption(option2);

        options.addOptionGroup(group);

        // Use the getOptionGroup(Option) method to check if the option group is present in the Options object
        assertTrue(options.getOptionGroup(option1) != null);
        assertTrue(options.getOptionGroup(option2) != null);

        // Use the getOption(String) method to check if the option is present in the Options object
        assertTrue(options.getOption("opt1") != null);
        assertTrue(options.getOption("opt2") != null);
    }
}