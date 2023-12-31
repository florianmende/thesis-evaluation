/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 00:58:38 GMT 2023
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
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-Y";
      defaultParser0.parse(options0, stringArray0, true);
      defaultParser0.checkRequiredOptions();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Options options0 = new Options();
      DefaultParser defaultParser0 = new DefaultParser();
      Properties properties0 = new Properties();
      CommandLine commandLine0 = defaultParser0.parse(options0, (String[]) null, properties0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("a", "a", true, "a");
      Options options2 = options1.addOption("a", "-sVJ*Z(m", true, "-sVJ*Z(m");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "--=";
      try { 
        defaultParser0.parse(options2, stringArray0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Ambiguous option: '--'  (could be: 'a', '-sVJ*Z(m')
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[10];
      Properties properties0 = new Properties();
      // Undeclared exception!
      try { 
        defaultParser0.parse((Options) null, stringArray0, properties0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      Properties properties0 = new Properties();
      properties0.put(options0, options0);
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, (String[]) null, properties0, false);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.apache.commons.cli.Options cannot be cast to class java.lang.String (org.apache.commons.cli.Options is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @1d19ef0e; java.lang.String is in module java.base of loader 'bootstrap')
         //
         verifyException("java.util.Properties", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("a", "a", true, "a");
      Options options1 = options0.addRequiredOption("a", "--,", true, "--,");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "--=";
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options1, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Ambiguous option: '--'  (could be: 'a', '--,')
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[10];
      Properties properties0 = new Properties();
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[0];
      Options options0 = new Options();
      Properties properties0 = new Properties();
      properties0.put(defaultParser0, options0);
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.apache.commons.cli.DefaultParser cannot be cast to class java.lang.String (org.apache.commons.cli.DefaultParser is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @1d19ef0e; java.lang.String is in module java.base of loader 'bootstrap')
         //
         verifyException("java.util.Properties", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("a", "a", true, "a");
      options0.addRequiredOption("a", "--,", true, "--,");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "--=";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Ambiguous option: '--'  (could be: 'a', '--,')
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      defaultParser0.parse(options0, stringArray0);
      try { 
        defaultParser0.handleConcatenatedOptions("-a");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -a
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      // Undeclared exception!
      try { 
        defaultParser0.handleConcatenatedOptions("-Hvi+");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
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
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, (String) null, false, "y^#%h10S_Q*");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      Properties properties0 = new Properties();
      CommandLine commandLine0 = defaultParser0.parse(options0, (String[]) null, properties0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Options options0 = new Options();
      DefaultParser defaultParser0 = new DefaultParser();
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setRequired(true);
      Option option0 = new Option("a", "--@?Xqh7Q}&Ksg$M");
      optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-a";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Options options0 = new Options();
      DefaultParser defaultParser0 = new DefaultParser();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("a", "--@?Xqh7Q}&Ksg$M");
      optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-a";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("B", "B", true, "B");
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      Boolean boolean0 = Boolean.valueOf(true);
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setStripLeadingAndTrailingQuotes(boolean0);
      DefaultParser defaultParser0 = defaultParser_Builder1.build();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "%Knl?2o&7";
      stringArray0[1] = "--B";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("B", "B", true, "B");
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      Boolean boolean0 = Boolean.valueOf("%Knl?2o&7");
      defaultParser_Builder0.setStripLeadingAndTrailingQuotes(boolean0);
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "%Knl?2o&7";
      stringArray0[1] = "--B";
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
      options0.addOption("a", "a", true, "a");
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      Boolean boolean0 = Boolean.valueOf(true);
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setStripLeadingAndTrailingQuotes(boolean0);
      DefaultParser defaultParser0 = defaultParser_Builder1.build();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "--=";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("B", "B", true, "B");
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      Boolean boolean0 = Boolean.FALSE;
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setStripLeadingAndTrailingQuotes(boolean0);
      DefaultParser defaultParser0 = defaultParser_Builder1.build();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "B";
      stringArray0[1] = "--=";
      CommandLine commandLine0 = defaultParser0.parse(options1, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("a", true, "a");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-a";
      stringArray0[1] = "-=";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("a", true, "a");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-a";
      stringArray0[1] = "--=";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Options options0 = new Options();
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-=7@fKtcU1";
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -=7@fKtcU1
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("a", "ymEiu*D&/I+NybGxH\"s", true, "-");
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "a";
      stringArray0[1] = "ymEiu*D&/I+NybGxH\"s";
      stringArray0[2] = "-a";
      stringArray0[3] = "-";
      stringArray0[4] = "-";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "--";
      Properties properties0 = new Properties();
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0, false);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-z=";
      DefaultParser defaultParser0 = new DefaultParser();
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-$xz=";
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -$xz=
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-1";
      Object object0 = new Object();
      properties0.put(".(5([b8(CdcK*D", object0);
      try { 
        defaultParser0.parse(options0, stringArray0, properties0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Default option wasn't defined
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("a", "a", true, "a");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "a";
      stringArray0[1] = "-a";
      stringArray0[2] = "--=";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing argument for option: a
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("a", "a", true, "a");
      options1.addOption("a", "-sVJ*Z(m", true, "-sVJ*Z(m");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "a";
      stringArray0[1] = "--=";
      try { 
        defaultParser0.parse(options0, stringArray0, (Properties) null, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Ambiguous option: '--'  (could be: 'a', '-sVJ*Z(m')
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("a", true, "--t~;qF~82]}!woV1{");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-a";
      stringArray0[1] = "--t~;qF~82]}!woV1{";
      stringArray0[2] = "--=";
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --=
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Options options0 = new Options();
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "%Knl?2o&7";
      stringArray0[1] = "--B";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --B
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("a", "W<=3GzFq7RB,", true, "a");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "W<=3GzFq7RB,";
      defaultParser0.parse(options1, stringArray0, true);
      defaultParser0.handleConcatenatedOptions("-a");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", "", false, "");
      DefaultParser defaultParser0 = new DefaultParser(false);
      String[] stringArray0 = new String[0];
      defaultParser0.parse(options1, stringArray0, true);
      defaultParser0.handleConcatenatedOptions("--,");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("a", "W<=3GzFq7RB,", true, "a");
      DefaultParser defaultParser0 = new DefaultParser(true);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-a";
      stringArray0[1] = "a";
      stringArray0[2] = "org.apache.commons.cli.OptionGroup";
      stringArray0[3] = "a";
      stringArray0[4] = "W<=3GzFq7RB,";
      stringArray0[5] = "-.(5(Kb8(CdcK*D";
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -.(5(Kb8(CdcK*D
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("", "", true, "");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "--=";
      defaultParser0.parse(options0, stringArray0);
      defaultParser0.handleConcatenatedOptions("--=");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", "", false, "");
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setAllowPartialMatching(false);
      DefaultParser defaultParser0 = defaultParser_Builder1.build();
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "=";
      stringArray0[2] = "--=";
      try { 
        defaultParser0.parse(options1, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --=
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-}GJEZe1@";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Options options0 = new Options();
      DefaultParser defaultParser0 = new DefaultParser();
      options0.addRequiredOption((String) null, (String) null, false, (String) null);
      String[] stringArray0 = new String[0];
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing required option: null
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("a", "W<=3GzFq7RB,", true, "a");
      DefaultParser defaultParser0 = new DefaultParser(true);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-a";
      stringArray0[1] = "-a";
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options1, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing argument for option: a
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Object object0 = new Object();
      OptionGroup optionGroup0 = new OptionGroup();
      List<Object> list0 = List.of((Object) defaultParser0, (Object) defaultParser0, object0, (Object) defaultParser0, object0, (Object) optionGroup0, (Object) defaultParser0);
      defaultParser0.expectedOpts = list0;
      try { 
        defaultParser0.checkRequiredOptions();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing required options: org.apache.commons.cli.DefaultParser@1, org.apache.commons.cli.DefaultParser@1, java.lang.Object@18c436ec, org.apache.commons.cli.DefaultParser@1, java.lang.Object@18c436ec, [], org.apache.commons.cli.DefaultParser@1
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      defaultParser0.handleConcatenatedOptions("");
  }
}
