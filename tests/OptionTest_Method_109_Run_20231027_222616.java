package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_109_Run_20231027_222616 {
    @Test
    public void testSetValueSeparator() {
        Option option = new Option("a", "arg-name", false, "description");
        char sep = '=';
        option.setValueSeparator(sep);
        assertEquals(sep, option.getValueSeparator());
    }
}