package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UtilTest_Method_61_Run_20231024_151954 {

    @Mock
    private Util util;

    @Test
    void testNullInput() {
        String input = null;
        String expected = null;
        String actual = util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    void testStartsWithDoubleHyphen() {
        String input = "--hello";
        String expected = "hello";
        String actual = util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    void testStartsWithSingleHyphen() {
        String input = "-hello";
        String expected = "hello";
        String actual = util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    void testDoesNotStartWithHyphen() {
        String input = "hello";
        String expected = "hello";
        String actual = util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }
}