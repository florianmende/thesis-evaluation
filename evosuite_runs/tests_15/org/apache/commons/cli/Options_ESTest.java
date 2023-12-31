/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 00:43:07 GMT 2023
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
      Options options1 = options0.addOption("M", "GzshA");
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
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", false, "org.apache.commons.cli.Options");
      optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup0);
      List<Option> list0 = options0.helpOptions();
      assertTrue(list0.contains(option0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("Z7", "Z7");
      OptionGroup optionGroup0 = options0.getOptionGroup(option0);
      assertNull(optionGroup0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "org.apache.commons.cli.Options", false, "");
      optionGroup0.setRequired(true);
      optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup0);
      OptionGroup optionGroup1 = options1.getOptionGroup(option0);
      assertNotNull(optionGroup1);
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "org.apache.commons.cli.Options", false, "");
      optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup0);
      OptionGroup optionGroup1 = options1.getOptionGroup(option0);
      assertFalse(option0.isRequired());
      assertNotNull(optionGroup1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", "");
      option0.setArgName("Na7W$bp32Y|<{cE(=9G");
      options0.addOption(option0);
      Option option1 = options0.getOption("");
      assertEquals((-2), Option.UNLIMITED_VALUES);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("M", "v_H35:#\"p1zu8^<?", true, ":zIp$,Kq?M");
      Option option0 = options0.getOption("M");
      assertEquals(1, option0.getArgs());
      assertEquals("v_H35:#\"p1zu8^<?", option0.getLongOpt());
      assertNotNull(option0);
      assertEquals(":zIp$,Kq?M", option0.getDescription());
      assertTrue(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption((String) null, false, "}a?z 7W|p");
      assertSame(options0, options1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("C", "C", true, "C");
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
  public void test10()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addRequiredOption("AN=rR7EXOL1r6k*4sM-", "AN=rR7EXOL1r6k*4sM-", false, "AN=rR7EXOL1r6k*4sM-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'AN=rR7EXOL1r6k*4sM-' contains an illegal character : '='
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
        options0.addOption("-t3#7a'27", "-t3#7a'27", true, "-t3#7a'27");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '-t3#7a'27' contains an illegal character : '-'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("org.apache.commons.cli.Options", "org.apache.commons.cli.Options");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'org.apache.commons.cli.Options' contains an illegal character : '.'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("C", "C");
      option0.setRequired(true);
      Options options1 = options0.addOption(option0);
      assertSame(options0, options1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", "Ea6NCbE_Xz8iSe ~:V", false, (String) null);
      Options options1 = options0.addOption(option0);
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("", "");
      boolean boolean0 = options0.hasShortOption("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasShortOption("5eP7Mv>M#)M");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("M", "M");
      boolean boolean0 = options0.hasOption("M");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasOption(" ]C");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("C", "C", false, "C");
      boolean boolean0 = options1.hasLongOption("C");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasLongOption("5eP7Mv>M#)M");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = options0.getOption(" K_>Qn%2q.uR'RQl,4?H:GER9");
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("NO_ARGS_ALLOWED", "-", false, "NO_ARGS_ALLOWED");
      List<String> list0 = options1.getMatchingOptions("-");
      assertTrue(list0.contains("-"));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("C", "C", true, "C");
      List<String> list0 = options1.getMatchingOptions(";A:(4;Sdr;==6ymBP");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("C", "C", true, "C");
      List<String> list0 = options1.getMatchingOptions("C");
      assertTrue(list0.contains("C"));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("C", "C");
      option0.setRequired(true);
      Options options1 = options0.addRequiredOption("C", "%2q.uR'RQl,4?H:GER9", false, " K_>Qn%2q.uR'RQl,4?H:GER9");
      Options options2 = options1.addOption(option0);
      assertSame(options1, options2);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Options options0 = new Options();
      Collection<OptionGroup> collection0 = options0.getOptionGroups();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      Options options0 = new Options();
      String string0 = options0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Options options0 = new Options();
      List list0 = options0.getRequiredOptions();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Options options0 = new Options();
      Collection<Option> collection0 = options0.getOptions();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("C", "Brm<uT (U;QEJog", false, "C");
      boolean boolean0 = options1.hasOption("Brm<uT (U;QEJog");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("O H]BP", false, "O H]BP");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'O H]BP' contains an illegal character : ' '
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }
}
