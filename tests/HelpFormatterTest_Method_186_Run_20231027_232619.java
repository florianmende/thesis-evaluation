package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HelpFormatterTest_Method_186_Run_20231027_232619 {
    @Test
    public void testGetOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("-");
        assertEquals("-", formatter.getOptPrefix());

        formatter.setOptPrefix(null);
        assertNull(formatter.getOptPrefix());

        formatter.setOptPrefix("");
        assertEquals("", formatter.getOptPrefix());
    }
}