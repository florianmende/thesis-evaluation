package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UtilTest_Method_61_Run_20231024_165833 {
    
    @Test
    public void testStripLeadingHyphens() {
        Util util = new Util();
        String str = "--hello";
        String expected = "hello";
        String actual = util.stripLeadingHyphens(str);
        assertEquals(expected, actual);

        str = "-hello";
        expected = "hello";
        actual = util.stripLeadingHyphens(str);
        assertEquals(expected, actual);

        str = "hello";
        expected = "hello";
        actual = util.stripLeadingHyphens(str);
        assertEquals(expected, actual);

        str = null;
        expected = null;
        actual = util.stripLeadingHyphens(str);
        assertNull(actual);
    }
}