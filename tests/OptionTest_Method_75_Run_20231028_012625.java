package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_75_Run_20231028_012625 {

    @Test
    public void testEquals() throws Exception {
        // case 1: both options are the same instance
        Option option = new Option("a", "aaa", false, "description");
        assertTrue(option.equals(option));

        // case 2: both options have the same longOption and option fields
        Option option1 = new Option("a", "aaa", false, "description");
        Option option2 = new Option("a", "aaa", false, "description");
        assertTrue(option1.equals(option2));

        // case 3: both options have different longOption and option fields
        Option option3 = new Option("b", "bbb", false, "description");
        Option option4 = new Option("c", "ccc", false, "description");
        assertFalse(option3.equals(option4));
    }
}