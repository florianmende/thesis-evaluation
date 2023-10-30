package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Collection;

class OptionGroupTest_Method_19_Run_20231024_151954 {
    @Test
    void testGetNames() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.addOption(Mockito.mock(Option.class));
        optionGroup.addOption(Mockito.mock(Option.class));
        optionGroup.addOption(Mockito.mock(Option.class));

        Collection<String> names = optionGroup.getNames();

        assertNotNull(names);
        assertEquals(1, names.size());
    }
}