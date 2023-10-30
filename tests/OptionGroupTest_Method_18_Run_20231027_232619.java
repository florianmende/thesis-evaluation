package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;

public class OptionGroupTest_Method_18_Run_20231027_232619 {

    @Test
    public void testAddOption() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("option1");
        optionGroup.addOption(option);
        assertTrue(optionGroup.getOptions().contains(option));
    }

    @Test
    public void testAddOptionReturnsOptionGroup() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("option1");
        OptionGroup returnedOptionGroup = optionGroup.addOption(option);
        assertEquals(optionGroup, returnedOptionGroup);
    }

    @Test
    public void testAddOptionThrowsException() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = Mockito.mock(Option.class);
        Mockito.when(option1.getKey()).thenReturn("option1");
        Option option2 = Mockito.mock(Option.class);
        Mockito.when(option2.getKey()).thenReturn("option1");
        optionGroup.addOption(option1);
        assertFalse(optionGroup.getOptions().contains(option2));
    }
}