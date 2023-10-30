package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionGroupTest_Method_23_Run_20231024_091429 {
    @Test
    public void testSetRequiredTrue() {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        assertTrue(group.isRequired());
    }

    @Test
    public void testSetRequiredFalse() {
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        assertFalse(group.isRequired());
    }

    @Test
    public void testSetRequiredSameValue() {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.setRequired(true);
        assertTrue(group.isRequired());
    }
}