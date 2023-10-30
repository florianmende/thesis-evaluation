package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OptionGroupTest_Method_19_Run_20231023_204140 {
    @Test
    public void testGetNames_emptyOptionGroup() {
        OptionGroup optionGroup = new OptionGroup();
        Collection<String> names = optionGroup.getNames();
        assertEquals(0, names.size());
    }

    @Test
    public void testGetNames_nonEmptyOptionGroup() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.addOption(new Option("a", "alpha"));
        optionGroup.addOption(new Option("b", "beta"));
        Collection<String> names = optionGroup.getNames();
        assertEquals(2, names.size());
        assertEquals("a", names.iterator().next());
    }

    @Test
    public void testGetNames_nullOptionGroup() {
        OptionGroup optionGroup = null;
        assertThrows(NullPointerException.class, () -> optionGroup.getNames());
    }
}