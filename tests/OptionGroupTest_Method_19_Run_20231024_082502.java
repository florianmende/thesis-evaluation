package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionGroupTest_Method_19_Run_20231024_082502 {

    @Test
    public void testGetNames() {
        OptionGroup optionGroup = new OptionGroup();

        // Test case 1: empty option group
        assertTrue(optionGroup.getNames().isEmpty());

        // Test case 2: option group with one option
        Option option1 = mock(Option.class);
        when(option1.getKey()).thenReturn("option1");
        optionGroup.addOption(option1);
        assertEquals(1, optionGroup.getNames().size());
        assertTrue(optionGroup.getNames().contains("option1"));

        // Test case 3: option group with multiple options
        Option option2 = mock(Option.class);
        when(option2.getKey()).thenReturn("option2");
        Option option3 = mock(Option.class);
        when(option3.getKey()).thenReturn("option3");
        optionGroup.addOption(option2);
        optionGroup.addOption(option3);
        assertEquals(3, optionGroup.getNames().size());
        assertTrue(optionGroup.getNames().contains("option1"));
        assertTrue(optionGroup.getNames().contains("option2"));
        assertTrue(optionGroup.getNames().contains("option3"));
    }
}