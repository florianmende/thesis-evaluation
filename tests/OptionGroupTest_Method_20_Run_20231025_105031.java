package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionGroupTest_Method_20_Run_20231025_105031 {
    @Test
    public void testGetOptionsEmpty() {
        OptionGroup group = new OptionGroup();
        assertNotNull(group.getOptions());
        assertTrue(group.getOptions().isEmpty());
    }

    @Test
    public void testGetOptions() {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("option1", "description1"));
        group.addOption(new Option("option2", "description2"));
        assertNotNull(group.getOptions());
        assertEquals(2, group.getOptions().size());
        assertTrue(group.getOptions().contains(new Option("option1", "description1")));
        assertTrue(group.getOptions().contains(new Option("option2", "description2")));
    }

    @Test
    public void testGetOptionsSelected() {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("option1", "description1"));
        group.addOption(new Option("option2", "description2"));
        try {
            group.setSelected(new Option("option1", "description1"));
        } catch (AlreadySelectedException e) {
            // handle the exception
        }
        assertNotNull(group.getOptions());
        assertEquals(2, group.getOptions().size());
        assertTrue(group.getOptions().contains(new Option("option1", "description1")));
        assertTrue(group.getOptions().contains(new Option("option2", "description2")));
    }
}