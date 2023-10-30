package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.junit.Test;

public class OptionsTest_Method_9_Run_20231030_094427 {

    @Test
    public void testGetOptionGroup_notPartOfOptionGroup() {
        Options options = new Options();
        Option option = new Option("a", "Option A");
        OptionGroup group = new OptionGroup();
        group.addOption(option);
        options.addOptionGroup(group);

        OptionGroup result = options.getOptionGroup(new Option("b", "Option B"));
        assertNull(result);
    }

    @Test
    public void testGetOptionGroup_partOfOptionGroup() {
        Options options = new Options();
        Option option = new Option("a", "Option A");
        OptionGroup group = new OptionGroup();
        group.addOption(option);
        options.addOptionGroup(group);

        OptionGroup result = options.getOptionGroup(option);
        assertEquals(group, result);
    }

    @Test
    public void testGetOptionGroup_nullOption() {
        Options options = new Options();
        assertThrows(NullPointerException.class, () -> options.getOptionGroup(null));
    }
}