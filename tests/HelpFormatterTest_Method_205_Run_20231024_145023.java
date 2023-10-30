package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_205_Run_20231024_145023 {

    @Test
    public void testRtrimNull() {
        String input = null;
        String expected = null;
        String actual = rtrim(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testRtrimEmpty() {
        String input = "";
        String expected = "";
        String actual = rtrim(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testRtrimWhitespace() {
        String input = "   ";
        String expected = "";
        String actual = rtrim(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testRtrimMixed() {
        String input = "hello world  ";
        String expected = "hello world";
        String actual = rtrim(input);
        assertEquals(expected, actual);
    }

    private String rtrim(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        int pos = input.length();
        while (pos > 0 && Character.isWhitespace(input.charAt(pos - 1))) {
            --pos;
        }
        return input.substring(0, pos);
    }
}