package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionsTest_Method_6_Run_20231027_232619 {
    @Test
    public void testAddRequiredOption() {
        Options options = new Options();
        options.addRequiredOption("a", "aaa", false, "description");
        Option option = options.getOption("a");
        assertTrue(option.isRequired());
        assertEquals("aaa", option.getLongOpt());
        assertEquals(false, option.hasArg());
        assertEquals("description", option.getDescription());
    }

    @Test
    public void testSetRequiredOption() {
        Options options = new Options();
        options.addOption("a", "aaa", false, "description");
        Option option = options.getOption("a");
        assertEquals(false, option.isRequired());
        options.addRequiredOption("a", "aaa", false, "description");
        option = options.getOption("a");
        assertTrue(option.isRequired());
    }

    @Test
    public void testAddRequiredOptionAlreadyAdded() {
        Options options = new Options();
        options.addOption("a", "aaa", false, "description");
        Option option = options.getOption("a");
        assertEquals(false, option.isRequired());
        options.addRequiredOption("a", "aaa", false, "description");
        option = options.getOption("a");
        assertTrue(option.isRequired());
    }
}