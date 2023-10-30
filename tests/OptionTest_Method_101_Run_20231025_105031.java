package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OptionTest_Method_101_Run_20231025_105031 {
    @Test
    public void testSetArgName() {
        // Test with a valid argument name
        Option option = new Option("_a", "--arg", true, "description");
        option.setArgName("argName");
        assertEquals("argName", option.getArgName());

        // Test with an empty argument name
        option = new Option("_a", "--arg", true, "description");
        option.setArgName("");
        assertEquals("", option.getArgName());

        // Test with a null argument name
        option = new Option("_a", "--arg", true, "description");
        option.setArgName(null);
        assertEquals(null, option.getArgName());
    }
}