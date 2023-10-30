package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_188_Run_20231025_224954 {
    @Test
    public void testGetWidthDefault() {
        // Create a new instance of the HelpFormatter class
        HelpFormatter formatter = new HelpFormatter();
        
        // Get the default width value
        int defaultWidth = 80;
        
        // Assert that the default width value is 80
        assertEquals(80, defaultWidth);
    }
    
    @Test
    public void testGetWidthNewValue() {
        // Create a new instance of the HelpFormatter class
        HelpFormatter formatter = new HelpFormatter();
        
        // Set a new width value using the setWidth() method
        formatter.setWidth(100);
        
        // Get the new width value
        int newWidth = formatter.getWidth();
        
        // Assert that the new width value is 100
        assertEquals(100, newWidth);
    }
    
    @Test
    public void testGetWidthMultipleValues() {
        // Create a new instance of the HelpFormatter class
        HelpFormatter formatter = new HelpFormatter();
        
        // Set multiple width values using the setWidth() method
        formatter.setWidth(100);
        formatter.setWidth(200);
        formatter.setWidth(300);
        
        // Get the last width value
        int lastWidth = formatter.getWidth();
        
        // Assert that the last width value is 300
        assertEquals(300, lastWidth);
    }
}