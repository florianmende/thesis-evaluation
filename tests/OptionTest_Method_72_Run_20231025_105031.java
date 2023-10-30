package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OptionTest_Method_72_Run_20231025_105031 {
    @Test
    public void testAddValueForProcessing() {
        final Option option = new Option("test", true, "Test option");
        option.addValueForProcessing("value");
        Assertions.assertEquals(1, option.getValues().length);

        final Option option2 = new Option("test", false, "Test option");
        Assertions.assertThrows(IllegalArgumentException.class, () -> option2.addValueForProcessing(null));
    }
}