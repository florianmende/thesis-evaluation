package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest_Method_61_Run_20231027_232619 {

    @Test
    void stripLeadingHyphens_null() {
        String input = null;
        String output = Util.stripLeadingHyphens(input);
        assertNull(output);
    }

    @Test
    void stripLeadingHyphens_singleHyphen() {
        String input = "-hello";
        String output = Util.stripLeadingHyphens(input);
        assertEquals("hello", output);
    }

    @Test
    void stripLeadingHyphens_doubleHyphen() {
        String input = "--hello";
        String output = Util.stripLeadingHyphens(input);
        assertEquals("hello", output);
    }
}