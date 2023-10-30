package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

public class OptionGroupTest_Method_20_Run_20231025_121248 {
  @Test
  public void testGetOptionsReturnsEmptyCollectionWhenNoOptions() {
    OptionGroup optionGroup = new OptionGroup();
    Collection<Option> options = optionGroup.getOptions();
    assertTrue(options.isEmpty());
  }

  @Test
  public void testGetOptionsReturnsOneOptionWhenOneOptionInGroup() {
    OptionGroup optionGroup = new OptionGroup();
    Option option = mock(Option.class);
    when(option.getKey()).thenReturn("option1");
    optionGroup.addOption(option);
    Collection<Option> options = optionGroup.getOptions();
    assertEquals(1, options.size());
    assertTrue(options.contains(option));
  }

  @Test
  public void testGetOptionsReturnsMultipleOptionsWhenMultipleOptionsInGroup() {
    OptionGroup optionGroup = new OptionGroup();
    Option option1 = mock(Option.class);
    when(option1.getKey()).thenReturn("option1");
    Option option2 = mock(Option.class);
    when(option2.getKey()).thenReturn("option2");
    optionGroup.addOption(option1);
    optionGroup.addOption(option2);
    Collection<Option> options = optionGroup.getOptions();
    assertEquals(2, options.size());
    assertTrue(options.contains(option1));
    assertTrue(options.contains(option2));
  }
}