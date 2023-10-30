package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HelpFormatterTest_Method_186_Run_20231025_125643 {
    @Test
    public void testGetOptPrefix() {
        // Set up a mock HelpFormatter object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);

        // Set the defaultOptPrefix field to a non-default value
        Mockito.doReturn("--test").when(formatter).getOptPrefix();

        // Call the getOptPrefix method and check the result
        String result = formatter.getOptPrefix();
        assertEquals("--test", result);

        // Set the defaultOptPrefix field to null and call the getOptPrefix method again
        Mockito.doReturn(null).when(formatter).getOptPrefix();
        result = formatter.getOptPrefix();
        assertNull(result);
    }
}