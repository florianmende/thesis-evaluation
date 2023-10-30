package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class OptionGroupTest_Method_22_Run_20231028_052637 {
    @Test
    public void testIsRequired() {
        // case 1: OptionGroup instance is required, and method returns true
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        assertTrue(optionGroup.isRequired());

        // case 2: OptionGroup instance is not required, and method returns false
        optionGroup = new OptionGroup();
        optionGroup.setRequired(false);
        assertFalse(optionGroup.isRequired());

        // case 3: OptionGroup instance is required, but required field is not set, and method returns false
        optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        optionGroup.setRequired(false);
        assertFalse(optionGroup.isRequired());
    }
}