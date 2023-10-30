package org.apache.commons.cli;

import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MissingArgumentExceptionTest_Method_32_Run_20231024_060930 {

    @Test
    public void testGetOption() {
        Option option = new Option("a", "arg");
        MissingArgumentException ex = new MissingArgumentException(option);
        assertEquals(option, ex.getOption());
    }

    @Test
    public void testGetOptionNull() {
        MissingArgumentException ex = new MissingArgumentException("Missing argument for option: a");
        assertNull(ex.getOption());
    }
}