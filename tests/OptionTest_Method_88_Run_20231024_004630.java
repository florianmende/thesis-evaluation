package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OptionTest_Method_88_Run_20231024_004630 {

    @Test
    void testGetValueSeparator() {
        Option option = mock(Option.class);

        // test default value separator
        when(option.getValueSeparator()).thenReturn('=');
        assertEquals('=', option.getValueSeparator());

        // test custom value separator
        when(option.getValueSeparator()).thenReturn('=');
        assertEquals('=', option.getValueSeparator());
    }

}