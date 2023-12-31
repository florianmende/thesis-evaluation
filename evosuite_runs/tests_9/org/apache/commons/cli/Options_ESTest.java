/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:51:22 GMT 2023
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
        options0.addOption("[ Options: [ short java.util.LinkedHashMap@0000000002 ] [ long {} ]", true, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '[ Options: [ short java.util.LinkedHashMap@0000000002 ] [ long {} ]' contains an illegal character : '['
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
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
      Option option0 = new Option("b", "L=");
      Options options1 = options0.addOption(option0);
      List<Option> list0 = options1.helpOptions();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("", "`UJKSfji6^c0jD", false, "L!%Q.Zx>0u6r(5");
      Option option0 = options0.getOption("--");
      assertEquals("`UJKSfji6^c0jD", option0.getLongOpt());
      assertTrue(option0.isRequired());
      assertEquals((-1), option0.getArgs());
      assertEquals("L!%Q.Zx>0u6r(5", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, (String) null, false, "\"o[Lq");
      option0.setArgs(3574);
      options0.addOption(option0);
      Option option1 = options0.getOption((String) null);
      assertNull(option1.getValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, (String) null, false, "\"o[Lq");
      option0.setArgName("org.apache.commons.cli.OptionGroup");
      options0.addOption(option0);
      Option option1 = options0.getOption((String) null);
      assertEquals('\u0000', option1.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      Option option0 = options0.getOption("NO_ARGS_ALLOWED");
      assertFalse(option0.hasLongOpt());
      assertNotNull(option0);
      assertFalse(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption((String) null, false, (String) null);
      assertSame(options1, options0);
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
      options0.addRequiredOption((String) null, "RaIN(Zs#8__iCC4Ps!", true, "RaIN(Zs#8__iCC4Ps!");
      // Undeclared exception!
      try { 
        options0.getMatchingOptions((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addRequiredOption("K_7[q1qw14J$k_f{", "K_7[q1qw14J$k_f{", true, "K_7[q1qw14J$k_f{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'K_7[q1qw14J$k_f{' contains an illegal character : '['
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
        options0.addOption("0wMWBt?:.)h,F] H", "> t'`@jJ$m", false, "> t'`@jJ$m");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '0wMWBt?:.)h,F] H' contains an illegal character : '?'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("ks!!I7w{-AHY6AXyq", " ]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'ks!!I7w{-AHY6AXyq' contains an illegal character : '!'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", false, "> t'`@jJ$m");
      option0.setRequired(true);
      Options options1 = options0.addOption(option0);
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", "V9pBO7g", false, "V9pBO7g");
      Options options1 = options0.addOption(option0);
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", "");
      boolean boolean0 = options1.hasShortOption("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasShortOption((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("O06", "O06");
      boolean boolean0 = options1.hasOption("O06");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasOption("oE*&3Sz:.]Bv}AF");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("P", "P", true, "P");
      boolean boolean0 = options1.hasLongOption("P");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasLongOption("' was specified but an option from this group has already been selected: '");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = options0.getOption(" ]");
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("", "", true, "");
      List<String> list0 = options0.getMatchingOptions("1QN[AJ7i#?/");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("_", "_", true, "");
      List<String> list0 = options1.getMatchingOptions("");
      assertEquals(1, list0.size());
      assertFalse(list0.contains(""));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", "", false, "");
      List<String> list0 = options1.getMatchingOptions("");
      assertTrue(list0.contains(""));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, false, "[ Options: [ short ");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      options0.getOptionGroup(option0);
      assertFalse(option0.isRequired());
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
      Options options1 = options0.addRequiredOption((String) null, (String) null, true, (String) null);
      Option option0 = options0.getOption((String) null);
      assertNotNull(option0);
      
      options1.addOption(option0);
      assertTrue(option0.isRequired());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Options options0 = new Options();
      Collection<OptionGroup> collection0 = options0.getOptionGroups();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, false, "[ Options: [ short ");
      OptionGroup optionGroup0 = options0.getOptionGroup(option0);
      assertNull(optionGroup0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Options options0 = new Options();
      String string0 = options0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Options options0 = new Options();
      List list0 = options0.getRequiredOptions();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Options options0 = new Options();
      Collection<Option> collection0 = options0.getOptions();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("Ra", "_P9@", true, "org.apache.commons.cli.Options");
      boolean boolean0 = options0.hasOption("_P9@");
      assertTrue(boolean0);
  }
}
