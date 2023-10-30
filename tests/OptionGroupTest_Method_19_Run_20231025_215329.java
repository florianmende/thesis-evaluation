package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Collection;

public class OptionGroupTest_Method_19_Run_20231025_215329 {
    @Test
    public void testGetNames_EmptyGroup() {
        OptionGroup group = new OptionGroup();
        Collection<String> names = group.getNames();
        assertTrue(names.isEmpty());
    }

    @Test
    public void testGetNames_GroupWithOptions() {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("opt1", "Option 1"));
        group.addOption(new Option("opt2", "Option 2"));
        Collection<String> names = group.getNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("opt1"));
        assertTrue(names.contains("opt2"));
    }

    @Test
    public void testGetNames_RequiredGroup() {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Collection<String> names = group.getNames();
        assertTrue(names.isEmpty());
    }
}