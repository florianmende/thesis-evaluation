package org.apache.commons.cli;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class OptionsTest_Method_16_Run_20231026_155023 {
    @Test
    public void testHelpOptions_EmptyList() {
        Options options = new Options();
        List<Option> helpOptions = options.helpOptions();
        assertTrue(helpOptions.isEmpty());
    }

    @Test
    public void testHelpOptions_OneOption() {
        Options options = new Options();
        options.addOption("a", "aaa", false, "aaa description");
        List<Option> helpOptions = options.helpOptions();
        assertEquals(1, helpOptions.size());
        assertEquals("a", helpOptions.get(0).getOpt());
        assertEquals("aaa", helpOptions.get(0).getLongOpt());
        assertEquals("aaa description", helpOptions.get(0).getDescription());
    }

    @Test
    public void testHelpOptions_MultipleOptions() {
        Options options = new Options();
        options.addOption("a", "aaa", false, "aaa description");
        options.addOption("b", "bbb", false, "bbb description");
        options.addOption("c", "ccc", false, "ccc description");
        List<Option> helpOptions = options.helpOptions();
        assertEquals(3, helpOptions.size());
        assertEquals("a", helpOptions.get(0).getOpt());
        assertEquals("aaa", helpOptions.get(0).getLongOpt());
        assertEquals("aaa description", helpOptions.get(0).getDescription());
        assertEquals("b", helpOptions.get(1).getOpt());
        assertEquals("bbb", helpOptions.get(1).getLongOpt());
        assertEquals("bbb description", helpOptions.get(1).getDescription());
        assertEquals("c", helpOptions.get(2).getOpt());
        assertEquals("ccc", helpOptions.get(2).getLongOpt());
        assertEquals("ccc description", helpOptions.get(2).getDescription());
    }
}