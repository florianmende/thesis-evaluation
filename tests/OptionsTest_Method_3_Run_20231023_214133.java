package org.apache.commons.cli;


import org.apache.commons.cli.Options;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class OptionsTest_Method_3_Run_20231023_214133 {

    @Mock
    private Options options;

    @Test
    public void testAddOption() {
        options.addOption("a", "description");
        Mockito.verify(options).addOption("a", "description");
    }

    @Test
    public void testAddOptionIsNotAddedToLongOptions() {
        options.addOption("a", "description");
        assertEquals(0, options.getOptions().size());
    }

    @Test
    public void testAddOptionIsNotAddedToRequiredOptions() {
        options.addOption("a", "description");
        assertEquals(0, options.getRequiredOptions().size());
    }
}