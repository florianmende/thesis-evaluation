package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
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

public class HelpFormatterTest_Method_211_Run_20231023_204140 {

    @Test
    public void testSetNewLine() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("newLine");
        assertEquals("newLine", formatter.getNewLine());
    }

    @Test
    public void testSetNewLineNull() {
        HelpFormatter formatter = new HelpFormatter();
        assertDoesNotThrow(() -> formatter.setNewLine(null));
    }

    @Test
    public void testSetNewLineEmpty() {
        HelpFormatter formatter = new HelpFormatter();
        assertDoesNotThrow(() -> formatter.setNewLine(""));
    }
}