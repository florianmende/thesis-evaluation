package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_75_Run_20231028_052637 {
    @Test
    public void testEqualsSameShortOption() {
        Option option1 = new Option("a", null, false, "description");
        Option option2 = new Option("a", null, false, "description");
        assertEquals(option1, option2);
    }

    @Test
    public void testEqualsSameLongOption() {
        Option option1 = new Option(null, "long", false, "description");
        Option option2 = new Option(null, "long", false, "description");
        assertEquals(option1, option2);
    }

    @Test
    public void testEqualsDifferentOption() {
        Option option1 = new Option("a", null, false, "description");
        Option option2 = new Option(null, "long", false, "description");
        assertNotEquals(option1, option2);
    }
}