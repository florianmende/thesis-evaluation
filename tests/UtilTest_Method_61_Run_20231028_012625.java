package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UtilTest_Method_61_Run_20231028_012625 {
    
    @Test
    public void testStripLeadingHyphensWithNullInput() {
        String input = null;
        String output = Util.stripLeadingHyphens(input);
        assertNull(output);
    }

    @Test
    public void testStripLeadingHyphensWithDoubleHyphens() {
        String input = "--hello";
        String output = Util.stripLeadingHyphens(input);
        assertEquals("hello", output);
    }

    @Test
    public void testStripLeadingHyphensWithSingleHyphen() {
        String input = "-hello";
        String output = Util.stripLeadingHyphens(input);
        assertEquals("hello", output);
    }
}