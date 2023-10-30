package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;

public class HelpFormatterTest_Method_181_Run_20231028_042634 {

    @Test
    public void testGetLeftPadding() {
        HelpFormatter helpFormatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(helpFormatter.getLeftPadding()).thenReturn(5);
        Assertions.assertEquals(5, helpFormatter.getLeftPadding());
    }
}