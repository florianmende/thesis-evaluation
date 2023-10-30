package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class OptionTest_Method_93_Run_20231024_080105 {
    @Test
    public void testHashCode() {
        Option option1 = new Option("a", "long-a", true, "description");
        Option option2 = new Option("b", "long-b", false, "description");
        Option option3 = new Option("c", null, true, "description");

        // case 1: the Option object has a longOption and an option field
        assertNotEquals(0, option1.hashCode());

        // case 2: the Option object has only a longOption field
        assertNotEquals(0, option2.hashCode());

        // case 3: the Option object has only an option field
        assertNotEquals(0, option3.hashCode());
    }
}