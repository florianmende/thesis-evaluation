package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OptionsTest_Method_6_Run_20231028_022628 {
    @Test
    public void testAddRequiredOption1() {
        Options options = new Options();
        options.addRequiredOption("a", "long-a", true, "description");
        assertEquals(1, options.getOptions().size());
        Option option = options.getOptions().iterator().next();
        assertEquals("a", option.getOpt());
        assertEquals("long-a", option.getLongOpt());
        assertTrue(option.isRequired());
        assertTrue(option.hasArg());
        assertEquals("description", option.getDescription());
    }

    @Test
    public void testAddRequiredOption2() {
        Options options = new Options();
        options.addRequiredOption("a", "long-a", true, "description");
        assertEquals(1, options.getOptions().size());
        Option option = options.getOptions().iterator().next();
        assertEquals("a", option.getOpt());
        assertEquals("long-a", option.getLongOpt());
        assertTrue(option.isRequired());
        assertTrue(option.hasArg());
        assertEquals("description", option.getDescription());
    }

    @Test
    public void testAddRequiredOption3() {
        Options options = new Options();
        options.addRequiredOption("a", "long-a", true, "description");
        assertEquals(1, options.getOptions().size());
        Option option = options.getOptions().iterator().next();
        assertEquals("a", option.getOpt());
        assertEquals("long-a", option.getLongOpt());
        assertTrue(option.isRequired());
        assertTrue(option.hasArg());
        assertEquals("description", option.getDescription());
    }
}