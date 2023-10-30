package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

public class OptionGroupTest_Method_23_Run_20231027_232619 {

    @Test
    public void testSetRequiredToTrue() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        assertEquals(true, optionGroup.isRequired());
    }

    @Test
    public void testSetRequiredToFalse() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);
        assertEquals(false, optionGroup.isRequired());
    }

    @Test
    public void testSetRequiredToSameValue() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        assertEquals(true, optionGroup.isRequired());
        optionGroup.setRequired(true);
        assertEquals(true, optionGroup.isRequired());
    }
}