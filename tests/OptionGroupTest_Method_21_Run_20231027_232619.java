package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OptionGroupTest_Method_21_Run_20231027_232619 {

    @Test
    void testGetSelected() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = Mockito.mock(Option.class);
        Mockito.when(option1.getKey()).thenReturn("option1");
        Option option2 = Mockito.mock(Option.class);
        Mockito.when(option2.getKey()).thenReturn("option2");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        try {
            optionGroup.setSelected(option2);
        } catch (AlreadySelectedException e) {
            // handle the exception here
        }
        assertEquals("option2", optionGroup.getSelected());
    }

    @Test
    void testGetSelectedNull() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = Mockito.mock(Option.class);
        Mockito.when(option1.getKey()).thenReturn("option1");
        Option option2 = Mockito.mock(Option.class);
        Mockito.when(option2.getKey()).thenReturn("option2");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        assertNull(optionGroup.getSelected());
    }

    @Test
    void testGetSelectedAlreadySelectedException() throws AlreadySelectedException {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = Mockito.mock(Option.class);
        Mockito.when(option1.getKey()).thenReturn("option1");
        Option option2 = Mockito.mock(Option.class);
        Mockito.when(option2.getKey()).thenReturn("option2");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        optionGroup.setSelected(option2);
        assertThrows(AlreadySelectedException.class, () -> optionGroup.setSelected(option1));
    }
}