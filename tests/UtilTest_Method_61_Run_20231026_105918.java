package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilTest_Method_61_Run_20231026_105918 {
    @Test
    public void testStripLeadingHyphens_noHyphen() {
        String str = "hello";
        String result = Util.stripLeadingHyphens(str);
        assertEquals(str, result);
    }

    @Test
    public void testStripLeadingHyphens_singleHyphen() {
        String str = "-hello";
        String result = Util.stripLeadingHyphens(str);
        assertEquals("hello", result);
    }

    @Test
    public void testStripLeadingHyphens_doubleHyphen() {
        String str = "--hello";
        String result = Util.stripLeadingHyphens(str);
        assertEquals("hello", result);
    }
}