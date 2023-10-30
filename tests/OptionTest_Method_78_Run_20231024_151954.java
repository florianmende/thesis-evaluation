package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_78_Run_20231024_151954 {
    
    @Test
    public void testGetDescription() {
        Option option = new Option("a", "arg-name", true, "This is a description");
        assertEquals("This is a description", option.getDescription());
    }
    
    @Test
    public void testGetDescriptionWithArgument() {
        Option option = new Option("a", "arg-name", true, "This is a description");
        assertEquals("This is a description", option.getDescription());
    }
    
    @Test
    public void testGetDescriptionWithMultipleArguments() {
        Option option = new Option("a", "arg-name", true, "This is a description");
        assertEquals("This is a description", option.getDescription());
    }
}