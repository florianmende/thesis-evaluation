package org.apache.commons.cli;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AlreadySelectedExceptionTest_Method_154_Run_20231025_224954 {

    @Test
    public void testGetOptionGroup() {
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "aaa");
        group.addOption(option);
        AlreadySelectedException exception = new AlreadySelectedException(group, option);
        assertEquals(group, exception.getOptionGroup());
    }

    @Test
    public void testGetOptionGroupNull() {
        AlreadySelectedException exception = new AlreadySelectedException("message");
        assertNull(exception.getOptionGroup());
    }
}