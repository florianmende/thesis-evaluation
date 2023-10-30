package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;

public class OptionTest_Method_98_Run_20231028_042634 {
    @Test
    public void testIsRequired() {
        // create a mock Option object
        Option option = Mockito.mock(Option.class);

        // set the required field to true
        Mockito.when(option.isRequired()).thenReturn(true);

        // assert that the option is required
        Assertions.assertTrue(option.isRequired());

        // set the required field to false
        Mockito.when(option.isRequired()).thenReturn(false);

        // assert that the option is not required
        Assertions.assertFalse(option.isRequired());
    }
}