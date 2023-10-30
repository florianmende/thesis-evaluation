package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintWriter;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HelpFormatterTest_Method_206_Run_20231024_082502 {

    @Test
    public void testSetArgNameNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName(null);
        assertNull(formatter.getArgName());
    }

    @Test
    public void testSetArgNameEmpty() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("");
        assertEquals("", formatter.getArgName());
    }

    @Test
    public void testSetArgNameNonEmpty() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("test");
        assertEquals("test", formatter.getArgName());
    }
}