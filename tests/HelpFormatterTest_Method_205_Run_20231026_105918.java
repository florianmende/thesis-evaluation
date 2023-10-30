package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringReader;
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

public class HelpFormatterTest_Method_205_Run_20231026_105918 {

    @Test
    public void testRtrim_NullOrEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        String result = formatter.rtrim(null);
        assertNull(result);

        result = formatter.rtrim("");
        assertEquals("", result);
    }

    @Test
    public void testRtrim_WhitespaceString() {
        HelpFormatter formatter = new HelpFormatter();
        String result = formatter.rtrim("   ");
        assertEquals("", result);
    }

    @Test
    public void testRtrim_MixedString() {
        HelpFormatter formatter = new HelpFormatter();
        String result = formatter.rtrim("Hello World   ");
        assertEquals("Hello World", result);
    }
}