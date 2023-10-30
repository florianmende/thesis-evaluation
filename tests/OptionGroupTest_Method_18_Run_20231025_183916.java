package org.apache.commons.cli;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class OptionGroupTest_Method_18_Run_20231025_183916 {
    @Mock
    private Map<String, Option> optionMap;

    @Test
    public void testAddOption() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("foo", "bar");
        optionGroup.addOption(option);
        when(optionMap.get(option.getKey())).thenReturn(option);
        assertEquals(option, optionMap.get(option.getKey()));
    }

    @Test
    public void testAddOptionReturnsCurrentInstance() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("foo", "bar");
        assertEquals(optionGroup, optionGroup.addOption(option));
    }

    @Test(expected = NullPointerException.class)
    public void testAddOptionThrowsNullPointerException() {
        OptionGroup optionGroup = new OptionGroup();
        Option option = null;
        optionGroup.addOption(option);
    }
}