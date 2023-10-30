package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.apache.commons.cli.HelpFormatter;

public class HelpFormatterTest_Method_188_Run_20231024_165833 {
    @Test
    public void testGetWidth() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());
    }
}