/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 02:13:53 GMT 2023
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
      Options options1 = options0.addRequiredOption("wsDF", "':-Rgraj", false, "':-Rgraj");
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", "", false, (String) null);
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", (String) null);
      assertSame(options0, options1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      List<Option> list0 = options0.helpOptions();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("wsDF", "wsDF", true, "wsDF");
      List<Option> list0 = options1.helpOptions();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("E0o", "`)U/!>p<S");
      OptionGroup optionGroup0 = options0.getOptionGroup(option0);
      assertNull(optionGroup0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("V", "V", true, "V");
      Option option0 = options1.getOption("V");
      OptionGroup optionGroup0 = new OptionGroup();
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      assertTrue(option0.isRequired());
      
      optionGroup0.setRequired(true);
      options0.addOptionGroup(optionGroup1);
      options0.getOptionGroup(option0);
      assertFalse(option0.isRequired());
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", (String) null, true, "<{V/i?}9^H>:zH ");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      OptionGroup optionGroup2 = options0.getOptionGroup(option0);
      assertFalse(option0.isRequired());
      assertNotNull(optionGroup2);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", (String) null, true, "<{V/i?}9^H>:zH ");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      option0.setValueSeparator(',');
      Option option1 = options0.getOption("");
      assertFalse(option1.isRequired());
      assertNotNull(option1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("kN929", "");
      option0.setOptionalArg(true);
      Options options1 = options0.addOption(option0);
      Option option1 = options1.getOption("kN929");
      assertFalse(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("kN929", "");
      option0.setArgs((-2));
      Options options1 = options0.addOption(option0);
      Option option1 = options1.getOption("kN929");
      assertFalse(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("kN929", "");
      option0.setArgName("NO_ARGS_ALLOWED");
      Options options1 = options0.addOption(option0);
      Option option1 = options1.getOption("kN929");
      assertTrue(option1.hasArgName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("wsDF", "wsDF", true, "wsDF");
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
  public void test13()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addRequiredOption("oU&J|!wkZ^3 )D:*", "oU&J|!wkZ^3 )D:*", false, "oU&J|!wkZ^3 )D:*");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'oU&J|!wkZ^3 )D:*' contains an illegal character : '&'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("-", true, "-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '-'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("org.apache.commons.cli.OptionValidatorwsDF", "org.apache.commons.cli.OptionValidatorwsDF", true, "org.apache.commons.cli.OptionValidatorwsDF");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'org.apache.commons.cli.OptionValidatorwsDF' contains an illegal character : '.'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("3J@zdbK&", "3J@zdbK&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '3J@zdbK&' contains an illegal character : '@'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("bYeMHd", "2t%T\"!*RD$uEc:4'z");
      option0.setRequired(true);
      Options options1 = options0.addOption(option0);
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, ".5(;", true, (String) null);
      Options options1 = options0.addOption(option0);
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("wsDF", "wsDF", true, "wsDF");
      boolean boolean0 = options1.hasShortOption("wsDF");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasShortOption("3,u58nm%OPQDbP()}.a");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", "dhH$,P\"[wK}_f", false, (String) null);
      boolean boolean0 = options1.hasOption("dhH$,P\"[wK}_f");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasOption("UbYH2F^Q%f(f0XT#$\"");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("V", "{'*S#d@wsFwsF", false, "UbYH2F^Q%f(f0XT#$\"");
      boolean boolean0 = options1.hasLongOption("{'*S#d@wsFwsF");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasLongOption("{'*S#d@wsFwsF");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("wsDF", "wsDF", true, "wsDF");
      List<String> list0 = options1.getMatchingOptions("");
      assertTrue(list0.contains("wsDF"));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("V", "V", true, "V");
      List<String> list0 = options1.getMatchingOptions("z");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("V", "V", true, "V");
      List<String> list0 = options1.getMatchingOptions("V");
      assertTrue(list0.contains("V"));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("wsDF", "wsDF", true, "wsDF");
      Option option0 = new Option("wsDF", "wsDF");
      option0.setRequired(true);
      Options options2 = options1.addOption(option0);
      assertSame(options2, options1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Options options0 = new Options();
      Collection<OptionGroup> collection0 = options0.getOptionGroups();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = options0.getOption("V");
      // Undeclared exception!
      try { 
        options0.getOptionGroup(option0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Options options0 = new Options();
      String string0 = options0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Options options0 = new Options();
      List list0 = options0.getRequiredOptions();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Options options0 = new Options();
      Collection<Option> collection0 = options0.getOptions();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption((String) null, (String) null);
      boolean boolean0 = options1.hasOption((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", true, "??");
      assertSame(options0, options1);
  }
}