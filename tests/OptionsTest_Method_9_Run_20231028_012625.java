package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_9_Run_20231028_012625 {
    @Test
    public void testGetOptionGroup() {
        Options options = new Options();
        Option option = new Option("a", "aaa");
        OptionGroup group = new OptionGroup();
        group.addOption(option);
        options.addOptionGroup(group);

        // Case 1: The option belongs to an OptionGroup
        OptionGroup actualGroup = options.getOptionGroup(option);
        assertEquals(group, actualGroup);

        // Case 2: The option does not belong to any OptionGroup
        Option option2 = new Option("b", "bbb");
        OptionGroup actualGroup2 = options.getOptionGroup(option2);
        assertNull(actualGroup2);

        // Case 3: The option is null
        assertThrows(NullPointerException.class, () -> options.getOptionGroup(null));
    }
}