package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionTest_Method_98_Run_20231030_094427 {
    @Test
    public void testIsRequired() {
        // create an Option with required set to true
        Option option = Option.builder("a").required(true).build();
        assertTrue(option.isRequired());

        // create an Option with required set to false
        option = Option.builder("a").required(false).build();
        assertFalse(option.isRequired());

        // create an Option with required not set
        option = Option.builder("a").build();
        assertFalse(option.isRequired());
    }
}