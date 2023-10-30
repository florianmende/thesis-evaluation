package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OptionGroupTest_Method_24_Run_20231023_195751 {
    @Test
    public void testSetSelectedNull() {
        OptionGroup group = new OptionGroup();
        try {
            group.setSelected(null);
        } catch (AlreadySelectedException e) {
            System.out.println("AlreadySelectedException caught: " + e.getMessage());
        }
        Assertions.assertNull(group.getSelected());
    }

    @Test
    public void testSetSelectedValidOption() {
        OptionGroup group = new OptionGroup();
        Option option = new Option("option1", "Option 1");
        try {
            group.setSelected(option);
        } catch (AlreadySelectedException e) {
            System.out.println("AlreadySelectedException caught: " + e.getMessage());
        }
        Assertions.assertEquals("option1", group.getSelected());
    }

    @Test
    public void testSetSelectedDifferentValidOption() {
        OptionGroup group = new OptionGroup();
        Option option1 = new Option("option1", "Option 1");
        Option option2 = new Option("option2", "Option 2");
        try {
            group.setSelected(option1);
        } catch (AlreadySelectedException e) {
            System.out.println("AlreadySelectedException caught: " + e.getMessage());
        }
        Assertions.assertThrows(AlreadySelectedException.class, () -> group.setSelected(option2));
    }
}