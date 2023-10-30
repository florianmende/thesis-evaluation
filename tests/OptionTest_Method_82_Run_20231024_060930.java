package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_82_Run_20231024_060930 {

    @Test
    public void testGetOpt() throws Exception {
        Option option = new Option("a", "arg-name", false, "description");
        assertEquals("a", option.getOpt());
    }

    @Test
    public void testGetOpt_null() throws Exception {
        Option option = new Option(null, "arg-name", false, "description");
        assertEquals(null, option.getOpt());
    }

    @Test
    public void testGetOpt_empty() throws Exception {
        Option option = new Option("", "arg-name", false, "description");
        assertEquals("", option.getOpt());
    }
}