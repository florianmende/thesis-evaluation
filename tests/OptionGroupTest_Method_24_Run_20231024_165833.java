package org.apache.commons.cli;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

public class OptionGroupTest_Method_24_Run_20231024_165833 {
    @Test
    public void testSetSelectedWithNullOption() {
        OptionGroup optionGroup = new OptionGroup();
        try {
            optionGroup.setSelected(null);
        } catch (AlreadySelectedException e) {
            // Ignore the exception and continue executing the code
        }
        assertEquals(null, optionGroup.getSelected());
    }

    @Test
    public void testSetSelectedWithValidOptionWhenNoOptionSelected() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("option1");
        try {
            optionGroup.setSelected(option);
        } catch (AlreadySelectedException e) {
            // Ignore the exception and continue executing the code
        }
        assertEquals("option1", optionGroup.getSelected());
    }

    @Test
    public void testSetSelectedWithValidOptionWhenSameOptionSelected() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("option1");
        try {
            optionGroup.setSelected(option);
        } catch (AlreadySelectedException e) {
            // Ignore the exception and continue executing the code
        }
        try {
            optionGroup.setSelected(option);
        } catch (AlreadySelectedException e) {
            // Ignore the exception and continue executing the code
        }
        assertEquals("option1", optionGroup.getSelected());
    }
}