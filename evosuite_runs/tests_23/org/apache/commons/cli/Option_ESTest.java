/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 00:03:48 GMT 2023
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
      option0.setArgs((-417));
      boolean boolean0 = option0.requiresArg();
      assertEquals((-417), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Option option0 = new Option("C6i", true, "C6i");
      option0.addValueForProcessing("C6i");
      option0.setValueSeparator('C');
      // Undeclared exception!
      try { 
        option0.addValueForProcessing("C6i");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value, list full.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Option option0 = new Option("", true, "G_}|");
      option0.setArgs((-817));
      // Undeclared exception!
      try { 
        option0.addValueForProcessing(" ");
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
      Option option0 = new Option("", true, "");
      option0.setArgs((-2));
      option0.addValueForProcessing(" ");
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setOptionalArg(true);
      boolean boolean0 = option0.acceptsArg();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertFalse(option0.hasArgs());
      assertTrue(boolean0);
      assertFalse(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.required(false);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Option option0 = new Option("2", false, "");
      option0.setRequired(true);
      boolean boolean0 = option0.isRequired();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("34HhR");
      Option.Builder option_Builder1 = option_Builder0.optionalArg(true);
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.hasOptionalArg();
      assertEquals(1, option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.addValueForProcessing("");
      option0.getValuesList();
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.valueSeparator('3');
      Option option0 = option_Builder0.build();
      char char0 = option0.getValueSeparator();
      assertEquals('3', char0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.setValueSeparator('O');
      char char0 = option0.getValueSeparator();
      assertEquals('O', char0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Option option0 = new Option("", false, ">*.8kXWs/'V'gc");
      option0.getValue((String) null);
      assertFalse(option0.hasLongOpt());
      assertEquals(">*.8kXWs/'V'gc", option0.getDescription());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Option option0 = new Option("Y", true, "Y");
      option0.addValueForProcessing("Y");
      String string0 = option0.getValue(0);
      assertFalse(option0.hasValueSeparator());
      assertFalse(option0.hasLongOpt());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.addValueForProcessing("");
      String string0 = option0.getValue(0);
      assertNotNull(string0);
      assertFalse(option0.hasLongOpt());
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.addValueForProcessing("");
      String string0 = option0.getValue();
      assertFalse(option0.hasValueSeparator());
      assertNotNull(string0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, "");
      option0.setType((Object) null);
      option0.getType();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      String string0 = option0.getOpt();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Option option0 = new Option("M", "", true, "qJ`d0&Me");
      option0.getOpt();
      assertEquals("qJ`d0&Me", option0.getDescription());
      assertEquals("", option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.setLongOpt("The option '");
      String string0 = option0.getLongOpt();
      assertEquals("The option '", string0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Option option0 = new Option("", "", false, "");
      option0.getLongOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      String string0 = option0.getKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Option option0 = new Option("M", (String) null, false, "M");
      option0.getKey();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.getKey();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Option option0 = new Option("KjE", "KjE");
      int int0 = option0.getId();
      assertEquals((-1), option0.getArgs());
      assertEquals(75, int0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      String string0 = option0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Option option0 = new Option("", false, ">*.8kXWs/'V'gc");
      String string0 = option0.getDescription();
      assertFalse(option0.hasLongOpt());
      assertEquals(">*.8kXWs/'V'gc", string0);
      assertEquals((-1), option0.getArgs());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Option option0 = new Option("", "");
      assertEquals((-1), option0.getArgs());
      
      option0.setArgs(0);
      int int0 = option0.getArgs();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Option option0 = new Option("", true, (String) null);
      int int0 = option0.getArgs();
      assertFalse(option0.hasLongOpt());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.argName("M");
      option_Builder1.option("");
      Option option0 = option_Builder0.build();
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.setArgName("");
      option0.getArgName();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Option option0 = new Option("", "");
      boolean boolean0 = option0.acceptsArg();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
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
  public void test032()  throws Throwable  {
      // Undeclared exception!
      try { 
        Option.builder("uLHp6ul%62=Td&R*-k");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'uLHp6ul%62=Td&R*-k' contains an illegal character : '%'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      option0.setValueSeparator('I');
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
  public void test034()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("Illegal option name '", true, "Illegal option name '");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'Illegal option name '' contains an illegal character : ' '
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("(0", "(0", false, "(0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '(0' contains an illegal character : '('
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("#", "#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '#'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Option option0 = new Option("a0To8e9", "a0To8e9");
      boolean boolean0 = option0.hasValueSeparator();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Option option0 = new Option("a0To8e9", "a0To8e9");
      option0.setValueSeparator('w');
      boolean boolean0 = option0.hasValueSeparator();
      assertEquals('w', option0.getValueSeparator());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.option("");
      option_Builder1.hasArgs();
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.hasArgs();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Option option0 = new Option("a0NTo8e9", "a0NTo8e9");
      option0.setArgs(34);
      boolean boolean0 = option0.hasArgs();
      assertEquals(34, option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Option option0 = new Option("KjE", " <T\"]ft1CD564E_mq");
      boolean boolean0 = option0.hasArgs();
      assertFalse(boolean0);
      assertEquals(" <T\"]ft1CD564E_mq", option0.getDescription());
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Option option0 = new Option("", "");
      boolean boolean0 = option0.hasArg();
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.hasArg();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Option option0 = new Option("4", "4");
      option0.getValueSeparator();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Option option0 = new Option("a0NTo8e9", "a0NTo8e9");
      option0.hasOptionalArg();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      assertEquals("", option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Option option0 = new Option("", true, "");
      String string0 = option0.toString();
      assertEquals("[ option:   [ARG] ::  :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("34HhR");
      Option option0 = option_Builder1.build();
      String string0 = option0.toString();
      assertEquals("[ option: null 34HhR  :: null :: class java.lang.String ]", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.addValueForProcessing("");
      option0.setArgs((-2));
      boolean boolean0 = option0.requiresArg();
      assertTrue(option0.hasArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Option option0 = new Option("fe", "fe");
      assertEquals((-1), option0.getArgs());
      
      option0.setArgs((-2));
      boolean boolean0 = option0.requiresArg();
      assertTrue(option0.hasArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Option option0 = new Option("", true, "");
      boolean boolean0 = option0.requiresArg();
      assertTrue(boolean0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.setValueSeparator('p');
      option0.setArgs(3440);
      option0.addValueForProcessing("org.apache.commons.cli.OptionValidator");
      assertEquals(3440, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      boolean boolean0 = option0.hasLongOpt();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Option option0 = new Option("", false, ">*.8kXWs/'V'gc");
      boolean boolean0 = option0.hasLongOpt();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
      assertEquals(">*.8kXWs/'V'gc", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Option option0 = new Option("S", "S");
      assertFalse(option0.hasArg());
      
      option0.setArgs((-2));
      option0.toString();
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setArgName("");
      boolean boolean0 = option0.hasArgName();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Option option0 = new Option("4", "4");
      option0.setArgName("4");
      boolean boolean0 = option0.hasArgName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Option option0 = new Option("", true, "");
      boolean boolean0 = option0.hasArgName();
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.setArgs((-2));
      boolean boolean0 = option0.hasArg();
      assertEquals((-2), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      String[] stringArray0 = option0.getValues();
      assertNull(stringArray0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Option option0 = new Option("6", "6", true, "6");
      option0.addValueForProcessing("6");
      String[] stringArray0 = option0.getValues();
      assertNotNull(stringArray0);
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.addValueForProcessing("");
      String string0 = option0.getValue("\"");
      assertEquals("", string0);
      assertFalse(option0.hasValueSeparator());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Option option0 = new Option("a0NTo8e9", "a0NTo8e9");
      String string0 = option0.getValue("g");
      assertNotNull(string0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Option option0 = new Option("41", true, "41");
      option0.addValueForProcessing("41");
      try { 
        option0.getValue(45);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.getValue();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.addValueForProcessing("org.apache.commons.cli.Option");
      String string0 = option0.getValue();
      assertFalse(option0.hasValueSeparator());
      assertNotNull(string0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
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
  public void test068()  throws Throwable  {
      Option option0 = new Option("", "");
      Option option1 = (Option)option0.clone();
      boolean boolean0 = option1.equals(option0);
      assertNotSame(option1, option0);
      assertFalse(option1.hasLongOpt());
      assertEquals((-1), option1.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      Option option1 = new Option("", "");
      boolean boolean0 = option0.equals(option1);
      assertFalse(boolean0);
      assertEquals((-1), option1.getArgs());
      assertFalse(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Option option0 = new Option("U", "U");
      Option option1 = new Option("U", "U", false, "U");
      boolean boolean0 = option0.equals(option1);
      assertFalse(boolean0);
      assertEquals((-1), option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Option option0 = new Option("", "");
      boolean boolean0 = option0.equals(option0);
      assertTrue(boolean0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      boolean boolean0 = option0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Option option0 = new Option("FmY", "FmY");
      // Undeclared exception!
      try { 
        option0.addValueForProcessing("FmY");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // NO_ARGS_ALLOWED
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.optionalArg(true);
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.optionalArg(false);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg(false);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
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
  public void test078()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      option0.getValue((-1));
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Option option0 = new Option("", "", false, "");
      option0.getOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.getType();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Option option0 = new Option("4rj", "4rj");
      // Undeclared exception!
      try { 
        option0.addValue("4rj");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. 
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Option option0 = new Option("", true, "");
      String string0 = option0.getLongOpt();
      assertNull(string0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.hashCode();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Option option0 = new Option("", "", false, "2");
      option0.isRequired();
      assertEquals((-1), option0.getArgs());
      assertEquals("", option0.getOpt());
      assertEquals("", option0.getLongOpt());
      assertEquals("2", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Option option0 = new Option("", true, "");
      String string0 = option0.getDescription();
      assertFalse(option0.hasLongOpt());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Option option0 = new Option("", "");
      int int0 = option0.getArgs();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.clearValues();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.setArgs(0);
      // Undeclared exception!
      try { 
        option0.addValueForProcessing("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value, list full.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setDescription("^");
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Option option0 = new Option("", "");
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.getValuesList();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.setOptionalArg(true);
      option0.setArgs(0);
      option0.addValueForProcessing("");
      assertEquals(0, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Option option0 = new Option("C6i", true, "C6i");
      option0.setValueSeparator('C');
      option0.addValueForProcessing("C6i");
      assertEquals('C', option0.getValueSeparator());
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
      Class<Option> class0 = Option.class;
      Option.Builder option_Builder1 = option_Builder0.type(class0);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.numberOfArgs(2711);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg();
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.desc("");
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.required();
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.valueSeparator();
      assertSame(option_Builder1, option_Builder0);
  }
}
