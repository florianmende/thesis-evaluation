package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_79_Run_20231024_145023 {
    @Test
    public void testGetId() {
        // create a mock Option object with a valid shortOpt
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getOpt()).thenReturn("a");

        // use doReturn() to specify the return value of getId() for the mock Option object
        Mockito.doReturn(97).when(option).getId();

        // call the getId method and verify that it returns the correct value
        assertEquals(97, option.getId());
    }
}