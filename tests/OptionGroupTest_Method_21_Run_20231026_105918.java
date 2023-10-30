package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.Serializable;
import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OptionGroupTest_Method_21_Run_20231026_105918 {

    @Test
    public void testGetSelected() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("optionName");
        try {
            optionGroup.setSelected(option);
        } catch (AlreadySelectedException e) {
            // handle the exception here
        }
        assertEquals("optionName", optionGroup.getSelected());
    }

    @Test
    public void testGetSelectedNull() {
        OptionGroup optionGroup = new OptionGroup();
        assertNull(optionGroup.getSelected());
    }

    @Test
    public void testGetSelectedDeselected() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("optionName");
        try {
            optionGroup.setSelected(option);
        } catch (AlreadySelectedException e) {
            // handle the exception here
        }
        try {
            optionGroup.setSelected(null);
        } catch (AlreadySelectedException e) {
            // handle the exception here
        }
        assertNull(optionGroup.getSelected());
    }
}