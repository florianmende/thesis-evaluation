package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MissingArgumentExceptionTest_Method_32_Run_20231024_004630 {

    @Test
    public void testGetOption() {
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("optionKey");

        MissingArgumentException exception = new MissingArgumentException(option);

        assertEquals("optionKey", exception.getOption().getKey());
    }
}