package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

class OptionTest_Method_82_Run_20231027_222616 {
    @Test
    void testGetOpt() {
        Option option = new Option("a", "arg-name", false, "description");
        assertEquals("a", option.getOpt());
    }
}