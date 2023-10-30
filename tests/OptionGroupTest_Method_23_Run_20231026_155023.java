package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class OptionGroupTest_Method_23_Run_20231026_155023 {
    @Test
    public void testSetRequired() {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Assertions.assertTrue(group.isRequired());

        group.setRequired(false);
        Assertions.assertFalse(group.isRequired());

        group.setRequired(true);
        Assertions.assertTrue(group.isRequired());

        group.setRequired(false);
        Assertions.assertFalse(group.isRequired());

        group.setRequired(true);
        Assertions.assertTrue(group.isRequired());

        group.setRequired(false);
        Assertions.assertFalse(group.isRequired());
    }
}