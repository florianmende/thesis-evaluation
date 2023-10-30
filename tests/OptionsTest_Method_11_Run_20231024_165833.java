package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class OptionsTest_Method_11_Run_20231024_165833 {

    @Test
    public void testGetOptionsEmpty() {
        Options options = new Options();
        Collection<Option> actual = options.getOptions();
        assertEquals(0, actual.size());
    }

    @Test
    public void testGetOptions() {
        Options options = new Options();
        Option option1 = new Option("a", "aaa", false, "Option 1");
        Option option2 = new Option("b", "bbb", false, "Option 2");
        options.addOption(option1);
        options.addOption(option2);
        Collection<Option> actual = options.getOptions();
        assertEquals(2, actual.size());
        assertTrue(actual.contains(option1));
        assertTrue(actual.contains(option2));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptionsReadOnly() {
        Options options = new Options();
        Option option1 = new Option("a", "aaa", false, "Option 1");
        options.addOption(option1);
        Collection<Option> actual = options.getOptions();
        actual.add(new Option("b", "bbb", false, "Option 2"));
    }
}