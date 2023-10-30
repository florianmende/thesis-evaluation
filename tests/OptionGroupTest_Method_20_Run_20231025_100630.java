package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

class OptionGroupTest_Method_20_Run_20231025_100630 {

    @Test
    void testGetOptionsWhenEmpty() {
        OptionGroup group = new OptionGroup();
        Collection<Option> options = group.getOptions();
        assertTrue(options.isEmpty());
    }

    @Test
    void testGetOptionsWhenNotEmpty() {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "aaa"));
        group.addOption(new Option("b", "bbb"));
        Collection<Option> options = group.getOptions();
        assertEquals(2, options.size());
        assertTrue(options.contains(new Option("a", "aaa")));
        assertTrue(options.contains(new Option("b", "bbb")));
    }

}