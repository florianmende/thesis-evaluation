/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 02:18:22 GMT 2023
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
  public void test000()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setArgs((-2040));
      boolean boolean0 = option0.requiresArg();
      assertEquals((-2040), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setValueSeparator('3');
      option0.setArgs(7);
      option0.addValueForProcessing("i;ZU)[$3N Zl4zvVY");
      assertEquals(7, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setArgs((-677));
      // Undeclared exception!
      try { 
        option0.addValueForProcessing("B^4bY~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value, list full.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.required(false);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Option option0 = new Option((String) null, true, (String) null);
      option0.setOptionalArg(true);
      boolean boolean0 = option0.hasOptionalArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.addValueForProcessing("");
      option0.getValuesList();
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setValueSeparator('3');
      char char0 = option0.getValueSeparator();
      assertEquals('3', char0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.option("");
      option_Builder1.valueSeparator('O');
      Option option0 = option_Builder1.build();
      char char0 = option0.getValueSeparator();
      assertEquals('O', char0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      String string0 = option0.getValue("y");
      assertEquals("y", string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      assertFalse(option0.hasArgs());
      
      option0.setArgs((-2));
      option0.addValueForProcessing("i;ZU)[$3pFlzvVY");
      option0.getValue(0);
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.addValueForProcessing("");
      String string0 = option0.getValue();
      assertNotNull(string0);
      assertFalse(option0.hasValueSeparator());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      option0.setType((Object) null);
      option0.getType();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Option option0 = new Option("fp4RYQ4BVd", false, "fp4RYQ4BVd");
      option0.getOpt();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.getOpt();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getLongOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("'<L");
      Option option0 = option_Builder0.build();
      option0.getLongOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      option0.getKey();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("'<L");
      Option option0 = option_Builder1.build();
      option0.getKey();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Option option0 = new Option("", false, "");
      option0.getKey();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Option option0 = new Option("v", "v");
      option0.getId();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Option option0 = new Option((String) null, true, (String) null);
      String string0 = option0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Option option0 = new Option("", "24`Cl0'y8tX<p4T");
      String string0 = option0.getDescription();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertNotNull(string0);
      assertEquals("24`Cl0'y8tX<p4T", string0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      assertEquals((-1), option0.getArgs());
      
      option0.setArgs(0);
      int int0 = option0.getArgs();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Option option0 = new Option("", true, "");
      int int0 = option0.getArgs();
      assertFalse(option0.hasLongOpt());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("'<L");
      option_Builder1.argName("'<L");
      Option option0 = option_Builder0.build();
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("CQMq7L");
      option_Builder0.argName("");
      Option option0 = option_Builder0.build();
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Option option0 = new Option((String) null, true, (String) null);
      boolean boolean0 = option0.acceptsArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      boolean boolean0 = option0.acceptsArg();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Option option0 = new Option("r", "r");
      // Undeclared exception!
      try { 
        option0.setType((Object) "r");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setArgs((-2));
      option0.addValueForProcessing((String) null);
      try { 
        option0.getValue((-2));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      // Undeclared exception!
      try { 
        Option.builder("eT6C)fVF\nQW:K!e1v");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'eT6C)fVF
         // QW:K!e1v' contains an illegal character : ')'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setValueSeparator('3');
      option0.setArgs((-2));
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
  public void test032()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("UqmPfA{H|pv&}PLd", true, "UqmPfA{H|pv&}PLd");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'UqmPfA{H|pv&}PLd' contains an illegal character : '{'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("UqmPfA{H|pv&}PLd", "UqmPfA{H|pv&}PLd", true, "UqmPfA{H|pv&}PLd");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'UqmPfA{H|pv&}PLd' contains an illegal character : '{'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("eIcz{.yvi@Q", "eIcz{.yvi@Q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'eIcz{.yvi@Q' contains an illegal character : '{'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Option option0 = new Option("", "");
      boolean boolean0 = option0.hasValueSeparator();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Option option0 = new Option("Z", "Z");
      option0.setValueSeparator('g');
      boolean boolean0 = option0.hasValueSeparator();
      assertEquals('g', option0.getValueSeparator());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.option("");
      option_Builder1.hasArgs();
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgs();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      boolean boolean0 = option0.hasArgs();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Option option0 = new Option("CQMq7L", "org.apache.commons.cli.Util");
      boolean boolean0 = option0.hasArg();
      assertEquals("org.apache.commons.cli.Util", option0.getDescription());
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.hasArg();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.setArgs((-2));
      boolean boolean0 = option0.hasArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, false, (String) null);
      option0.getValue();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.addValueForProcessing("y");
      String string0 = option0.getValue();
      assertFalse(option0.hasValueSeparator());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Option option0 = new Option("9", "9");
      option0.getValueSeparator();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      option0.hasOptionalArg();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Option option0 = new Option("", true, "");
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      String string0 = option0.toString();
      assertEquals("[ option: null  :: null :: class java.lang.String ]", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      String string0 = option0.toString();
      assertEquals("[ option:    [ARG] ::  :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      assertFalse(option0.hasArgs());
      
      option0.setArgs((-2));
      option0.addValueForProcessing("i;ZU)[$3pFlzvVY");
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      assertFalse(option0.hasArgs());
      
      option0.setArgs((-2));
      boolean boolean0 = option0.requiresArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setOptionalArg(true);
      boolean boolean0 = option0.requiresArg();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setValueSeparator('3');
      option0.setArgs(1);
      option0.addValueForProcessing("i;ZU)[$3pFlzvVY");
      assertEquals('3', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("'<L");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasLongOpt();
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.option("");
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.hasLongOpt();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setArgs('');
      boolean boolean0 = option0.hasArgs();
      assertEquals(127, option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setArgName("");
      boolean boolean0 = option0.hasArgName();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      boolean boolean0 = option0.hasArgName();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      String[] stringArray0 = option0.getValues();
      assertEquals((-1), option0.getArgs());
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.hasArg();
      Option option0 = option_Builder1.build();
      option0.addValueForProcessing("");
      String[] stringArray0 = option0.getValues();
      assertFalse(option0.hasValueSeparator());
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getValue((-15));
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getValue((String) null);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Option option0 = new Option("", (String) null, true, (String) null);
      assertTrue(option0.hasArg());
      
      option0.addValueForProcessing("");
      String string0 = option0.getValue((String) null);
      assertFalse(option0.hasLongOpt());
      assertFalse(option0.hasValueSeparator());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
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
  public void test064()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      Option option1 = new Option("", true, "");
      boolean boolean0 = option0.equals(option1);
      assertFalse(boolean0);
      assertFalse(option1.hasLongOpt());
      assertTrue(option1.hasArg());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Option option0 = new Option("5", "5");
      Option option1 = new Option("5", "5", false, "5");
      boolean boolean0 = option0.equals(option1);
      assertEquals((-1), option1.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Option option0 = new Option("9", "9");
      Option option1 = new Option("9", "9");
      boolean boolean0 = option0.equals(option1);
      assertTrue(boolean0);
      assertEquals((-1), option1.getArgs());
      assertFalse(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, false, (String) null);
      boolean boolean0 = option0.equals(option0);
      assertEquals((-1), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      boolean boolean0 = option0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      // Undeclared exception!
      try { 
        option0.addValueForProcessing((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // NO_ARGS_ALLOWED
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      assertEquals((-1), option0.getArgs());
      
      option0.setArgs(1);
      option0.addValueForProcessing("i;ZU)[$3pFlzvVY");
      boolean boolean0 = option0.requiresArg();
      assertEquals(1, option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setArgs(0);
      option0.setOptionalArg(true);
      assertTrue(option0.hasOptionalArg());
      
      option0.addValueForProcessing("");
      assertFalse(option0.hasArgs());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.optionalArg(true);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.optionalArg(false);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg(false);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
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
  public void test076()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setLongOpt((String) null);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      option0.getOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Option option0 = new Option("k57m_6", "k57m_6");
      option0.getType();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
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
  public void test080()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "");
      String string0 = option0.getLongOpt();
      assertNotNull(string0);
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Option option0 = new Option("9", "9");
      option0.hashCode();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      option0.isRequired();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.getDescription();
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      int int0 = option0.getArgs();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Option option0 = new Option((String) null, true, (String) null);
      option0.clearValues();
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setDescription((String) null);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Option option0 = new Option("v", "v");
      option0.setArgName("v");
      boolean boolean0 = option0.hasArgName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      Option option1 = (Option)option0.clone();
      assertNotSame(option1, option0);
      assertEquals((-1), option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Option option0 = new Option("", "");
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getValuesList();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      assertFalse(option0.hasArg());
      
      option0.setArgs((-2));
      String string0 = option0.toString();
      assertEquals("[ option: null [ARG...] :: null :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.setRequired(true);
      assertTrue(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setValueSeparator('3');
      option0.setArgs((-2));
      option0.addValueForProcessing("i;ZU)[$3pFlzvVY");
      assertEquals('3', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setType((Object) null);
      String string0 = option0.toString();
      assertEquals("[ option: null  :: null ]", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Class<Object> class0 = Object.class;
      Option.Builder option_Builder1 = option_Builder0.type(class0);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.numberOfArgs((-195));
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.hasArg();
      Option option0 = option_Builder1.build();
      assertTrue(option0.hasArg());
      
      option0.addValueForProcessing("");
      String string0 = option0.getValue(0);
      assertFalse(option0.hasValueSeparator());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.desc("");
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.required();
      Option.Builder option_Builder2 = option_Builder1.option("");
      Option option0 = option_Builder2.build();
      boolean boolean0 = option0.isRequired();
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.valueSeparator();
      assertSame(option_Builder0, option_Builder1);
  }
}