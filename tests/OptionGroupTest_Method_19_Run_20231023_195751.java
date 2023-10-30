package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class OptionGroupTest_Method_19_Run_20231023_195751 {
    @Test
    public void testGetNamesEmptyMap() {
        OptionGroup optionGroup = new OptionGroup();
        Collection<String> names = optionGroup.getNames();
        assertTrue(names.isEmpty());
    }

    @Test
    public void testGetNamesNonEmptyMap() {
        OptionGroup optionGroup = new OptionGroup();
        Map<String, Option> optionMap = new LinkedHashMap<>();
        optionMap.put("option1", new Option("option1", "description1"));
        optionMap.put("option2", new Option("option2", "description2"));
        optionGroup.addOption(optionMap.get("option1"));
        optionGroup.addOption(optionMap.get("option2"));
        Collection<String> names = optionGroup.getNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("option1"));
        assertTrue(names.contains("option2"));
    }

    @Test
    public void testGetNamesMultipleOptions() {
        OptionGroup optionGroup = new OptionGroup();
        Map<String, Option> optionMap = new LinkedHashMap<>();
        optionMap.put("option1", new Option("option1", "description1"));
        optionMap.put("option2", new Option("option2", "description2"));
        optionMap.put("option3", new Option("option3", "description3"));
        optionGroup.addOption(optionMap.get("option1"));
        optionGroup.addOption(optionMap.get("option2"));
        optionGroup.addOption(optionMap.get("option3"));
        Collection<String> names = optionGroup.getNames();
        assertEquals(3, names.size());
        assertTrue(names.contains("option1"));
        assertTrue(names.contains("option2"));
        assertTrue(names.contains("option3"));
    }
}