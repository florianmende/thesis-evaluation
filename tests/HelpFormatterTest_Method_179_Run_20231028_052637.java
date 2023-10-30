package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class HelpFormatterTest_Method_179_Run_20231028_052637 {

    @Test
    void testGetArgNameWithNonEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultArgName = "argName";
        String argName = formatter.getArgName();
        Assertions.assertEquals("argName", argName);
    }

    @Test
    void testGetArgNameWithEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultArgName = "";
        String argName = formatter.getArgName();
        Assertions.assertEquals("", argName);
    }

    @Test
    void testGetArgNameWithNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultArgName = null;
        String argName = formatter.getArgName();
        Assertions.assertNull(argName);
    }
}