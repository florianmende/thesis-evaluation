package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class OptionTest_Method_96_Run_20231025_193245 {
    @Test
    public void testHasOptionalArg() {
        // create a mock Option object
        Option option = Mockito.mock(Option.class);

        // stub the behavior of the optionalArg method
        Mockito.doReturn(true).when(option).hasOptionalArg();

        // test case 1: the option has an optional argument
        Assertions.assertTrue(option.hasOptionalArg());

        // stub the behavior of the optionalArg method
        Mockito.doReturn(false).when(option).hasOptionalArg();

        // test case 2: the option does not have an optional argument
        Assertions.assertFalse(option.hasOptionalArg());

        // stub the behavior of the argCount method
        // Mockito.doReturn(1).when(option).getArgCount();

        // test case 3: the option has an argument but it is not optional
        Assertions.assertFalse(option.hasOptionalArg());
    }
}