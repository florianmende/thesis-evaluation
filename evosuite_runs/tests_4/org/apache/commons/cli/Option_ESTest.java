/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 00:04:25 GMT 2023
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
      Option option0 = new Option("xC", "xC", true, "`LtV1BEX9f#R<U!(");
      option0.setArgs(2);
      option0.setValueSeparator('V');
      option0.addValueForProcessing("`LtV1BEX9f#R<U!(");
      assertTrue(option0.hasArgs());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.option("x");
      option_Builder1.numberOfArgs((-186));
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.requiresArg();
      assertEquals((-186), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.numberOfArgs(0);
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.hasArg();
      assertFalse(boolean0);
      assertEquals(0, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("vr5N");
      Option.Builder option_Builder1 = option_Builder0.required(true);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.required();
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.isRequired();
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Option option0 = new Option("A", "A");
      option0.setOptionalArg(true);
      boolean boolean0 = option0.hasOptionalArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.addValueForProcessing("Jy");
      option0.getValuesList();
      assertFalse(option0.hasValueSeparator());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Option option0 = new Option("A", "", true, "3<4IJ\"le `K");
      option0.setValueSeparator('0');
      char char0 = option0.getValueSeparator();
      assertEquals('0', char0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.valueSeparator('O');
      Option option0 = option_Builder1.build();
      char char0 = option0.getValueSeparator();
      assertEquals('O', char0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Option option0 = new Option("", "", true, " ~P)2EG|");
      option0.getValue((String) null);
      assertEquals("", option0.getLongOpt());
      assertEquals(" ~P)2EG|", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      String string0 = option0.getValue("");
      assertNotNull(string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.addValueForProcessing("");
      String string0 = option0.getValue(0);
      assertFalse(option0.hasValueSeparator());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.addValueForProcessing("");
      String string0 = option0.getValue();
      assertFalse(option0.hasValueSeparator());
      assertFalse(option0.hasLongOpt());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "[ARG...]", false, "`LtV1BEX9f#R<U!(");
      option0.setType((Object) null);
      option0.getType();
      assertEquals("[ARG...]", option0.getLongOpt());
      assertEquals((-1), option0.getArgs());
      assertEquals("`LtV1BEX9f#R<U!(", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Option option0 = new Option((String) null, "Cannot add value, list full.");
      option0.getOpt();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      option0.getOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED", false, "NO_ARGS_ALLOWED");
      option0.getLongOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Option option0 = new Option("", "", true, " ~P)2EG|");
      String string0 = option0.getLongOpt();
      assertEquals(" ~P)2EG|", option0.getDescription());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Option option0 = new Option((String) null, true, (String) null);
      String string0 = option0.getKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Option option0 = new Option("B", "B");
      String string0 = option0.getKey();
      assertNotNull(string0);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      String string0 = option0.getKey();
      assertEquals((-1), option0.getArgs());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "[ARG...]", false, "`LtV1BEX9f#R<U!(");
      int int0 = option0.getId();
      assertEquals("`LtV1BEX9f#R<U!(", option0.getDescription());
      assertEquals((-1), option0.getArgs());
      assertEquals(78, int0);
      assertEquals("[ARG...]", option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getDescription();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Option option0 = new Option("", "");
      String string0 = option0.getDescription();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.numberOfArgs(0);
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      Option option0 = option_Builder1.build();
      int int0 = option0.getArgs();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Option option0 = new Option("", "", true, " ~P)2EG|");
      int int0 = option0.getArgs();
      assertEquals("", option0.getLongOpt());
      assertEquals(" ~P)2EG|", option0.getDescription());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.argName("smePXcNqR-mvL7");
      option_Builder1.longOpt("");
      Option option0 = option_Builder0.build();
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.argName("");
      Option option0 = option_Builder1.build();
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Option option0 = new Option("", "");
      boolean boolean0 = option0.acceptsArg();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Option option0 = new Option("v", "v");
      // Undeclared exception!
      try { 
        option0.setType((Object) "v");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Option option0 = new Option("NO_AZRGS_ALOD", "NO_AZRGS_ALOD", true, "NO_AZRGS_ALOD");
      option0.addValueForProcessing("NO_AZRGS_ALOD");
      try { 
        option0.getValue((-2));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        Option.builder("Cannot add value, list full.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'Cannot add value, list full.' contains an illegal character : ' '
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      option0.setValueSeparator('u');
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
  public void test33()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option(">'+.T-h/E1luA'ZHGgl", false, ">'+.T-h/E1luA'ZHGgl");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '>'+.T-h/E1luA'ZHGgl' contains an illegal character : '>'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("LJh?Ip-xr20/47", "LJh?Ip-xr20/47", true, "LJh?Ip-xr20/47");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'LJh?Ip-xr20/47' contains an illegal character : '?'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option(" ", " ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name ' '
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Option option0 = new Option("", "");
      boolean boolean0 = option0.hasValueSeparator();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Option option0 = new Option("A", "A");
      option0.setValueSeparator('O');
      boolean boolean0 = option0.hasValueSeparator();
      assertEquals('O', option0.getValueSeparator());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.hasArgs();
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgs();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Option option0 = new Option("B", "B");
      option0.setArgs(2147483645);
      boolean boolean0 = option0.hasArgs();
      assertEquals(2147483645, option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Option option0 = new Option("A", "A");
      boolean boolean0 = option0.hasArgs();
      assertFalse(boolean0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Option option0 = new Option("z", true, "z");
      option0.hasArg();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("e)l-aT-{Gb-R_\"D=V_");
      option_Builder0.hasArgs();
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArg();
      assertEquals((-2), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      option0.getValueSeparator();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Option option0 = new Option("A", "A");
      option0.hasOptionalArg();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Option option0 = new Option("", "");
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Option option0 = new Option("v", "v");
      String string0 = option0.toString();
      assertEquals((-1), option0.getArgs());
      assertEquals("[ option: v  :: v :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      String string0 = option0.toString();
      assertEquals("[ option:    [ARG] ::  :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.hasArgs();
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.requiresArg();
      assertTrue(option0.hasArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Option option0 = new Option("A", "A");
      option0.setOptionalArg(true);
      boolean boolean0 = option0.requiresArg();
      assertTrue(option0.hasOptionalArg());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Option option0 = new Option("A", "A", true, "A");
      option0.setValueSeparator('A');
      option0.addValueForProcessing("A");
      assertEquals('A', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.hasArgs();
      Option option0 = option_Builder0.build();
      option0.setValueSeparator('\'');
      option0.addValueForProcessing(")*;Q2Upf'hbN%TZ4LV(");
      assertEquals('\'', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("e)l-aT-{Gb-R_\"D=V_");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasLongOpt();
      assertEquals((-1), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Option option0 = new Option("v", "v");
      boolean boolean0 = option0.hasLongOpt();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Option option0 = new Option("B", "B");
      assertFalse(option0.hasArgs());
      
      option0.setArgs((-2));
      option0.toString();
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setArgName("");
      boolean boolean0 = option0.hasArgName();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.option("x");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgName();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", true, "NO_ARGS_ALLOWED");
      String[] stringArray0 = option0.getValues();
      assertNull(stringArray0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Option option0 = new Option("A", "", true, "3<4IJ\"le `K");
      option0.addValueForProcessing("");
      String[] stringArray0 = option0.getValues();
      assertFalse(option0.hasValueSeparator());
      assertEquals("3<4IJ\"le `K", option0.getDescription());
      assertNotNull(stringArray0);
      assertEquals("", option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", true, "NO_ARGS_ALLOWED");
      option0.addValueForProcessing("NO_ARGS_ALLOWED");
      option0.getValue("NO_ARGS_ALLOWED");
      assertFalse(option0.hasValueSeparator());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Option option0 = new Option("S", "S");
      option0.getValue((-2));
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Option option0 = new Option("A", "A", true, "A");
      option0.addValueForProcessing("A");
      String string0 = option0.getValue(0);
      assertNotNull(string0);
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.getValue();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Option option0 = new Option("A", "A", true, "A");
      option0.addValueForProcessing("A");
      String string0 = option0.getValue();
      assertFalse(option0.hasValueSeparator());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Option option0 = new Option("", "");
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Option option0 = new Option("A", "A");
      Option option1 = (Option)option0.clone();
      boolean boolean0 = option0.equals(option1);
      assertTrue(boolean0);
      assertEquals((-1), option1.getArgs());
      assertFalse(option1.hasLongOpt());
      assertNotSame(option1, option0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Option option0 = new Option("A", "A");
      Option option1 = new Option("", true, "");
      boolean boolean0 = option0.equals(option1);
      assertFalse(option1.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.equals(option_Builder0);
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Option option0 = new Option("A", "A");
      boolean boolean0 = option0.equals(option0);
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Option option0 = new Option("", "");
      Option option1 = new Option("", "", true, "");
      boolean boolean0 = option0.equals(option1);
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Option option0 = new Option("v", "v");
      // Undeclared exception!
      try { 
        option0.addValueForProcessing("v");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // NO_ARGS_ALLOWED
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Option option0 = new Option("xC", "xC", true, "`LtV1B&X9f#R<U!(");
      option0.addValueForProcessing("=f-5'~xQ>Q)b38");
      // Undeclared exception!
      try { 
        option0.addValueForProcessing("`LtV1B&X9f#R<U!(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value, list full.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Option option0 = new Option("A", "A", true, "A");
      assertTrue(option0.hasArg());
      
      option0.addValueForProcessing("A");
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.optionalArg(true);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("f");
      Option.Builder option_Builder1 = option_Builder0.optionalArg(false);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg(false);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
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
  public void test77()  throws Throwable  {
      Option option0 = new Option("", true, "");
      assertFalse(option0.hasLongOpt());
      
      option0.setLongOpt("");
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Option option0 = new Option("v", "v");
      option0.getOpt();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Option option0 = new Option("v", "v");
      option0.getType();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Option option0 = new Option("A", "A");
      // Undeclared exception!
      try { 
        option0.addValue("A");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. 
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Option option0 = new Option("", "");
      String string0 = option0.getLongOpt();
      assertEquals((-1), option0.getArgs());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Option option0 = new Option("", "/AxWjh&nqb:", true, "--");
      option0.hashCode();
      assertEquals(1, option0.getArgs());
      assertEquals("--", option0.getDescription());
      assertEquals("/AxWjh&nqb:", option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      option0.isRequired();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Option option0 = new Option("", "/AxWjh&nqb:", true, "--");
      String string0 = option0.getDescription();
      assertEquals("/AxWjh&nqb:", option0.getLongOpt());
      assertEquals("--", string0);
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Option option0 = new Option("", "");
      int int0 = option0.getArgs();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Option option0 = new Option("v", "v");
      option0.clearValues();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Option option0 = new Option("A", "A");
      option0.setDescription("A");
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Option option0 = new Option("v", "v");
      option0.setArgName("v");
      boolean boolean0 = option0.hasArgName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
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
  public void test90()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.getValuesList();
      assertFalse(option0.hasLongOpt());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      Option option0 = new Option("xC", "xC", true, "`LtV1BEX9f#R<U!(");
      option0.setRequired(true);
      assertTrue(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      Option option0 = new Option("v", "v");
      option0.setOptionalArg(true);
      boolean boolean0 = option0.acceptsArg();
      assertTrue(option0.hasOptionalArg());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Option option0 = new Option("", "", true, " ~P)2EG|");
      option0.getArgName();
      assertEquals("", option0.getLongOpt());
      assertEquals(" ~P)2EG|", option0.getDescription());
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setType((Object) null);
      String string0 = option0.toString();
      assertEquals((-1), option0.getArgs());
      assertEquals("[ option: null  :: null ]", string0);
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Class<Object> class0 = Object.class;
      Option.Builder option_Builder1 = option_Builder0.type(class0);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.hasArgs();
      Option option0 = option_Builder0.build();
      option0.addValueForProcessing("");
      boolean boolean0 = option0.requiresArg();
      assertFalse(option0.hasValueSeparator());
      assertEquals((-2), option0.getArgs());
      assertTrue(option0.hasArg());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg();
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("I3A");
      Option.Builder option_Builder1 = option_Builder0.desc("I3A");
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test99()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.valueSeparator();
      assertSame(option_Builder1, option_Builder0);
  }
}
