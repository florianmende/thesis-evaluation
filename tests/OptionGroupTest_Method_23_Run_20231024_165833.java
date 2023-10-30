package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OptionGroupTest_Method_23_Run_20231024_165833 {

    @Test
    public void testSetRequired() throws Exception {
        OptionGroup group = new OptionGroup();

        // test case 1: set required to true
        group.setRequired(true);
        assertTrue(group.isRequired());

        // test case 2: set required to false
        group.setRequired(false);
        assertFalse(group.isRequired());

        // test case 3: set required to true
        group.setRequired(true);
        assertTrue(group.isRequired());
    }
}