package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_103_Run_20231025_193245 {
    @Test
    public void testSetDescription() {
        Option option = new Option("test", "This is a test option");
        option.setDescription("This is a new description");
        assertEquals("This is a new description", option.getDescription());
    }
}