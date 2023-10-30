package org.apache.commons.cli;

import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MissingArgumentExceptionTest_Method_32_Run_20231023_195751 {

    @Test
    public void testGetOption() {
        Option option = Mockito.mock(Option.class);
        MissingArgumentException exception = new MissingArgumentException(option);
        assertEquals(option, exception.getOption());
    }

    @Test
    public void testGetOptionWithSpecificOption() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("key");
        MissingArgumentException exception = new MissingArgumentException(option);
        assertEquals(option, exception.getOption());
    }

    @Test
    public void testGetOptionWithoutOption() {
        MissingArgumentException exception = new MissingArgumentException("message");
        assertNull(exception.getOption());
    }
}