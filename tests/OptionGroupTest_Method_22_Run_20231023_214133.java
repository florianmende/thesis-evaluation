package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

class OptionGroupTest_Method_22_Run_20231023_214133 {
    @Test
    void isRequired_emptyOptionGroup_false() {
        OptionGroup optionGroup = new OptionGroup();
        assertFalse(optionGroup.isRequired());
    }

    @Test
    void isRequired_requiredOptionGroup_true() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("key");
        when(option.getOpt()).thenReturn("opt");
        when(option.getLongOpt()).thenReturn("longOpt");
        when(option.getDescription()).thenReturn("description");
        optionGroup.addOption(option);
        optionGroup.setRequired(true);
        assertTrue(optionGroup.isRequired());
    }

    @Test
    void isRequired_notRequiredOptionGroup_false() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("key");
        when(option.getOpt()).thenReturn("opt");
        when(option.getLongOpt()).thenReturn("longOpt");
        when(option.getDescription()).thenReturn("description");
        optionGroup.addOption(option);
        optionGroup.setRequired(false);
        assertFalse(optionGroup.isRequired());
    }
}