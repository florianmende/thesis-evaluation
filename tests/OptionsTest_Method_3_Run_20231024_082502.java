package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_3_Run_20231024_082502 {
    @Test
    public void testAddOptionWithShortNameOnly() {
        Options options = new Options();
        options.addOption("a", null, false, "Short option only");
        
        assertEquals(1, options.getOptions().size());
        assertTrue(options.hasShortOption("a"));
        assertTrue(options.hasOption("a"));
    }
    
    @Test
    public void testAddOptionWithLongNameOnly() {
        Options options = new Options();
        options.addOption(null, "long", false, "Long option only");
        
        assertEquals(1, options.getOptions().size());
        assertTrue(options.hasLongOption("long"));
        assertTrue(options.hasOption("long"));
    }
    
    @Test
    public void testAddOptionWithShortAndLongNames() {
        Options options = new Options();
        options.addOption("a", "long", false, "Short and long options");
        
        assertEquals(1, options.getOptions().size());
        assertTrue(options.hasShortOption("a"));
        assertTrue(options.hasLongOption("long"));
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("long"));
    }
}