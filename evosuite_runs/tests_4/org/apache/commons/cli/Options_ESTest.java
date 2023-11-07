/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 23:56:39 GMT 2023
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
      Options options1 = options0.addOption("?", "*#J$");
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("Q5JrupZSRFF", false, "a<?%TIjF;2V0,_&k6");
      assertSame(options0, options1);
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
      options0.addRequiredOption((String) null, (String) null, false, (String) null);
      List<Option> list0 = options0.helpOptions();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("2", false, (String) null);
      OptionGroup optionGroup0 = options0.getOptionGroup(option0);
      assertNull(optionGroup0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, true, (String) null);
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      optionGroup0.setRequired(true);
      options0.getOptionGroup(option0);
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, true, (String) null);
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      options0.getOptionGroup(option0);
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption((String) null, (String) null, false, (String) null);
      Option option0 = options1.getOption((String) null);
      assertNotNull(option0);
      assertTrue(option0.isRequired());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, true, (String) null);
      option0.setValueSeparator('y');
      options0.addOption(option0);
      Option option1 = options0.getOption((String) null);
      assertFalse(option1.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, true, (String) null);
      options0.addOption(option0);
      option0.setOptionalArg(true);
      Option option1 = options0.getOption((String) null);
      assertTrue(option1.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("?", "?", false, "?");
      Options options1 = options0.addOption(option0);
      option0.setArgName("?");
      Option option1 = options1.getOption("?");
      assertEquals("?", option1.getDescription());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addRequiredOption("RL:[acykA+PpSs7m", "RL:[acykA+PpSs7m", true, "RL:[acykA+PpSs7m");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'RL:[acykA+PpSs7m' contains an illegal character : ':'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("*#J$", "?", false, "*#J$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '*#J$' contains an illegal character : '*'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("?A/3?+|3OX&", "?A/3?+|3OX&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '?A/3?+|3OX&' contains an illegal character : '?'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("Cq", "Cq");
      option0.setRequired(true);
      Options options1 = options0.addOption(option0);
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption((String) null, (String) null);
      boolean boolean0 = options1.hasShortOption((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasShortOption("TcBN@M <~Qd");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("j", "=", false, "j");
      boolean boolean0 = options0.hasOption("=");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasOption("[ Options: [ short java.util.LinkedHashMap@0000000003 ] [ long {} ]");
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
      boolean boolean0 = options0.hasLongOption("^@t,'{1");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = options0.getOption("@gD;HbHX)6mS_TS");
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", "=", false, "");
      List<String> list0 = options1.getMatchingOptions("");
      assertFalse(list0.contains(""));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("2", "=", false, "2");
      List<String> list0 = options0.getMatchingOptions("2");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption((String) null, "[ Options: [ short ", true, "[ Options: [ short ");
      // Undeclared exception!
      try { 
        options1.getMatchingOptions((String) null);
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
      Options options1 = options0.addOption("2", "2", false, "2");
      List<String> list0 = options1.getMatchingOptions("2");
      assertTrue(list0.contains("2"));
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
      Options options1 = options0.addOption((String) null, (String) null);
      boolean boolean0 = options1.hasOption((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("NO_qAGS_ALLOWED", "org.apache.commons.cli.Util", false, "o;G]Gp7.{1wmczX");
      Option option0 = new Option("NO_qAGS_ALLOWED", false, "NO_qAGS_ALLOWED");
      option0.setRequired(true);
      Options options1 = options0.addOption(option0);
      assertSame(options0, options1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("^q~", false, "^q~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '^q~' contains an illegal character : '^'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }
}