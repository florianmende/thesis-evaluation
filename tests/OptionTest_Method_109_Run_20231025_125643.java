package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.mockito.Mockito.*;

public class OptionTest_Method_109_Run_20231025_125643 {
    @Test
    public void testSetValueSeparator() {
        Option option = mock(Option.class);
        doNothing().when(option).setValueSeparator('=');
        option.setValueSeparator('=');
    }
}