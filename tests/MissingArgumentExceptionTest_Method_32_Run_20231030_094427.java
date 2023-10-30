package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class MissingArgumentExceptionTest_Method_32_Run_20231030_094427 {
    @Test
    public void testGetOption() {
        // create a mock Option object
        Option option = Mockito.mock(Option.class);
        
        // create a MissingArgumentException object with the mock Option object
        MissingArgumentException ex = new MissingArgumentException(option);
        
        // call the getOption() method and assert that it returns the mock Option object
        Assertions.assertEquals(option, ex.getOption());
    }
}