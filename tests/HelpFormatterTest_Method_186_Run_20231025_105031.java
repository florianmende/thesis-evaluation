package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

public class HelpFormatterTest_Method_186_Run_20231025_105031 {

    @Test
    public void testGetOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();

        // Case 1: The method returns the correct 'optPrefix' when it is not null.
        String optPrefix = "--";
        formatter.setOptPrefix(optPrefix);
        assertEquals(optPrefix, formatter.getOptPrefix());

        // Case 2: The method returns the correct 'optPrefix' when it is null.
        formatter.setOptPrefix(null);
        assertEquals(null, formatter.getOptPrefix());

        // Case 3: The method returns the correct 'optPrefix' when it is empty.
        formatter.setOptPrefix("");
        assertEquals("", formatter.getOptPrefix());
    }
}