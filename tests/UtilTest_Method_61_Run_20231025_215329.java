package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Util;
import org.junit.jupiter.api.Test;

public class UtilTest_Method_61_Run_20231025_215329 {

    @Test
    public void testStripLeadingHyphens() {
        Util util = new Util();

        // Test case 1: null input
        String input = null;
        String output = util.stripLeadingHyphens(input);
        assertEquals(null, output);

        // Test case 2: empty input
        input = "";
        output = util.stripLeadingHyphens(input);
        assertEquals("", output);

        // Test case 3: input with leading hyphens
        input = "--hello";
        output = util.stripLeadingHyphens(input);
        assertEquals("hello", output);
    }
}