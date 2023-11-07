/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 00:49:04 GMT 2023
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
      option_Builder0.option("dtMU0");
      option_Builder0.numberOfArgs((-2478));
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
      assertEquals((-2478), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Option option0 = new Option("dtMU0", "dtMU0", true, "dtMU0");
      option0.setValueSeparator('=');
      option0.setArgs(2118);
      option0.addValueForProcessing("IM3E\"=");
      assertEquals('=', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("dtMU0");
      option_Builder0.optionalArg(true);
      Option.Builder option_Builder1 = option_Builder0.numberOfArgs(0);
      Option option0 = option_Builder1.build();
      assertTrue(option0.hasOptionalArg());
      
      option0.addValueForProcessing("4>3y!Tf_u-");
      assertEquals(0, option0.getArgs());
      assertFalse(option0.hasValueSeparator());
      assertFalse(option0.hasArg());
      assertFalse(option0.hasArgs());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("dtMU0");
      Option.Builder option_Builder1 = option_Builder0.valueSeparator('$');
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("N_rSG8Nbw09y");
      option_Builder0.required(true);
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.isRequired();
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("dtMU0");
      Option.Builder option_Builder1 = option_Builder0.optionalArg(true);
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.hasOptionalArg();
      assertTrue(option0.hasArg());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("dtMU0");
      option_Builder0.hasArg();
      Option option0 = option_Builder0.build();
      assertEquals(1, option0.getArgs());
      
      option0.addValueForProcessing("dtMU0");
      option0.getValuesList();
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Option option0 = new Option("", "\"pN &ZIk*W ap", true, "");
      option0.setValueSeparator('7');
      char char0 = option0.getValueSeparator();
      assertEquals('7', char0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Option option0 = new Option("dtMU0", "dtMU0");
      option0.setValueSeparator('k');
      char char0 = option0.getValueSeparator();
      assertEquals('k', char0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Option option0 = new Option("dtMU0", "dtMU0", true, "dtMU0");
      String string0 = option0.getValue((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Option option0 = new Option("kikF", "kikF", true, "kikF");
      assertEquals(1, option0.getArgs());
      
      option0.addValueForProcessing("kikF");
      String string0 = option0.getValue(0);
      assertNotNull(string0);
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setType((Object) null);
      option0.getType();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("dtMU0");
      Option option0 = option_Builder0.build();
      option0.getOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.getOpt();
      assertTrue(option0.hasArg());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("N_rSG8Nbw09y");
      option_Builder0.longOpt("N_rSG8Nbw09y");
      Option option0 = option_Builder0.build();
      option0.getLongOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Option option0 = new Option("", true, "");
      assertFalse(option0.hasLongOpt());
      
      option0.setLongOpt("");
      option0.getLongOpt();
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getKey();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Option option0 = new Option("dtMU0", "dtMU0", true, "dtMU0");
      option0.getKey();
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.option("");
      Option option0 = option_Builder1.build();
      option0.getKey();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Option option0 = new Option("n", "n");
      option0.getId();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("dtMU0");
      Option option0 = option_Builder0.build();
      option0.getDescription();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Option option0 = new Option("", "Ehgc.", true, "Xk?o(&0Nv");
      String string0 = option0.getDescription();
      assertEquals("Ehgc.", option0.getLongOpt());
      assertEquals("Xk?o(&0Nv", string0);
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Option option0 = new Option("", "", false, "");
      assertEquals((-1), option0.getArgs());
      
      option0.setArgs(0);
      int int0 = option0.getArgs();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Option option0 = new Option("", "");
      int int0 = option0.getArgs();
      assertEquals((-1), int0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Option option0 = new Option("dtMU0", "dtMU0", true, "dtMU0");
      option0.setArgName("");
      option0.getArgName();
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Option option0 = new Option("n", "n");
      // Undeclared exception!
      try { 
        option0.setType((Object) "n");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Option option0 = new Option("z", "z");
      option0.setArgs((-2));
      option0.addValueForProcessing("z");
      try { 
        option0.getValue(950);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        Option.builder("=r4q*ti$w");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '=r4q*ti$w' contains an illegal character : '='
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Option option0 = new Option("xz", "xz");
      option0.setValueSeparator('m');
      option0.setArgs('m');
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
  public void test29()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("\"", false, "\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '\"'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("\"", "\"", true, "\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '\"'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option(";{J2e~!", ";{J2e~!");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option ';{J2e~!' contains an illegal character : ';'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Option option0 = new Option("", "");
      boolean boolean0 = option0.hasValueSeparator();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Option option0 = new Option("Sz", "Sz");
      option0.setValueSeparator('S');
      boolean boolean0 = option0.hasValueSeparator();
      assertEquals('S', option0.getValueSeparator());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.option("");
      option_Builder0.hasArgs();
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgs();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("dtMU0");
      option_Builder0.numberOfArgs(63);
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgs();
      assertEquals(63, option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Option option0 = new Option("dtMU0", "dtMU0", true, "dtMU0");
      boolean boolean0 = option0.hasArgs();
      assertTrue(option0.hasArg());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("dtMU0");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArg();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Option option0 = new Option("dtMU0", "dtMU0", true, "dtMU0");
      boolean boolean0 = option0.hasArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.option("");
      option_Builder0.hasArgs();
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArg();
      assertTrue(boolean0);
      assertTrue(option0.hasArgs());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Option option0 = new Option("z", "z");
      assertFalse(option0.hasArgs());
      
      option0.setArgs((-2));
      option0.addValueForProcessing("z");
      option0.getValue();
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Option option0 = new Option("z", "z");
      option0.getValueSeparator();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      option0.hasOptionalArg();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.option("dtMU0");
      Option option0 = option_Builder0.build();
      option0.setArgName("dtMU0");
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Option option0 = new Option("", true, "");
      String string0 = option0.toString();
      assertEquals("[ option:   [ARG] ::  :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Option option0 = new Option("", "", false, "");
      String string0 = option0.toString();
      assertEquals("[ option:    ::  :: class java.lang.String ]", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Option option0 = new Option("", "");
      assertFalse(option0.hasArgs());
      
      option0.setArgs((-2));
      option0.addValueForProcessing("");
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Option option0 = new Option("", "");
      assertFalse(option0.hasArgs());
      
      option0.setArgs((-2));
      boolean boolean0 = option0.requiresArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setOptionalArg(true);
      boolean boolean0 = option0.requiresArg();
      assertTrue(option0.hasOptionalArg());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Option option0 = new Option("Sz", "Sz");
      option0.setValueSeparator('S');
      option0.setArgs((-2));
      option0.addValueForProcessing("Sz");
      assertEquals('S', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Option option0 = new Option("kikF", "kikF", true, "kikF");
      boolean boolean0 = option0.hasLongOpt();
      assertTrue(boolean0);
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Option option0 = new Option("", true, "");
      boolean boolean0 = option0.hasLongOpt();
      assertFalse(boolean0);
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Option option0 = new Option("", "");
      assertFalse(option0.hasArg());
      
      option0.setArgs((-2));
      String string0 = option0.toString();
      assertEquals("[ option:  [ARG...] ::  :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Option option0 = new Option("z", "z");
      option0.setArgName("z");
      boolean boolean0 = option0.hasArgName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Option option0 = new Option("", "\"pN &ZIk*W ap", true, "");
      boolean boolean0 = option0.hasArgName();
      assertFalse(boolean0);
      assertEquals("", option0.getDescription());
      assertEquals("\"pN &ZIk*W ap", option0.getLongOpt());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Option option0 = new Option("", "");
      String[] stringArray0 = option0.getValues();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Option option0 = new Option("", "");
      assertFalse(option0.hasArgs());
      
      option0.setArgs((-2));
      option0.addValueForProcessing("");
      option0.getValues();
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Option option0 = new Option("dtMU0", "dtMU0");
      String string0 = option0.getValue(" [ARG]");
      assertNotNull(string0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Option option0 = new Option("mWe7", "mWe7");
      option0.getValue((-1));
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Option option0 = new Option("", "");
      assertFalse(option0.hasArgs());
      
      option0.setArgs((-2));
      option0.addValueForProcessing("");
      option0.getValue(0);
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.getValue();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Option option0 = new Option("", "");
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Option option0 = new Option("", "");
      Option option1 = new Option((String) null, true, "");
      boolean boolean0 = option0.equals(option1);
      assertFalse(boolean0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertEquals(1, option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      Option option1 = new Option("", "");
      boolean boolean0 = option0.equals(option1);
      assertFalse(boolean0);
      assertEquals((-1), option1.getArgs());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Option option0 = new Option("z", "z");
      Option option1 = (Option)option0.clone();
      boolean boolean0 = option0.equals(option1);
      assertFalse(option1.hasLongOpt());
      assertEquals((-1), option1.getArgs());
      assertNotSame(option1, option0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Option option0 = new Option("mWe7", "mWe7");
      boolean boolean0 = option0.equals(option0);
      assertFalse(option0.hasLongOpt());
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Option option0 = new Option("", "\"pN &ZIk*W ap", true, "");
      boolean boolean0 = option0.equals("\"pN &ZIk*W ap");
      assertEquals("\"pN &ZIk*W ap", option0.getLongOpt());
      assertEquals("", option0.getDescription());
      assertFalse(boolean0);
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Option option0 = new Option("z", "z");
      // Undeclared exception!
      try { 
        option0.addValueForProcessing("z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // NO_ARGS_ALLOWED
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Option option0 = new Option("z", "z");
      assertFalse(option0.hasArg());
      
      option0.setArgs(1);
      option0.addValueForProcessing("z");
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("N_rSG8Nbw09y");
      Option.Builder option_Builder1 = option_Builder0.optionalArg(false);
      assertSame(option_Builder0, option_Builder1);
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
      Option option0 = new Option("l", "l");
      option0.getOpt();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getType();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Option option0 = new Option("E", "E");
      // Undeclared exception!
      try { 
        option0.addValue("E");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. 
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("N_rSG8Nbw09y");
      Option option0 = option_Builder0.build();
      option0.getLongOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.hashCode();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Option option0 = new Option("", true, "t");
      option0.isRequired();
      assertEquals(1, option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertEquals("t", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Option option0 = new Option("", true, "");
      String string0 = option0.getDescription();
      assertNotNull(string0);
      assertTrue(option0.hasArg());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Option option0 = new Option("dtMU0", "dtMU0", true, "dtMU0");
      int int0 = option0.getArgs();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Option option0 = new Option("", "*B");
      option0.clearValues();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertEquals("*B", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Option option0 = new Option("K", "K");
      option0.setArgs((-4));
      // Undeclared exception!
      try { 
        option0.addValueForProcessing("K");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value, list full.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setDescription((String) null);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Option option0 = new Option("dtMU0", "dtMU0", true, "dtMU0");
      option0.setArgName("");
      boolean boolean0 = option0.hasArgName();
      assertFalse(boolean0);
      assertTrue(option0.hasArg());
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
      Option option0 = new Option("", "\"pN &ZIk*W ap", true, "");
      option0.getValuesList();
      assertEquals("", option0.getDescription());
      assertTrue(option0.hasArg());
      assertEquals("\"pN &ZIk*W ap", option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Option option0 = new Option("", "");
      assertFalse(option0.hasArgs());
      
      option0.setArgs((-2));
      assertTrue(option0.hasArgs());
      
      option0.addValueForProcessing("");
      option0.getValue("");
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setRequired(true);
      assertTrue(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Option option0 = new Option("uF", "uF");
      option0.setOptionalArg(true);
      boolean boolean0 = option0.acceptsArg();
      assertTrue(option0.hasOptionalArg());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      Option option0 = new Option("dtMU0", "dtMU0", true, "dtMU0");
      option0.getArgName();
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setValueSeparator('2');
      option0.setArgs(1);
      option0.addValueForProcessing("R?ke}+$1e#2~_tS7c2r");
      assertEquals('2', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.setType((Object) null);
      String string0 = option0.toString();
      assertEquals("[ option:   [ARG] ::  ]", string0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Class<Option> class0 = Option.class;
      Option.Builder option_Builder1 = option_Builder0.type(class0);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("dtMU0");
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      Option option0 = option_Builder1.build();
      option0.addValueForProcessing("");
      String string0 = option0.getValue();
      assertFalse(option0.hasValueSeparator());
      assertEquals((-2), option0.getArgs());
      assertNotNull(string0);
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.desc("12P=9;V3 s>vhYc>U7");
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.required();
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.argName(" ]");
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.acceptsArg();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test99()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.valueSeparator();
      assertSame(option_Builder0, option_Builder1);
  }
}
