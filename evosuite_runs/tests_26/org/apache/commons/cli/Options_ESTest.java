/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:04:30 GMT 2023
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
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", false, "");
      Options options1 = options0.addOption(option0);
      List<Option> list0 = options1.helpOptions();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("6F", "t1");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      optionGroup1.setRequired(true);
      Options options1 = options0.addOptionGroup(optionGroup1);
      OptionGroup optionGroup2 = options1.getOptionGroup(option0);
      assertFalse(option0.isRequired());
      assertNotNull(optionGroup2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, (String) null, false, (String) null);
      optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup0);
      OptionGroup optionGroup1 = options1.getOptionGroup(option0);
      assertNotNull(optionGroup1);
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption((String) null, (String) null, false, (String) null);
      Option option0 = options1.getOption((String) null);
      assertTrue(option0.isRequired());
      assertFalse(option0.hasArg());
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("B5F", true, "B5F");
      Options options1 = options0.addOption(option0);
      option0.setOptionalArg(true);
      Option option1 = options1.getOption("B5F");
      assertEquals(66, option1.getId());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("F", " ] [ long ", true, "[ Options: [ short java.util.LinkedHashMap@0000000003 ] [ long {} ]");
      Option option0 = options0.getOption(" ] [ long ");
      assertNotNull(option0);
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("B5F", true, "B5F");
      option0.setArgs(904);
      Options options1 = options0.addOption(option0);
      Option option1 = options1.getOption("B5F");
      assertTrue(option1.hasArg());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("6F", "t1");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      option0.setArgName("A0VK7a-(3_\"3p-w8&");
      Options options1 = options0.addOptionGroup(optionGroup1);
      Option option1 = options1.getOption("6F");
      assertFalse(option1.isRequired());
      assertNotNull(option1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("W_FRXO", false, "'");
      assertSame(options0, options1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("U", "U", false, (String) null);
      // Undeclared exception!
      try { 
        options0.getMatchingOptions((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addRequiredOption("::IQ", "::IQ", true, "::IQ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '::IQ' contains an illegal character : ':'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption(" ] [ long ", "5YX23>^E@Q!pvJ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option ' ] [ long ' contains an illegal character : ' '
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", "", false, "1O9:cr+[T1p3DcC ");
      Options options1 = options0.addOption(option0);
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("' contains an illegal character : '", "' contains an illegal character : '", true, "' contains an illegal character : '");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '' contains an illegal character : '' contains an illegal character : '''
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption((String) null, (String) null);
      boolean boolean0 = options1.hasShortOption((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasShortOption(" ] [ long ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", "");
      boolean boolean0 = options1.hasOption("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasOption("Theu option '");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("c", "c", true, "c");
      boolean boolean0 = options1.hasLongOption("c");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasLongOption(" ] [ long ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = options0.getOption("v@EYQ %,D~m)i");
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", "The option '", false, "");
      List<String> list0 = options1.getMatchingOptions("");
      assertFalse(list0.contains(""));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("", "", false, "");
      List<String> list0 = options0.getMatchingOptions("=(WS@0");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("6F", "6F", false, "6F");
      List<String> list0 = options1.getMatchingOptions("6F");
      assertTrue(list0.contains("6F"));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", " ] [ long ");
      option0.setRequired(true);
      Options options1 = options0.addOption(option0);
      Options options2 = options1.addOption(option0);
      assertSame(options2, options1);
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
      Option option0 = new Option("6F", "t1");
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
      options0.addRequiredOption("U", "Theu option '", true, "Theu option '");
      boolean boolean0 = options0.hasOption("Theu option '");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("}ED.[:nD9PI@kZ/fn", true, "}ED.[:nD9PI@kZ/fn");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '}ED.[:nD9PI@kZ/fn' contains an illegal character : '}'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }
}
