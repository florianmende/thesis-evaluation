package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;

public class OptionsTest_Method_9_Run_20231024_004630 {
    @Test
    public void testGetOptionGroup() {
        Options options = new Options();
        Option option1 = new Option("a", "option1");
        Option option2 = new Option("b", "option2");
        Option option3 = new Option("c", "option3");
        OptionGroup group = new OptionGroup();
        group.addOption(option1);
        group.addOption(option2);
        group.addOption(option3);
        options.addOptionGroup(group);
        assertEquals(group, options.getOptionGroup(option1));
        assertEquals(group, options.getOptionGroup(option2));
        assertEquals(group, options.getOptionGroup(option3));
        assertNull(options.getOptionGroup(new Option("d", "option4")));
        assertThrows(NullPointerException.class, () -> options.getOptionGroup(null));
    }
}