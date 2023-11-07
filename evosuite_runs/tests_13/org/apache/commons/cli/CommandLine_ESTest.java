/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 00:02:12 GMT 2023
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
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, (String) null);
      commandLine0.addOption(option0);
      String string0 = commandLine0.getOptionValue("-x%\u0000M8|e*", "}1ufeLN6=");
      assertEquals("}1ufeLN6=", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("Z", true, "Z");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option1 = new Option("Z", "Z");
      String string0 = commandLine0.getOptionValue(option1);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("PBUB", true, "PBUB");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option1 = new Option("PBUB", "g");
      Properties properties0 = commandLine0.getOptionProperties(option1);
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("i", "i", true, "i");
      Class<Option> class0 = Option.class;
      option0.setType(class0);
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing(" ");
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getOptionObject("i");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("i", true, "i");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      boolean boolean0 = commandLine0.hasOption('i');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("i", "i", true, "i");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("");
      CommandLine commandLine0 = commandLine_Builder1.build();
      Object object0 = commandLine0.getParsedOptionValue("i");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Option option0 = new Option("i", "i", true, "i");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("i");
      CommandLine commandLine0 = commandLine_Builder1.build();
      Object object0 = commandLine0.getParsedOptionValue('i');
      assertEquals("i", object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("", "g8e*fal+?qhK]>", true, "");
      commandLine_Builder0.addOption(option0);
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(1, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Option option0 = new Option("i", "i", true, "i");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("i");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getOptionValues("i");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Option option0 = new Option("i", "i", true, "i");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("i");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getOptionValues('i');
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue((Option) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", false, "dCDx`A");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue(option0, "dCDx`A");
      assertEquals("dCDx`A", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", true, "");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("}k@M#qqH");
      CommandLine commandLine0 = commandLine_Builder1.build();
      String string0 = commandLine0.getOptionValue(option0);
      assertEquals("}k@M#qqH", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue("7-hinfY", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("i", "i", true, "");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("UG$%Bv:AYTaBFJn");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue("i");
      assertEquals("UG$%Bv:AYTaBFJn", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Option option0 = new Option("", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("");
      CommandLine commandLine0 = commandLine_Builder1.build();
      String string0 = commandLine0.getOptionValue("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue('j', (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('s', "");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Option option0 = new Option("", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("00$:1QAR;z_oAC");
      CommandLine commandLine0 = commandLine_Builder1.build();
      String string0 = commandLine0.getOptionValue('-');
      assertEquals("00$:1QAR;z_oAC", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("i", "i", true, "i");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing(" ");
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getOptionObject("i");
      assertEquals(" ", object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("L", true, "L");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("L");
      CommandLine commandLine0 = commandLine_Builder1.build();
      Object object0 = commandLine0.getOptionObject('L');
      assertEquals("L", object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addArg("i");
      CommandLine commandLine0 = commandLine_Builder1.build();
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addArg("");
      List<String> list0 = commandLine0.getArgList();
      assertTrue(list0.contains(""));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Option option0 = new Option("i", "i", true, "i");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("h");
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      try { 
        commandLine0.getParsedOptionValue(option0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to find the class: h
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Option option0 = new Option("i", true, "i");
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("i");
      CommandLine commandLine0 = commandLine_Builder0.build();
      try { 
        commandLine0.getParsedOptionValue("i");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to find the class: i
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
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
  public void test26()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
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
  public void test27()  throws Throwable  {
      Option option0 = new Option("i", "i");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      boolean boolean0 = commandLine0.hasOption(option0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, true, "--");
      boolean boolean0 = commandLine0.hasOption(option0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue((Option) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", true, "");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getOptionValues(option0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("PBUB", "", false, "org.apache.commons.cli.PatternOptionBuilder");
      commandLine_Builder0.addOption(option0);
      Option option1 = new Option("PBUB", true, "PBUB");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getOptionValues(option1);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", true, "");
      String string0 = commandLine0.getOptionValue(option0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("PBUB", true, "PBUB");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue(option0, "$<");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("i", true, "i");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue(option0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue((Option) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue("i");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("PBUB", "", false, "org.apache.commons.cli.PatternOptionBuilder");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Object object0 = commandLine0.getOptionObject("");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      boolean boolean0 = commandLine0.hasOption((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Option option0 = new Option("i", "i", true, "i");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      boolean boolean0 = commandLine0.hasOption("i");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Option option0 = new Option("i", "i", true, "i");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      String[] stringArray0 = commandLine0.getOptionValues("h");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Option option0 = new Option("", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("");
      CommandLine commandLine0 = commandLine_Builder1.build();
      String string0 = commandLine0.getOptionValue("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Option option0 = new Option("i", "i", true, "i");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("h");
      CommandLine commandLine0 = commandLine_Builder1.build();
      Object object0 = commandLine0.getParsedOptionValue(option0);
      assertEquals("h", object0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Option option0 = new Option("i", "i", true, "i");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue(option0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Option option0 = new Option("i", "i", true, "i");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("h");
      CommandLine commandLine0 = commandLine_Builder1.build();
      Properties properties0 = commandLine0.getOptionProperties("i");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", ")8(_4Lw&lTq}2QC", true, ")8(_4Lw&lTq}2QC");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Properties properties0 = commandLine0.getOptionProperties(")8(_4Lw&lTq}2QC");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("PBUB", "", false, "org.apache.commons.cli.PatternOptionBuilder");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Properties properties0 = commandLine0.getOptionProperties("W");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("PBUB", "u", false, "org.apache.commons.cli.PatternOptionBuilder");
      Option option1 = new Option("PBUB", true, "PBUB");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option1);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Properties properties0 = commandLine0.getOptionProperties(option0);
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption((Option) null);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addArg((String) null);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getOptionObject('L');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getOptionValues('@');
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(0, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('a', "m b4oKvr/XIIj}@_U??");
      assertEquals("m b4oKvr/XIIj}@_U??", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      List<String> list0 = commandLine0.getArgList();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Iterator<Option> iterator0 = commandLine0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      boolean boolean0 = commandLine0.hasOption('c');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue('i');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue('n');
      assertNull(string0);
  }
}
