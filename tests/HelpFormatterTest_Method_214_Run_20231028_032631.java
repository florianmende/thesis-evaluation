package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
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

class HelpFormatterTest_Method_214_Run_20231028_032631 {
    @Test
    void testSetSyntaxPrefixNonNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("prefix");
        Assertions.assertEquals("prefix", formatter.getSyntaxPrefix());
    }

    @Test
    void testSetSyntaxPrefixNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix(null);
        Assertions.assertNull(formatter.getSyntaxPrefix());
    }

    @Test
    void testSetSyntaxPrefixEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("");
        Assertions.assertEquals("", formatter.getSyntaxPrefix());
    }
}