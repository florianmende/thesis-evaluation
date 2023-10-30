package org.apache.commons.cli;


import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class OptionTest_Method_93_Run_20231024_082502 {
    @Test
    public void testHashCode() {
        Option option1 = Option.builder("a").build();
        Option option2 = Option.builder("b").build();
        Option option3 = Option.builder("c").build();

        assertNotEquals(option1.hashCode(), option2.hashCode());
        assertNotEquals(option1.hashCode(), option3.hashCode());
        assertNotEquals(option2.hashCode(), option3.hashCode());
    }
}