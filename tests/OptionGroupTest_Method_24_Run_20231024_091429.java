package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mockito;

import java.util.LinkedHashMap;
import java.util.Map;

public class OptionGroupTest_Method_24_Run_20231024_091429 {
    @Test
    @DisplayName("Test setSelected method with valid option")
    public void testSetSelectedWithValidOption() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("test");
        try {
            optionGroup.setSelected(option);
        } catch (AlreadySelectedException e) {
            // Handle the exception
        }
        Assertions.assertEquals("test", optionGroup.getSelected());
    }

    @Test
    @DisplayName("Test setSelected method with null option")
    public void testSetSelectedWithNullOption() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = null;
        try {
            optionGroup.setSelected(option);
        } catch (AlreadySelectedException e) {
            // Handle the exception
        }
        Assertions.assertNull(optionGroup.getSelected());
    }

    @Test
    @DisplayName("Test setSelected method with already selected option")
    public void testSetSelectedWithAlreadySelectedOption() {
        OptionGroup optionGroup = new OptionGroup();
        Option option1 = Mockito.mock(Option.class);
        Mockito.when(option1.getKey()).thenReturn("test1");
        Option option2 = Mockito.mock(Option.class);
        Mockito.when(option2.getKey()).thenReturn("test2");
        try {
            optionGroup.setSelected(option1);
        } catch (AlreadySelectedException e) {
            // Handle the exception
        }
        Assertions.assertThrows(AlreadySelectedException.class, () -> {
            optionGroup.setSelected(option2);
        });
    }
}