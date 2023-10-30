package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Collection;

public class OptionsTest_Method_10_Run_20231025_105031 {
    @Test
    void getOptionGroups() {
        Options options = new Options();
        Collection<OptionGroup> optionGroups = options.getOptionGroups();
        Assertions.assertNotNull(optionGroups);
        Assertions.assertEquals(0, optionGroups.size());
    }
}