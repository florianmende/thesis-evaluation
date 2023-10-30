package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;

public class OptionGroupTest_Method_18_Run_20231028_012625 {
    @Test
    public void testAddOptionToEmptyGroup() {
        OptionGroup group = new OptionGroup();
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("option1");
        group.addOption(option);
        Assertions.assertEquals(1, group.getOptions().size());
        Assertions.assertEquals(option, group.getOptions().stream().filter(o -> o.getKey().equals("option1")).findFirst().get());
    }

    @Test
    public void testAddOptionToNonEmptyGroup() {
        OptionGroup group = new OptionGroup();
        Option option1 = Mockito.mock(Option.class);
        Mockito.when(option1.getKey()).thenReturn("option1");
        Option option2 = Mockito.mock(Option.class);
        Mockito.when(option2.getKey()).thenReturn("option2");
        group.addOption(option1);
        group.addOption(option2);
        Assertions.assertEquals(2, group.getOptions().size());
        Assertions.assertEquals(option1, group.getOptions().stream().filter(o -> o.getKey().equals("option1")).findFirst().get());
        Assertions.assertEquals(option2, group.getOptions().stream().filter(o -> o.getKey().equals("option2")).findFirst().get());
    }

    @Test
    public void testAddDuplicateOption() {
        OptionGroup group = new OptionGroup();
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("option1");
        group.addOption(option);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            if (group.getOptions().stream().anyMatch(o -> o.getKey().equals("option1"))) {
                throw new IllegalArgumentException("Option already added to group");
            }
            group.addOption(option);
        });
    }
}