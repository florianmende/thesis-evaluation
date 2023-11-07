/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 02:49:29 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.Properties;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DefaultParser_ESTest extends DefaultParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      defaultParser0.parse(options0, stringArray0, true);
      defaultParser0.handleConcatenatedOptions("----@");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      Properties properties0 = new Properties();
      defaultParser0.parse(options0, stringArray0, properties0);
      defaultParser0.checkRequiredOptions();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[10];
      stringArray0[0] = "----@";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "--=dI|e/vN\"gU>x?5";
      Options options0 = new Options();
      Options options1 = options0.addOption("P1I", "P1I", false, "P1I");
      options0.addOption("P1I", "--=dI|e/vN\"gU>x?5", false, "--=dI|e/vN\"gU>x?5");
      try { 
        defaultParser0.parse(options1, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Ambiguous option: '--'  (could be: 'P1I', '--=dI|e/vN\"gU>x?5')
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "--=dI=|e/vCnNgU>x?5";
      Options options0 = new Options();
      Options options1 = options0.addOption("P1I", "P1I", false, "P1I");
      Options options2 = options1.addOption("P1I", "--=dI=|e/vCnNgU>x?5", false, "--=dI=|e/vCnNgU>x?5");
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options2, stringArray0, properties0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Ambiguous option: '--'  (could be: 'P1I', '--=dI=|e/vCnNgU>x?5')
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "----@";
      try { 
        defaultParser0.parse(options0, stringArray0, properties0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: ----@
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      Properties properties0 = new Properties();
      properties0.put(options0, options0);
      DefaultParser defaultParser0 = new DefaultParser();
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, (String[]) null, properties0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.apache.commons.cli.Options cannot be cast to class java.lang.String (org.apache.commons.cli.Options is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @203b0c87; java.lang.String is in module java.base of loader 'bootstrap')
         //
         verifyException("java.util.Properties", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "--=dI=|e/vCnNgU>x?5";
      Options options0 = new Options();
      Options options1 = options0.addOption("P1I", "P1I", true, "P1I");
      Options options2 = options1.addOption("P1I", "--=dI=|e/vCnNgU>x?5", true, "--=dI=|e/vCnNgU>x?5");
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options2, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Ambiguous option: '--'  (could be: 'P1I', '--=dI=|e/vCnNgU>x?5')
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      Properties properties0 = new Properties();
      properties0.put(options0, options0);
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.apache.commons.cli.Options cannot be cast to class java.lang.String (org.apache.commons.cli.Options is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @203b0c87; java.lang.String is in module java.base of loader 'bootstrap')
         //
         verifyException("java.util.Properties", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      // Undeclared exception!
      try { 
        defaultParser0.handleConcatenatedOptions("1<jGKqlXOuFt;]X");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      List<Object> list0 = List.of((Object) defaultParser0, (Object) "--=dd_e/vN\"gU>x]5");
      defaultParser0.expectedOpts = list0;
      try { 
        defaultParser0.checkRequiredOptions();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing required options: org.apache.commons.cli.DefaultParser@1, --=dd_e/vN\"gU>x]5
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      // Undeclared exception!
      try { 
        defaultParser0.checkRequiredOptions();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "", false, "");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup1);
      Properties properties0 = new Properties();
      CommandLine commandLine0 = defaultParser0.parse(options1, (String[]) null, properties0, false);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "", true, "org.apache.commons.cli.DefaultParser$1");
      optionGroup0.setRequired(true);
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "--=dI=|e/vCnNgU>x?5";
      DefaultParser defaultParser0 = new DefaultParser();
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "", true, "org.apache.commons.cli.DefaultParser$1");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup1);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "--=dI=|e/vCnNgU>x?5";
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      Boolean boolean0 = Boolean.valueOf(true);
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setStripLeadingAndTrailingQuotes(boolean0);
      DefaultParser defaultParser0 = defaultParser_Builder1.build();
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "", true, "org.apache.commons.cli.DefaultParser$1");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup1);
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      Boolean boolean0 = Boolean.valueOf("-org.apache.commons.cli.ParseException");
      defaultParser_Builder0.setStripLeadingAndTrailingQuotes(boolean0);
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "--=dI=|e/vCnNgU>x?5";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Options options0 = new Options();
      String[] stringArray0 = new String[22];
      stringArray0[0] = "-";
      DefaultParser defaultParser0 = new DefaultParser();
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options options0 = new Options();
      String[] stringArray0 = new String[10];
      stringArray0[0] = "--";
      DefaultParser defaultParser0 = new DefaultParser();
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      Options options0 = new Options();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-)";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      Properties properties0 = new Properties();
      properties0.put("--", "--");
      DefaultParser defaultParser0 = new DefaultParser();
      try { 
        defaultParser0.parse(options0, (String[]) null, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Default option wasn't defined
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = new Options();
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-u=";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      Options options0 = new Options();
      options0.addRequiredOption("", "------", false, "%OFE");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "2'g}1viPGoxdz<a>)";
      stringArray0[1] = "";
      stringArray0[2] = ">EKzyk";
      stringArray0[3] = "%OFE";
      stringArray0[4] = "------";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "--=dI=|e/vCnNgU>x?5";
      Options options0 = new Options();
      options0.addOption("P1I", "P1I", false, "P1I");
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --=dI=|e/vCnNgU>x?5
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "--=dI=|e/vCnNgU>x?5";
      Properties properties0 = new Properties();
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", "yes", true, "--=dI=|e/vCnNgU>x?5");
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0, properties0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "--=dI=|e/vCnNgU>x?5";
      Options options0 = new Options();
      Options options1 = options0.addOption("P1I", "P1I", false, "P1I");
      options0.addOption("P1I", "--=dI=|e/vCnNgU>x?5", false, "--=dI=|e/vCnNgU>x?5");
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Ambiguous option: '--'  (could be: 'P1I', '--=dI=|e/vCnNgU>x?5')
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "2'g}1viPGoxdz<a>)";
      stringArray0[1] = "";
      stringArray0[2] = ">EKzyk";
      stringArray0[3] = "%OFE";
      stringArray0[4] = "------";
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: ------
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Options options0 = new Options();
      DefaultParser defaultParser0 = new DefaultParser();
      options0.addOption("", "");
      Properties properties0 = new Properties();
      defaultParser0.parse(options0, (String[]) null, properties0);
      try { 
        defaultParser0.handleConcatenatedOptions("--u=");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --u=
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Options options0 = new Options();
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-V)G^x,v{:H9&JyZyh";
      DefaultParser defaultParser0 = new DefaultParser(false);
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Options options0 = new Options();
      Properties properties0 = new Properties();
      Options options1 = options0.addRequiredOption((String) null, "", true, (String) null);
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "", true, "org.apache.commons.cli.DefaultParser$1");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options1.addOptionGroup(optionGroup1);
      DefaultParser defaultParser0 = new DefaultParser(false);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "--=dI=|e/vCnNgU>x?5";
      stringArray0[1] = "";
      stringArray0[2] = "--=dI=|e/vCnNgU>x?5";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "--=dI=|e/vCnNgU>x?5";
      stringArray0[6] = "";
      try { 
        defaultParser0.parse(options1, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing required option: 
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Options options0 = new Options();
      Properties properties0 = new Properties();
      Options options1 = options0.addRequiredOption((String) null, "", true, (String) null);
      DefaultParser defaultParser0 = new DefaultParser(false);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "--=dI=|e/vCnNgU>x?5";
      stringArray0[1] = "--=dI=|e/vCnNgU>x?5";
      stringArray0[2] = "--=dI=|e/vCnNgU>x?5";
      stringArray0[3] = "";
      stringArray0[4] = "--=dI=|e/vCnNgU>x?5";
      stringArray0[5] = "--=dI=|e/vCnNgU>x?5";
      stringArray0[6] = "";
      defaultParser0.parse(options1, stringArray0, properties0);
      defaultParser0.handleConcatenatedOptions("--=dI=|e/vCnNgU>x?5");
      defaultParser0.handleConcatenatedOptions("--=dI=|e/vCnNgU>x?5");
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Options options0 = new Options();
      Properties properties0 = new Properties();
      Options options1 = options0.addRequiredOption((String) null, "", true, (String) null);
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "--=dI=|e/vCnNgU>x?5";
      stringArray0[1] = "--=dI=|e/vCnNgU>x?5";
      stringArray0[2] = "--=dI=|e/vCnNgU>x?5";
      stringArray0[3] = "";
      stringArray0[4] = "--=dI=|e/vCnNgU>x?5";
      stringArray0[5] = "--=dI=|e/vCnNgU>x?5";
      stringArray0[6] = "";
      defaultParser0.parse(options1, stringArray0, properties0);
      defaultParser0.handleConcatenatedOptions("--");
      try { 
        defaultParser0.handleConcatenatedOptions("--=dI=|e/vCnNgU>x?5");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing argument for option: 
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setAllowPartialMatching(true);
      assertSame(defaultParser_Builder1, defaultParser_Builder0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[20];
      stringArray0[0] = "-=dI=|e/vCnNgU>x?5";
      Options options0 = new Options();
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -=dI=|e/vCnNgU>x?5
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      defaultParser0.handleConcatenatedOptions("");
  }
}
