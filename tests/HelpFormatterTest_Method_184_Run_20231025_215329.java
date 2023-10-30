package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

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

class HelpFormatterTest_Method_184_Run_20231025_215329 {
    @Test
    void testGetNewLine() {
        // Case 1: defaultNewLine is not null
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultNewLine = "foo";
        Assertions.assertEquals("foo", formatter.getNewLine());

        // Case 2: defaultNewLine is null
        formatter.defaultNewLine = null;
        Assertions.assertEquals(null, formatter.getNewLine());

        // Case 3: defaultNewLine is an empty string
        formatter.defaultNewLine = "";
        Assertions.assertEquals("", formatter.getNewLine());
    }
}