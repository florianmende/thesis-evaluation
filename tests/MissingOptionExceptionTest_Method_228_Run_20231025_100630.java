package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.apache.commons.cli.MissingOptionException;
import java.util.List;
import java.util.ArrayList;

public class MissingOptionExceptionTest_Method_228_Run_20231025_100630 {
    @Test
    public void testGetMissingOptions() {
        List<String> missingOptions = new ArrayList<>();
        missingOptions.add("option1");
        missingOptions.add("option2");
        missingOptions.add("option3");

        MissingOptionException exception = new MissingOptionException(missingOptions);

        Assertions.assertEquals(missingOptions, exception.getMissingOptions());
    }
}