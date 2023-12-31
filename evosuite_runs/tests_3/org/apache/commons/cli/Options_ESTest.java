/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 23:33:25 GMT 2023
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
      List<Option> list0 = options0.helpOptions();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption((String) null, "'", true, "g;[Yk@*vi-?*# Of");
      List<Option> list0 = options1.helpOptions();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", "");
      OptionGroup optionGroup0 = options0.getOptionGroup(option0);
      assertNull(optionGroup0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", (String) null, false, "");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      options0.getOptionGroup(option0);
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", "");
      Options options1 = options0.addOption(option0);
      option0.setValueSeparator('p');
      Option option1 = options1.getOption("");
      assertNull(option1.getArgName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("CP", "org.apache.commons.cli.Options", false, "CP");
      options0.addOption(option0);
      Option option1 = options0.getOption("org.apache.commons.cli.Options");
      assertNull(option1.getValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", "");
      Options options1 = options0.addOption(option0);
      option0.setArgs(61);
      Option option1 = options1.getOption("");
      assertEquals('\u0000', option1.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption((String) null, "3UHq", false, "3UHq");
      // Undeclared exception!
      try { 
        options1.getMatchingOptions((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addRequiredOption("r-", "r-", true, "r-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'r-' contains an illegal character : '-'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("/x7*@", false, "/x7*@");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '/x7*@' contains an illegal character : '/'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("The option '", "The option '", false, "The option '");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'The option '' contains an illegal character : ' '
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption(" ] [ long ", " ] [ long ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option ' ] [ long ' contains an illegal character : ' '
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, (String) null, false, (String) null);
      option0.setRequired(true);
      Options options1 = options0.addOption(option0);
      assertSame(options0, options1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasShortOption("e7!");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("5", "[ Options: [ short ", false, "5");
      boolean boolean0 = options1.hasOption("[ Options: [ short ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption((String) null, (String) null);
      boolean boolean0 = options1.hasOption((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasOption("[ Options: [ short ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("Ym8", "Ym8", true, "Ym8");
      boolean boolean0 = options0.hasLongOption("Ym8");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasLongOption("5");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = options0.getOption("e7!");
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("CPgnzUWso6jwQDgC", "CPgnzUWso6jwQDgC", false, "CPgnzUWso6jwQDgC");
      List<String> list0 = options1.getMatchingOptions("");
      assertTrue(list0.contains("CPgnzUWso6jwQDgC"));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("", "", false, "CP");
      List<String> list0 = options0.getMatchingOptions("f");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("gnzUWso", "gnzUWso", true, "gnzUWso");
      List<String> list0 = options1.getMatchingOptions("gnzUWso");
      assertTrue(list0.contains("gnzUWso"));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setRequired(true);
      Options options1 = options0.addOptionGroup(optionGroup0);
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Options options0 = new Options();
      Collection<OptionGroup> collection0 = options0.getOptionGroups();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      Options options0 = new Options();
      String string0 = options0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Options options0 = new Options();
      List list0 = options0.getRequiredOptions();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Options options0 = new Options();
      Collection<Option> collection0 = options0.getOptions();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("", "");
      boolean boolean0 = options0.hasShortOption("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", "", false, "CP");
      Option option0 = options1.getOption("");
      options1.addOption(option0);
      assertTrue(option0.isRequired());
      assertEquals("CP", option0.getDescription());
      assertEquals("", option0.getLongOpt());
      assertEquals((-1), option0.getArgs());
      assertEquals("", option0.getOpt());
      assertFalse(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", false, "]");
      assertSame(options0, options1);
  }
}
