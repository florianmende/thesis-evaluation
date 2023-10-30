package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OptionTest_Method_80_Run_20231023_195751 {
    @Test
    public void testGetKey() {
        Option option = new Option("a", "arg-name", false, "description");
        Assertions.assertEquals("a", option.getKey());

        option = new Option(null, "long-opt", false, "description");
        Assertions.assertEquals("long-opt", option.getKey());

        option = new Option("a", "long-opt", false, "description");
        Assertions.assertEquals("a", option.getKey());
    }
}