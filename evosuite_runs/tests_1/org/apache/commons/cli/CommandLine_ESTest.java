/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 22:52:32 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CommandLine_ESTest extends CommandLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Option option0 = new Option("G", "G", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      boolean boolean0 = commandLine0.hasOption("--");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("DydQNfube", "DydQNfube");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option1 = new Option("DydQNfube", "DydQNfube");
      String string0 = commandLine0.getOptionValue(option1, "H3tQX!KU]");
      assertEquals("H3tQX!KU]", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("true", "true");
      commandLine0.addOption(option0);
      Option option1 = new Option("true", true, "P9y");
      Properties properties0 = commandLine0.getOptionProperties(option1);
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Option option0 = new Option("9", true, "9");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("9");
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Object object0 = commandLine0.getOptionObject("9");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", "");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      boolean boolean0 = commandLine0.hasOption('-');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Option option0 = new Option("G", "G", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("");
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue("G");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Option option0 = new Option("G", "G", true, "G");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("G");
      CommandLine commandLine0 = commandLine_Builder1.build();
      Object object0 = commandLine0.getParsedOptionValue('G');
      assertEquals("G", object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", false, "Ab4Q@.M?qf");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(1, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Option option0 = new Option("G", true, "G");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("G");
      CommandLine commandLine0 = commandLine_Builder1.build();
      String[] stringArray0 = commandLine0.getOptionValues("G");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Option option0 = new Option("G", "G", true, "G");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("G");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getOptionValues('G');
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option((String) null, (String) null);
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue(option0, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue(option0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Option option0 = new Option("G", "G", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("G");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue(option0);
      assertEquals("G", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue("org.apache.commons.cli.CommandLine$Builder", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("");
      CommandLine commandLine0 = commandLine_Builder1.build();
      String string0 = commandLine0.getOptionValue("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('^', " [ARG...]");
      assertNotNull(string0);
      assertEquals(" [ARG...]", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('m', "");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Option option0 = new Option("G", true, "G");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("G");
      CommandLine commandLine0 = commandLine_Builder1.build();
      String string0 = commandLine0.getOptionValue('G');
      assertEquals("G", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("");
      CommandLine commandLine0 = commandLine_Builder1.build();
      String string0 = commandLine0.getOptionValue('-');
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Option option0 = new Option("9", true, "9");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("9");
      CommandLine commandLine0 = commandLine_Builder1.build();
      Object object0 = commandLine0.getOptionObject("9");
      assertEquals("9", object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addArg("org.apache.commons.cli.CommandLine$Builder");
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addArg("org.apache.commons.cli.CommandLine$Builder");
      List<String> list0 = commandLine0.getArgList();
      assertTrue(list0.contains("org.apache.commons.cli.CommandLine$Builder"));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Option option0 = new Option("9", true, "9");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("9");
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      try { 
        commandLine0.getParsedOptionValue(option0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to find the class: 9
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Option option0 = new Option("", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing((String) null);
      CommandLine commandLine0 = commandLine_Builder1.build();
      // Undeclared exception!
      try { 
        commandLine0.getOptionProperties(option0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option((String) null, (String) null);
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      // Undeclared exception!
      try { 
        commandLine0.getOptionProperties((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", (String) null, false, "");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      boolean boolean0 = commandLine0.hasOption(option0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("8", "8");
      boolean boolean0 = commandLine0.hasOption(option0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Option option0 = new Option("9", true, "9");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("9");
      CommandLine commandLine0 = commandLine_Builder1.build();
      Object object0 = commandLine0.getParsedOptionValue(option0);
      assertEquals("9", object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("X", "X");
      Object object0 = commandLine0.getParsedOptionValue(option0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getParsedOptionValue((Option) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Option option0 = new Option("G", "G", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getOptionValues(option0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option((String) null, "", false, (String) null);
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      String[] stringArray0 = commandLine0.getOptionValues((Option) null);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue(option0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue((Option) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("X", "X");
      String string0 = commandLine0.getOptionValue(option0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getOptionValues(" to desired type: ");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue("org.apache.commons.cli.PatternOptionBuilder", "org.apache.commons.cli.PatternOptionBuilder");
      assertEquals("org.apache.commons.cli.PatternOptionBuilder", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue("G");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Option option0 = new Option("", "9_fAE3i@p2_Bxz@$6", true, "9_fAE3i@p2_Bxz@$6");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addOption(option0);
      String string0 = commandLine0.getOptionValue("9_fAE3i@p2_Bxz@$6");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.hasOption((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      boolean boolean0 = commandLine0.hasOption("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("");
      CommandLine commandLine0 = commandLine_Builder1.build();
      Object object0 = commandLine0.getOptionObject('-');
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Object object0 = commandLine0.getOptionObject('-');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Option option0 = new Option("G", "G", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getOptionValues('z');
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Option option0 = new Option("G", "G", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("G");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue(option0, "org.apache.commons.cli.ParseException");
      assertEquals("G", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Option option0 = new Option("G", "G", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("G");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue("G");
      assertEquals("G", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Option option0 = new Option("G", "G", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("G");
      CommandLine commandLine0 = commandLine_Builder0.build();
      Properties properties0 = commandLine0.getOptionProperties("G");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Option option0 = new Option("9", ".mEj<xTz^*pLAk", false, ".mEj<xTz^*pLAk");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Properties properties0 = commandLine0.getOptionProperties(".mEj<xTz^*pLAk");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Option option0 = new Option("G", "G", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Properties properties0 = commandLine0.getOptionProperties("Not yet implemented");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      commandLine0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties((Option) null);
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption((Option) null);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addArg((String) null);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addArg("");
      assertSame(commandLine_Builder0, commandLine_Builder1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue('-');
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(0, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('\"', (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      List<String> list0 = commandLine0.getArgList();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Iterator<Option> iterator0 = commandLine0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      boolean boolean0 = commandLine0.hasOption('%');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue('G');
      assertNull(object0);
  }
}
