package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;

public class OptionTest_Method_80_Run_20231026_105918 {
    @Test
    public void testGetKey() {
        // Case 1: option is null, longOption is not null
        Option option = new Option(null, "longOption", false, "description");
        Assertions.assertEquals("longOption", option.getKey());

        // Case 2: option is not null, longOption is null
        option = new Option("option", null, false, "description");
        Assertions.assertEquals("option", option.getKey());

        // Case 3: both option and longOption are null
        option = new Option(null, null, false, "description");
        Assertions.assertEquals(null, option.getKey());
    }
}