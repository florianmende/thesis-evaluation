package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionGroupTest_Method_21_Run_20231028_052637 {
    @Test
    public void testGetSelected() {
        OptionGroup group = new OptionGroup();
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("option1");
        try {
            group.setSelected(option);
        } catch (AlreadySelectedException e) {
            fail("AlreadySelectedException should not be thrown");
        }
        assertEquals("option1", group.getSelected());
    }

    @Test
    public void testGetSelectedNull() {
        OptionGroup group = new OptionGroup();
        assertNull(group.getSelected());
    }

    @Test
    public void testGetSelectedAlreadySelectedException() {
        OptionGroup group = new OptionGroup();
        Option option1 = Mockito.mock(Option.class);
        Option option2 = Mockito.mock(Option.class);
        Mockito.when(option1.getKey()).thenReturn("option1");
        Mockito.when(option2.getKey()).thenReturn("option2");
        try {
            group.setSelected(option1);
            group.setSelected(option2);
            fail("AlreadySelectedException should be thrown");
        } catch (AlreadySelectedException e) {
            assertEquals("option1", group.getSelected());
        }
    }
}