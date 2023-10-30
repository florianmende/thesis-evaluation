package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Option;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OptionTest_Method_77_Run_20231025_224954 {
    @Mock
    private Option option;

    @Test
    public void testGetArgs_Uninitialized() {
        when(option.getArgs()).thenReturn(Option.UNINITIALIZED);
        assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    @Test
    public void testGetArgs_UnlimitedValues() {
        when(option.getArgs()).thenReturn(Option.UNLIMITED_VALUES);
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }

    @Test
    public void testGetArgs_SpecificNumberOfArguments() {
        int numArgs = 2;
        when(option.getArgs()).thenReturn(numArgs);
        assertEquals(numArgs, option.getArgs());
    }
}