package org.apache.commons.cli;


import org.apache.commons.cli.MissingOptionException;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MissingOptionExceptionTest_Method_228_Run_20231027_232619 {
    @Test
    public void testGetMissingOptionsEmpty() {
        MissingOptionException e = new MissingOptionException(new ArrayList<>());
        Assert.assertEquals(0, e.getMissingOptions().size());
    }

    @Test
    public void testGetMissingOptionsSingle() {
        List<String> missingOptions = new ArrayList<>();
        missingOptions.add("option1");
        MissingOptionException e = new MissingOptionException(missingOptions);
        Assert.assertEquals(1, e.getMissingOptions().size());
        Assert.assertEquals("option1", e.getMissingOptions().get(0));
    }

    @Test
    public void testGetMissingOptionsMultiple() {
        List<String> missingOptions = new ArrayList<>();
        missingOptions.add("option1");
        missingOptions.add("option2");
        MissingOptionException e = new MissingOptionException(missingOptions);
        Assert.assertEquals(2, e.getMissingOptions().size());
        Assert.assertEquals("option1", e.getMissingOptions().get(0));
        Assert.assertEquals("option2", e.getMissingOptions().get(1));
    }
}