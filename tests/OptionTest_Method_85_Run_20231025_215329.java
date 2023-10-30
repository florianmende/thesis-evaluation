package org.apache.commons.cli;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class OptionTest_Method_85_Run_20231025_215329 {
    @Mock
    private Option option;

    @Test
    public void testGetValue_noValues() {
        // when
        when(option.getValue(0)).thenReturn(null);

        // then
        assertNull(option.getValue(0));
    }

    @Test
    public void testGetValue_oneValue() {
        // when
        when(option.getValue(0)).thenReturn("value1");

        // then
        assertEquals("value1", option.getValue(0));
    }

    @Test
    public void testGetValue_multipleValues() {
        // when
        when(option.getValue(0)).thenReturn("value1");
        when(option.getValue(1)).thenReturn("value2");

        // then
        assertEquals("value1", option.getValue(0));
        assertEquals("value2", option.getValue(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_invalidIndex() {
        // when
        when(option.getValue(0)).thenThrow(new IndexOutOfBoundsException());

        // then
        option.getValue(0);
    }
}