package org.apache.commons.cli;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.apache.commons.cli.Option;
import org.junit.Test;

public class OptionTest_Method_74_Run_20231024_151954 {

    @Test
    public void testClone() {
        Option option = new Option("a", "b", true, "c");
        Option clone = (Option) option.clone();

        assertEquals(option, clone);
        assertNotSame(option, clone);
    }
}