package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;

class HelpFormatterTest_Method_211_Run_20231024_004630 {
    private HelpFormatter formatter;

    @BeforeEach
    void setup() {
        formatter = new HelpFormatter();
    }

    @Test
    void testSetNewLine() {
        String newLine = "newLine";
        formatter.setNewLine(newLine);
        assertEquals(newLine, formatter.getNewLine());
    }

    @Test
    void testSetNewLineNull() {
        formatter.setNewLine(null);
        assertNull(formatter.getNewLine());
    }

    @Test
    void testSetNewLineEmptyString() {
        String newLine = "";
        formatter.setNewLine(newLine);
        assertEquals(newLine, formatter.getNewLine());
    }
}