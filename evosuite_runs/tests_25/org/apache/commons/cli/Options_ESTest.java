/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 00:41:21 GMT 2023
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
        options0.addOption("Lu_Di_'r!R'T", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'Lu_Di_'r!R'T' contains an illegal character : '''
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
      Options options1 = options0.addOption("PDU2IDaRur", true, "+E7");
      List<Option> list0 = options1.helpOptions();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("Urk", "[ Options: [ short ", false, "");
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup0);
      options0.getOptionGroup(option0);
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("6", "org.apache.commons.cli.Options", true, "6");
      Option option0 = options0.getOption("org.apache.commons.cli.Options");
      assertEquals("6", option0.getDescription());
      assertTrue(option0.isRequired());
      assertEquals(1, option0.getArgs());
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, (String) null, false, (String) null);
      option0.setOptionalArg(true);
      options0.addOption(option0);
      Option option1 = options0.getOption((String) null);
      assertNull(option1.getValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, "", false, "V44w}}tBYwBJu?iNE");
      option0.setArgs(2833);
      options0.addOption(option0);
      Option option1 = options0.getOption("");
      assertFalse(option1.isRequired());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption((String) null, "3h;_", true, (String) null);
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
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addRequiredOption(" /ES4\"'kM", "t4 \"mbS0ru=jSEaC}", false, "^n:ielk)35]8+*");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option ' /ES4\"'kM' contains an illegal character : ' '
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
        options0.addOption("__!d^/", false, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '__!d^/' contains an illegal character : '!'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("s?.lYqWG{,1N'", "HyF&6}", true, "o;SM1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 's?.lYqWG{,1N'' contains an illegal character : '?'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("YlwBFlIRlYK", true, "3h;_");
      boolean boolean0 = options1.hasShortOption("YlwBFlIRlYK");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasShortOption((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("6", "3h;_", false, "6");
      boolean boolean0 = options0.hasOption("3h;_");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasOption("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("Q", "Q", true, "Q");
      boolean boolean0 = options0.hasLongOption("Q");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasLongOption("PDU2IDaRur");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = options0.getOption("Y(znXCKkRh&h!WN/");
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("6", "6", true, "6");
      List<String> list0 = options1.getMatchingOptions("");
      assertTrue(list0.contains("6"));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("6", "6", false, "6");
      List<String> list0 = options1.getMatchingOptions("6");
      assertTrue(list0.contains("6"));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Options options0 = new Options();
      List<String> list0 = options0.getMatchingOptions("6");
      assertFalse(list0.contains("6"));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, (String) null, true, "\"vsjm");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup1);
      optionGroup1.setRequired(true);
      options1.getOptionGroup(option0);
      assertFalse(option0.isRequired());
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
      Option option0 = new Option("6", "6");
      option0.setRequired(true);
      Options options1 = options0.addOption(option0);
      Options options2 = options1.addOption(option0);
      assertSame(options1, options2);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Options options0 = new Options();
      Collection<OptionGroup> collection0 = options0.getOptionGroups();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, (String) null, true, "\"vsjm");
      OptionGroup optionGroup0 = options0.getOptionGroup(option0);
      assertNull(optionGroup0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Options options0 = new Options();
      String string0 = options0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Options options0 = new Options();
      List list0 = options0.getRequiredOptions();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Options options0 = new Options();
      Collection<Option> collection0 = options0.getOptions();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", "");
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("3", "6", false, "6");
      List<String> list0 = options1.getMatchingOptions("3");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("PDU2IDaRur", true, "+E7");
      boolean boolean0 = options1.hasOption("PDU2IDaRur");
      assertTrue(boolean0);
  }
}
