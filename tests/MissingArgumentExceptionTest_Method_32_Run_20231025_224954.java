package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MissingArgumentExceptionTest_Method_32_Run_20231025_224954 {
    @Test
    void testGetOption() {
        Option option = Mockito.mock(Option.class);
        MissingArgumentException ex = new MissingArgumentException(option);
        assertEquals(option, ex.getOption());
    }
}