package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionTest_Method_96_Run_20231028_022628 {
    @Test
    public void testHasOptionalArg() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasOptionalArg()).thenReturn(true);
        assertTrue(option.hasOptionalArg());
    }
}