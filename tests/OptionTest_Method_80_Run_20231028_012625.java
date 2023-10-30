package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class OptionTest_Method_80_Run_20231028_012625 {
    @Test
    public void testGetKey() {
        // Case 1: When the "option" field is null and the "longOption" field is not null.
        Option option = new Option(null, "longOption", false, "description");
        Assertions.assertEquals("longOption", option.getKey());

        // Case 2: When the "option" field is not null and the "longOption" field is null.
        option = new Option("option", null, false, "description");
        Assertions.assertEquals("option", option.getKey());

        // Case 3: When both the "option" field and the "longOption" field are null.
        option = new Option(null, null, false, "description");
        Assertions.assertEquals(null, option.getKey());
    }
}