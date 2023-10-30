package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_96_Run_20231027_222616 {
    @Test
    void testHasOptionalArg() {
        Option option = Option.builder("a").optionalArg(true).build();
        assertTrue(option.hasOptionalArg());
    }

    @Test
    void testDoesNotHaveOptionalArg() {
        Option option = Option.builder("a").optionalArg(false).build();
        assertFalse(option.hasOptionalArg());
    }

    @Test
    void testHasRequiredArg() {
        Option option = Option.builder("a").required(true).build();
        assertFalse(option.hasOptionalArg());
    }
}