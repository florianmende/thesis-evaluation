package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UtilTest_Method_61_Run_20231025_224954 {
    @Test
    public void testStripLeadingHyphens_null() {
        String str = null;
        String result = Util.stripLeadingHyphens(str);
        assertNull(result);
    }

    @Test
    public void testStripLeadingHyphens_oneHyphen() {
        String str = "-one";
        String result = Util.stripLeadingHyphens(str);
        assertEquals("one", result);
    }

    @Test
    public void testStripLeadingHyphens_multipleHyphens() {
        String str = "--one";
        String result = Util.stripLeadingHyphens(str);
        assertEquals("one", result);
    }

    @Test
    public void testStripLeadingHyphens_noHyphens() {
        String str = "one";
        String result = Util.stripLeadingHyphens(str);
        assertEquals("one", result);
    }
}