package org.apache.commons.cli;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class OptionTest_Method_77_Run_20231025_183916 {

    @Mock
    private Option option;

    @Test
    public void testGetArgs_noArgumentValues() {
        Mockito.when(option.getArgs()).thenReturn(0);
        assertEquals(0, option.getArgs());
    }

    @Test
    public void testGetArgs_oneArgumentValue() {
        Mockito.when(option.getArgs()).thenReturn(1);
        assertEquals(1, option.getArgs());
    }

    @Test
    public void testGetArgs_unlimitedArgumentValues() {
        Mockito.when(option.getArgs()).thenReturn(Option.UNLIMITED_VALUES);
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }
}