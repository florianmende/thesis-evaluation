package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Assertions;

public class MissingArgumentExceptionTest_Method_32_Run_20231024_151954 {
    @Test
    public void testGetOption() {
        Option option = new Option("option", "option description");
        MissingArgumentException exception = new MissingArgumentException(option);
        Assertions.assertEquals(option, exception.getOption());
    }
}