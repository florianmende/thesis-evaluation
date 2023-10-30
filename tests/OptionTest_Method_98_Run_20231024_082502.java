package org.apache.commons.cli;


import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class OptionTest_Method_98_Run_20231024_082502 {
    @Test
    public void testIsRequired() {
        Option option = Option.builder("a")
                .longOpt("--arg")
                .required(true)
                .build();
        assertTrue(option.isRequired());

        option = Option.builder("b")
                .longOpt("--no-arg")
                .required(false)
                .build();
        assertFalse(option.isRequired());

        option = Option.builder("c")
                .longOpt("--no-arg")
                .build();
        assertFalse(option.isRequired());
    }
}