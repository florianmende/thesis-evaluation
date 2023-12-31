/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:05:50 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.List;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Options_ESTest extends Options_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("ufSZ1", (String) null, false, "\"gbDIX+");
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Options options0 = new Options();
      List<Option> list0 = options0.helpOptions();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", "}G?{%{(@x` ");
      Options options1 = options0.addOption(option0);
      List<Option> list0 = options1.helpOptions();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", true, "");
      Option option0 = options0.getOption("");
      OptionGroup optionGroup0 = new OptionGroup();
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options2 = options1.addOptionGroup(optionGroup1);
      options2.getOptionGroup(option0);
      assertFalse(option0.isRequired());
      assertFalse(option0.hasLongOpt());
      assertTrue(option0.hasArg());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", "}G?{%{(@x` ");
      options0.addOption(option0);
      option0.setValueSeparator('%');
      Option option1 = options0.getOption("");
      assertEquals("}G?{%{(@x` ", option1.getDescription());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", true, "");
      Option option0 = options0.getOption("");
      assertNotNull(option0);
      
      option0.setOptionalArg(true);
      Option option1 = options1.getOption("");
      assertTrue(option1.hasArg());
      assertFalse(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("9", "9", true, "9");
      Option option0 = options1.getOption("9");
      assertTrue(option0.isRequired());
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption((String) null, (String) null, true, (String) null);
      Option option0 = options0.getOption((String) null);
      assertNotNull(option0);
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.getOptionGroup((Option) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addRequiredOption("' was specified but an option from this group has already been selected: '", "' was specified but an option from this group has already been selected: '", true, "' was specified but an option from this group has already been selected: '");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '' was specified but an option from this group has already been selected: '' contains an illegal character : '''
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOptionGroup((OptionGroup) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption((Option) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption(" ]", " ]", false, " ]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option ' ]' contains an illegal character : ' '
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", "");
      option0.setRequired(true);
      Options options1 = options0.addOption(option0);
      Options options2 = options0.addOption(option0);
      assertSame(options2, options1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      Options options1 = options0.addOption(option0);
      option0.setArgName("c?E");
      Option option1 = options1.getOption((String) null);
      assertNull(option1.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", "^tl:", false, "^tl:");
      Options options1 = options0.addOption(option0);
      assertSame(options0, options1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("4E", "4E");
      boolean boolean0 = options1.hasShortOption("4E");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasShortOption((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", "w@HH", false, "w@HH");
      boolean boolean0 = options1.hasOption("w@HH");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption((String) null, (String) null);
      boolean boolean0 = options1.hasOption((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasOption((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("9", "9", false, "9");
      boolean boolean0 = options1.hasLongOption("9");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasLongOption("9");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = options0.getOption("");
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", "w@HH", true, "");
      List<String> list0 = options1.getMatchingOptions("");
      assertFalse(list0.contains(""));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("9", "9", false, "9");
      List<String> list0 = options0.getMatchingOptions("y");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("", "", false, "");
      // Undeclared exception!
      try { 
        options0.getMatchingOptions((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("ywI", "ywI", false, "ywI");
      List<String> list0 = options1.getMatchingOptions("ywI");
      assertTrue(list0.contains("ywI"));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setRequired(true);
      Options options1 = options0.addOptionGroup(optionGroup0);
      assertSame(options0, options1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Options options0 = new Options();
      Collection<OptionGroup> collection0 = options0.getOptionGroups();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", "}G?{%{(@x` ");
      OptionGroup optionGroup0 = options0.getOptionGroup(option0);
      assertNull(optionGroup0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Options options0 = new Options();
      String string0 = options0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Options options0 = new Options();
      List list0 = options0.getRequiredOptions();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Options options0 = new Options();
      Collection<Option> collection0 = options0.getOptions();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("[ Options: [ short java.util.LinkedHashMap@0000000003 ] [ long {} ]", "org.apache.commons.cli.ParseException");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '[ Options: [ short java.util.LinkedHashMap@0000000003 ] [ long {} ]' contains an illegal character : '['
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("e?", false, "e?");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'e?' contains an illegal character : '?'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }
}
