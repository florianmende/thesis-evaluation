package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class HelpFormatterTest_Method_181_Run_20231028_022628 {
    @Test
    void getLeftPadding() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getLeftPadding()).thenReturn(10);
        assertEquals(10, formatter.getLeftPadding());
    }
}