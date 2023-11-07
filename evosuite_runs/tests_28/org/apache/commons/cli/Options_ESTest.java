/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:49:39 GMT 2023
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
      // Undeclared exception!
      try { 
        options0.addOption("_]~(h:Hm", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '_]~(h:Hm' contains an illegal character : ']'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", true, " ]");
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Options options0 = new Options();
      List<Option> list0 = options0.helpOptions();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("", "", true, "(3h]C1i6i");
      List<Option> list0 = options0.helpOptions();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, true, (String) null);
      optionGroup0.setRequired(true);
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      OptionGroup optionGroup2 = options0.getOptionGroup(option0);
      assertNotNull(optionGroup2);
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      OptionGroup optionGroup2 = options0.getOptionGroup(option0);
      assertFalse(option0.isRequired());
      assertNotNull(optionGroup2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("1", false, "1");
      option0.setValueSeparator(' ');
      Options options1 = options0.addOption(option0);
      Option option1 = options1.getOption("1");
      assertEquals((-1), Option.UNINITIALIZED);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("1", false, "1");
      Options options1 = options0.addOption(option0);
      option0.setArgName("1");
      Option option1 = options1.getOption("1");
      assertEquals("1", option1.getOpt());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", "Either opt or longOpt must be specified", true, "f0(M}=|V?it");
      Option option0 = options1.getOption("");
      assertEquals("Either opt or longOpt must be specified", option0.getLongOpt());
      assertEquals(1, option0.getArgs());
      assertTrue(option0.isRequired());
      assertNotNull(option0);
      assertEquals("f0(M}=|V?it", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addRequiredOption("W+-d(=*", "W+-d(=*", true, "W+-d(=*");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'W+-d(=*' contains an illegal character : '+'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("&~ onX\"I3-Af^g9Xw", "&~ onX\"I3-Af^g9Xw", false, "&~ onX\"I3-Af^g9Xw");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '&~ onX\"I3-Af^g9Xw' contains an illegal character : '&'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", "", true, "");
      Options options1 = options0.addOption(option0);
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      boolean boolean0 = options1.hasShortOption("NO_ARGS_ALLOWED");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasShortOption("Fjv9^)ZP7*%");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("NO_ARGS_ALLOWED", "z9aKl%h`s%jZxa<", true, "NO_ARGS_ALLOWED");
      boolean boolean0 = options0.hasOption("z9aKl%h`s%jZxa<");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasOption("z9aKl%h`s%jZxa<");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("NO_ARpSz_ALLAWE6D", "NO_ARpSz_ALLAWE6D", false, "NO_ARpSz_ALLAWE6D");
      boolean boolean0 = options1.hasLongOption("NO_ARpSz_ALLAWE6D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasLongOption("Db{!vF%cNbJ6gA");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = options0.getOption("org.apache.commons.cli.ParseException");
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption((String) null, "--", false, (String) null);
      List<String> list0 = options1.getMatchingOptions("--");
      assertTrue(list0.contains("--"));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("R", "R", false, "R");
      List<String> list0 = options0.getMatchingOptions("^qKThe 8ption '");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", "", true, "");
      List<String> list0 = options1.getMatchingOptions("");
      assertTrue(list0.contains(""));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, (String) null);
      option0.setRequired(true);
      Options options1 = options0.addOption(option0);
      Options options2 = options1.addOption(option0);
      assertSame(options0, options2);
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
      Option option0 = new Option((String) null, true, (String) null);
      OptionGroup optionGroup0 = options0.getOptionGroup(option0);
      assertNull(optionGroup0);
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
      Options options1 = options0.addOption((String) null, (String) null);
      boolean boolean0 = options1.hasOption((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption((String) null, "AK", true, (String) null);
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
  public void test33()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption(" ]", false, " ]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option ' ]' contains an illegal character : ' '
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }
}
