package org.apache.commons.cli;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NewDefaultParserTest {
    @Test
    public void testEquals_SameOption() {
        Option option1 = new Option("a", "arg-name", false, "description");
        Option option2 = new Option("a", "arg-name", false, "description");
        assertTrue(option1.equals(option2));
    }

    @Test
    public void testEquals_DifferentShortOptionName() {
        Option option1 = new Option("a", "arg-name", false, "description");
        Option option2 = new Option("b", "arg-name", false, "description");
        assertFalse(option1.equals(option2));
    }

    @Test
    public void testEquals_DifferentLongOptionName() {
        Option option1 = new Option("a", "arg-name", false, "description");
        Option option2 = new Option("a", "arg-name2", false, "description");
        assertFalse(option1.equals(option2));
    }

    @Test
    public void testEquals_DifferentArgumentCount() {
        Option option1 = new Option("a", "arg-name", false, "description");
        Option option2 = new Option("a", "arg-name", true, "description");
        assertFalse(option1.equals(option2));
    }

    @Test
    public void testEquals_DifferentArgumentType() {
        Option option1 = new Option("a", "arg-name", false, "description");
        Option option2 = new Option("a", "arg-name", false, "description", Integer.class);
        assertFalse(option1.equals(option2));
    }
}