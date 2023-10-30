package org.apache.commons.cli;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OptionBuilderTest_Method_156_Run_20231026_105918 {
    
    @Test
    public void testCreate() {
        Option option = OptionBuilder.create('a');
        assertNotNull(option);
        assertEquals("a", option.getOpt());
    }
}