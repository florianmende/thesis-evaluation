package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.apache.commons.cli.Parser;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ParserTest_Method_117_Run_20231025_215329 {
    @Test
    public void testGetRequiredOptionsEmpty() {
        Parser parser = Mockito.mock(Parser.class);
        Mockito.when(parser.getRequiredOptions()).thenReturn(new ArrayList<>());
        List<String> requiredOptions = parser.getRequiredOptions();
        assertTrue(requiredOptions.isEmpty());
    }

    @Test
    public void testGetRequiredOptionsNotEmpty() {
        Parser parser = Mockito.mock(Parser.class);
        Mockito.when(parser.getRequiredOptions()).thenReturn(Arrays.asList("option1", "option2"));
        List<String> requiredOptions = parser.getRequiredOptions();
        assertEquals(2, requiredOptions.size());
        assertTrue(requiredOptions.contains("option1"));
        assertTrue(requiredOptions.contains("option2"));
    }

    @Test
    public void testGetRequiredOptionsNull() {
        Parser parser = Mockito.mock(Parser.class);
        Mockito.when(parser.getRequiredOptions()).thenReturn(null);
        List<String> requiredOptions = parser.getRequiredOptions();
        assertNull(requiredOptions);
    }
}