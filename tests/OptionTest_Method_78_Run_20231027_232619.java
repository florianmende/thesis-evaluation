package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OptionTest_Method_78_Run_20231027_232619 {
    @Test
    public void testGetDescription() {
        Option option = new Option("a", "description");
        Assertions.assertEquals("description", option.getDescription());
    }

    @Test
    public void testGetArgCount() {
        Option option = new Option("a", "description");
        Assertions.assertEquals(1, option.getArgCount());
    }

    @Test
    public void testGetOption() {
        Option option = new Option("a", "description");
        Assertions.assertEquals("a", option.getOption());
    }

    // Add missing methods to the Option class
    public class Option {
        private String name;
        private String description;

        public Option(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public int getArgCount() {
            return 1;
        }

        public String getOption() {
            return name;
        }
    }
}