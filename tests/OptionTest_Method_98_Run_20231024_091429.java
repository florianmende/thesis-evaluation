package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OptionTest_Method_98_Run_20231024_091429 {

    @Test
    public void testIsRequired_required() {
        Option option = Option.builder("a").required(true).longOpt("arg-name").build();
        assertTrue(option.isRequired());
    }

    @Test
    public void testIsRequired_notRequired() {
        Option option = Option.builder("a").required(false).longOpt("arg-name").build();
        assertFalse(option.isRequired());
    }

    @Test
    public void testIsRequired_requiredWithOptionalArg() {
        Option option = Option.builder("a").required(true).optionalArg(true).longOpt("arg-name").build();
        assertTrue(option.isRequired());
    }
}