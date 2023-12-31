/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 23:17:58 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Option_ESTest extends Option_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.option("");
      Option.Builder option_Builder1 = option_Builder0.numberOfArgs((-4268));
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
      assertEquals((-4268), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.option("");
      Option.Builder option_Builder1 = option_Builder0.valueSeparator('a');
      option_Builder0.numberOfArgs(183);
      Option option0 = option_Builder1.build();
      option0.addValueForProcessing("ow@bH,aPrN0@GCTtx");
      assertTrue(option0.hasValueSeparator());
      assertEquals('a', option0.getValueSeparator());
      assertEquals(183, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.optionalArg(true);
      Option.Builder option_Builder1 = option_Builder0.numberOfArgs(0);
      option_Builder1.longOpt("org.apache.commons.cli.Option");
      Option option0 = option_Builder0.build();
      assertTrue(option0.hasOptionalArg());
      
      option0.addValueForProcessing("zQ1]}RB/SI_8uYP");
      assertEquals(0, option0.getArgs());
      assertFalse(option0.hasArg());
      assertFalse(option0.hasArgs());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.required(true);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Option option0 = new Option("", "", true, (String) null);
      option0.setRequired(true);
      boolean boolean0 = option0.isRequired();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.option("");
      option_Builder0.optionalArg(true);
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasOptionalArg();
      assertTrue(boolean0);
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.optionalArg(true);
      option_Builder0.longOpt("\"");
      Option option0 = option_Builder0.build();
      option0.addValueForProcessing("ow@bH,aPrN0@GCTtx");
      option0.getValuesList();
      assertTrue(option0.hasOptionalArg());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Option option0 = new Option((String) null, "\"5^\"T");
      option0.setValueSeparator('6');
      char char0 = option0.getValueSeparator();
      assertEquals('6', char0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setValueSeparator('f');
      char char0 = option0.getValueSeparator();
      assertEquals('f', char0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("j?(KoZ");
      Option option0 = option_Builder0.build();
      option0.getValue((String) null);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt(";R");
      Option option0 = option_Builder0.build();
      String string0 = option0.getValue(";R");
      assertNotNull(string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.addValueForProcessing("SF'");
      String string0 = option0.getValue(0);
      assertFalse(option0.hasLongOpt());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg();
      option_Builder1.longOpt("");
      Option option0 = option_Builder1.build();
      option0.addValueForProcessing("");
      String string0 = option0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Option option0 = new Option((String) null, "\"5^\"T");
      option0.getOpt();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Option option0 = new Option("", "", false, "");
      option0.getOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Option option0 = new Option("", "b s?m(mdg?,", true, "Xbo 7Vr?E}EeUT>DY");
      String string0 = option0.getLongOpt();
      assertEquals("b s?m(mdg?,", string0);
      assertEquals("Xbo 7Vr?E}EeUT>DY", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Option option0 = new Option("", "", true, "org.apache.commons.cli.Util");
      String string0 = option0.getLongOpt();
      assertEquals("org.apache.commons.cli.Util", option0.getDescription());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      option0.getKey();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt(";R");
      Option option0 = option_Builder0.build();
      option0.getKey();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Option option0 = new Option("", "", false, "");
      option0.getKey();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", (String) null);
      int int0 = option0.getId();
      assertEquals(78, int0);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Option option0 = new Option("", "", true, "org.apache.commons.cli.Util");
      String string0 = option0.getDescription();
      assertEquals("org.apache.commons.cli.Util", string0);
      assertEquals("", option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Option option0 = new Option("", "");
      String string0 = option0.getDescription();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Option option0 = new Option("", "", false, "");
      assertEquals((-1), option0.getArgs());
      
      option0.setArgs(0);
      int int0 = option0.getArgs();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      int int0 = option0.getArgs();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setArgName("-");
      option0.getArgName();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Option option0 = new Option("", "u");
      option0.setArgName("");
      option0.getArgName();
      assertEquals("u", option0.getDescription());
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      boolean boolean0 = option0.acceptsArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Option option0 = new Option("", "");
      // Undeclared exception!
      try { 
        option0.setType((Object) "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.addValueForProcessing("");
      try { 
        option0.getValue((-10));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        Option.builder("3FQN*I=M]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '3FQN*I=M]' contains an illegal character : '*'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      option0.setValueSeparator('(');
      // Undeclared exception!
      try { 
        option0.addValueForProcessing((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("-PC", true, "-PC");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '-PC' contains an illegal character : '-'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option(";", ";", true, ";");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name ';'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("cw&k", "cw&k");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'cw&k' contains an illegal character : '&'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.hasValueSeparator();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Option option0 = new Option("5p", "5p");
      option0.setValueSeparator('S');
      boolean boolean0 = option0.hasValueSeparator();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Option option0 = new Option("", false, "");
      boolean boolean0 = option0.hasArgs();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Option option0 = new Option("", "7*tz7");
      boolean boolean0 = option0.hasArg();
      assertFalse(boolean0);
      assertEquals("7*tz7", option0.getDescription());
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Option option0 = new Option("", "", true, "org.apache.commons.cli.Util");
      option0.hasArg();
      assertEquals("org.apache.commons.cli.Util", option0.getDescription());
      assertEquals("", option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.hasArgs();
      option_Builder0.longOpt("[!s");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArg();
      assertTrue(boolean0);
      assertTrue(option0.hasArgs());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.option("");
      Option option0 = option_Builder1.build();
      option0.hasOptionalArg();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.option("");
      Class<Object> class0 = Object.class;
      Option option0 = option_Builder1.build();
      option0.setType(class0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.setType((Object) null);
      String string0 = option0.toString();
      assertEquals("[ option:    [ARG] ::  ]", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.setArgs((-1075));
      option0.toString();
      assertFalse(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Option option0 = new Option("6", "6");
      assertFalse(option0.hasArg());
      
      option0.setArgs((-2));
      option0.toString();
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.hasArgs();
      Option option0 = option_Builder0.build();
      option0.addValueForProcessing("");
      boolean boolean0 = option0.requiresArg();
      assertTrue(option0.hasArgs());
      assertTrue(option0.hasArg());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.optionalArg(true);
      option_Builder0.longOpt("org.apache.commons.cli.Option");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.requiresArg();
      assertEquals(1, option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Option option0 = new Option("k1t", true, "k1t");
      option0.setValueSeparator('t');
      option0.addValueForProcessing("k1t");
      assertEquals('t', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt(";R");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasLongOpt();
      assertEquals((-1), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.option("");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasLongOpt();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.hasArgs();
      option_Builder0.longOpt("/");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgs();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      option0.setArgs(73);
      boolean boolean0 = option0.hasArgs();
      assertEquals(73, option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Option option0 = new Option("SRb", "SRb");
      option0.setArgName("SRb");
      boolean boolean0 = option0.hasArgName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      boolean boolean0 = option0.hasArgName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      String[] stringArray0 = option0.getValues();
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.addValueForProcessing("");
      String[] stringArray0 = option0.getValues();
      assertNotNull(stringArray0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg(true);
      option_Builder1.longOpt(";R");
      Option option0 = option_Builder0.build();
      option0.addValueForProcessing("");
      String string0 = option0.getValue(" [ARG]");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.getValue((-1));
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.hasArg();
      option_Builder0.longOpt("");
      Option option0 = option_Builder0.build();
      option0.addValueForProcessing("");
      String string0 = option0.getValue(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.option("");
      Option option0 = option_Builder0.build();
      option0.getValue();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Option option0 = new Option("", "");
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      Option option1 = (Option)option0.clone();
      boolean boolean0 = option1.equals(option0);
      assertTrue(boolean0);
      assertNotSame(option1, option0);
      assertEquals((-1), option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Option option0 = new Option("j5Mxv", "j5Mxv");
      Option option1 = new Option((String) null, (String) null);
      boolean boolean0 = option0.equals(option1);
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
      assertEquals((-1), option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Option option0 = new Option("D", "D");
      Option option1 = new Option("D", "D", true, "D");
      boolean boolean0 = option0.equals(option1);
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Option option0 = new Option("", "");
      boolean boolean0 = option0.equals(option0);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      Object object0 = new Object();
      boolean boolean0 = option0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Option option0 = new Option("SR6", "SR6");
      // Undeclared exception!
      try { 
        option0.addValueForProcessing("SR6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // NO_ARGS_ALLOWED
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      option0.addValueForProcessing((String) null);
      // Undeclared exception!
      try { 
        option0.addValueForProcessing((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value, list full.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      assertEquals(1, option0.getArgs());
      assertFalse(option0.hasValueSeparator());
      
      option0.addValueForProcessing((String) null);
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.optionalArg(false);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg(false);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      // Undeclared exception!
      try { 
        option_Builder0.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Either opt or longOpt must be specified
         //
         verifyException("org.apache.commons.cli.Option$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.setLongOpt((String) null);
      String string0 = option0.toString();
      assertEquals("[ option:   [ARG] ::  :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Option option0 = new Option("ZP", "ZP");
      String string0 = option0.getOpt();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.getType();
      assertEquals(1, option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Option option0 = new Option("", "");
      // Undeclared exception!
      try { 
        option0.addValue("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. 
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Option option0 = new Option("", true, "");
      String string0 = option0.getLongOpt();
      assertEquals(1, option0.getArgs());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Option option0 = new Option("SRb", "SRb");
      option0.hashCode();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.isRequired();
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("/");
      Option option0 = option_Builder0.build();
      option0.getDescription();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      int int0 = option0.getArgs();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.clearValues();
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setDescription((String) null);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Option option0 = new Option("", "u");
      option0.setArgName("");
      boolean boolean0 = option0.hasArgName();
      assertFalse(boolean0);
      assertEquals("", option0.getOpt());
      assertEquals((-1), option0.getArgs());
      assertEquals("u", option0.getDescription());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.option("");
      Option option0 = option_Builder0.build();
      option0.getValuesList();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.setArgs((-1075));
      boolean boolean0 = option0.acceptsArg();
      assertEquals((-1075), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.setOptionalArg(false);
      assertFalse(option0.hasOptionalArg());
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.getArgName();
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.setType((Object) null);
      option0.getType();
      assertEquals(1, option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Class<Option> class0 = Option.class;
      Option.Builder option_Builder1 = option_Builder0.type(class0);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.hasArgs();
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.requiresArg();
      assertEquals((-2), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg();
      option_Builder1.longOpt("/");
      Option option0 = option_Builder1.build();
      assertTrue(option0.hasArg());
      
      option0.addValueForProcessing("/");
      String string0 = option0.getValue();
      assertNotNull(string0);
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.desc("");
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.required();
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.argName("r");
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("");
      Option option0 = option_Builder0.build();
      option0.getValueSeparator();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.valueSeparator();
      option_Builder0.hasArgs();
      option_Builder1.longOpt("");
      Option option0 = option_Builder0.build();
      option0.addValueForProcessing("=!3AD~idI-6M5D0");
      assertEquals("", option0.getValue());
      assertTrue(option0.hasArg());
  }
}
