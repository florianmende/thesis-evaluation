package org.apache.commons.cli;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OptionGroupTest_Method_24_Run_20231024_145023 {
    private OptionGroup optionGroup;

    @BeforeEach
    public void setUp() {
        optionGroup = new OptionGroup();
    }

    @Test
    public void testSetSelected() throws AlreadySelectedException {
        Option option1 = new Option("a", "first option");
        Option option2 = new Option("b", "second option");

        // test case 1: setting a selected option
        optionGroup.setSelected(option1);
        Assertions.assertEquals(option1.getKey(), optionGroup.getSelected());

        // test case 2: resetting the selected option
        optionGroup.setSelected(null);
        Assertions.assertNull(optionGroup.getSelected());

        // test case 3: trying to select a different option
        optionGroup.setSelected(option2);
        Assertions.assertEquals(option2.getKey(), optionGroup.getSelected());
    }
}