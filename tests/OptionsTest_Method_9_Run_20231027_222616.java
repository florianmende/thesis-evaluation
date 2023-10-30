package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OptionsTest_Method_9_Run_20231027_222616 {
    @Test
    public void testGetOptionGroupForOptionInOptionGroup() {
        // Create an OptionGroup with an Option
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "aaa", false, "Option A");
        group.addOption(option);
        Options options = new Options();
        options.addOptionGroup(group);

        // Test that the method returns the correct OptionGroup for the Option
        OptionGroup result = options.getOptionGroup(option);
        assertEquals(group, result);
    }

    @Test
    public void testGetOptionGroupForOptionNotInOptionGroup() {
        // Create an Option that is not part of an OptionGroup
        Option option = new Option("a", "aaa", false, "Option A");
        Options options = new Options();

        // Test that the method returns null for the Option
        OptionGroup result = options.getOptionGroup(option);
        assertNull(result);
    }

    @Test
    public void testGetOptionGroupForNullOption() {
        Options options = new Options();

        // Test that the method throws a NullPointerException for a null Option
        assertThrows(NullPointerException.class, () -> options.getOptionGroup(null));
    }
}