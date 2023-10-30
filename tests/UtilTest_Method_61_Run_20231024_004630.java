package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class UtilTest_Method_61_Run_20231024_004630 {

    @Test
    public void testStripLeadingHyphens_noHyphens() {
        String str = "hello";
        String result = Util.stripLeadingHyphens(str);
        assertEquals(str, result);
    }

    @Test
    public void testStripLeadingHyphens_oneHyphen() {
        String str = "-hello";
        String result = Util.stripLeadingHyphens(str);
        assertEquals("hello", result);
    }

    @Test
    public void testStripLeadingHyphens_twoHyphens() {
        String str = "--hello";
        String result = Util.stripLeadingHyphens(str);
        assertEquals("hello", result);
    }
}