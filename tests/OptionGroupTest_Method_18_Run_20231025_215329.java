package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.*;

public class OptionGroupTest_Method_18_Run_20231025_215329 {
    @Test
    void testAddOption() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("option");
        optionGroup.addOption(option);
        assertEquals(1, optionGroup.getOptions().size());
        assertTrue(optionGroup.getOptions().contains(option));
    }

    @Test
    void testAddOptionReturnsThis() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = Mockito.mock(Option.class);
        assertSame(optionGroup, optionGroup.addOption(option));
    }

    @Test
    void testAddOptionUpdatesOptionMapCorrectly() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = Mockito.mock(Option.class);
        Option option2 = Mockito.mock(Option.class);
        Mockito.when(option1.getKey()).thenReturn("option1");
        Mockito.when(option2.getKey()).thenReturn("option2");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        assertEquals(2, optionGroup.getOptions().size());
        assertTrue(optionGroup.getOptions().contains(option1));
        assertTrue(optionGroup.getOptions().contains(option2));
    }
}