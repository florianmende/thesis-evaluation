package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_73_Run_20231025_215329 {

    @Test
    public void testClearValues() {
        Option option = Mockito.mock(Option.class);
        option.clearValues();
        Mockito.verify(option, Mockito.times(1)).clearValues();
    }
}