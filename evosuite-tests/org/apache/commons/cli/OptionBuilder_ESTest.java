/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 30 10:00:07 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OptionBuilder_ESTest extends OptionBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.withType((Object) null);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptionBuilder.withValueSeparator('/');
      Option option0 = OptionBuilder.create("");
      assertEquals('/', option0.getValueSeparator());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptionBuilder.withLongOpt("S1C3Ua u,98i");
      Option option0 = OptionBuilder.create("");
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptionBuilder.hasOptionalArgs();
      Option option0 = OptionBuilder.create("");
      assertEquals((-2), option0.getArgs());
      assertTrue(option0.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptionBuilder.withArgName("AUAb{m>OD Am|Wn-=");
      Option option0 = OptionBuilder.create((String) null);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Option option0 = OptionBuilder.create("qg");
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionBuilder.hasOptionalArgs(0);
      Option option0 = OptionBuilder.create("");
      assertTrue(option0.hasOptionalArg());
      assertEquals(0, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionBuilder.withValueSeparator();
      Option option0 = OptionBuilder.create('');
      assertEquals((-1), option0.getArgs());
      assertEquals("", option0.getOpt());
      assertEquals('=', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionBuilder.withLongOpt("");
      Option option0 = OptionBuilder.create('1');
      assertEquals((-1), option0.getArgs());
      assertEquals(49, option0.getId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionBuilder.hasOptionalArgs();
      Option option0 = OptionBuilder.create('t');
      assertTrue(option0.hasOptionalArg());
      assertEquals((-2), option0.getArgs());
      assertEquals(116, option0.getId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OptionBuilder.withArgName(" :: ");
      Option option0 = OptionBuilder.create('e');
      assertEquals((-1), option0.getArgs());
      assertEquals(101, option0.getId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OptionBuilder.hasOptionalArgs(0);
      Option option0 = OptionBuilder.create('e');
      assertEquals(0, option0.getArgs());
      assertEquals("e", option0.getOpt());
      assertTrue(option0.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OptionBuilder.withLongOpt("S1C3Ua u,98i");
      OptionBuilder.isRequired();
      Option option0 = OptionBuilder.create();
      assertTrue(option0.isRequired());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OptionBuilder.hasOptionalArgs(0);
      OptionBuilder.withLongOpt(" >3P3 AUk0}8&H");
      Option option0 = OptionBuilder.create();
      assertEquals(0, option0.getArgs());
      assertTrue(option0.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OptionBuilder.withLongOpt("org.apache.commons.cli.Option$Builder");
      OptionBuilder.hasArg();
      Option option0 = OptionBuilder.create();
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        OptionBuilder.create("Cannot add value, list full.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'Cannot add value, list full.' contains an illegal character : ' '
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        OptionBuilder.create('<');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '<'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArg(true);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArg(false);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      try { 
        OptionBuilder.create();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must specify longopt
         //
         verifyException("org.apache.commons.cli.OptionBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OptionBuilder.hasOptionalArgs();
      OptionBuilder.withLongOpt("r]&y.e,^");
      Option option0 = OptionBuilder.create();
      assertTrue(option0.hasOptionalArg());
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArgs();
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OptionBuilder.withValueSeparator();
      OptionBuilder.withLongOpt("r]&y.e,^");
      Option option0 = OptionBuilder.create();
      assertEquals((-1), option0.getArgs());
      assertEquals('=', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<String> class0 = String.class;
      OptionBuilder optionBuilder0 = OptionBuilder.withType(class0);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OptionBuilder.hasOptionalArg();
      Option option0 = OptionBuilder.create('T');
      assertEquals(1, option0.getArgs());
      assertEquals("T", option0.getOpt());
      assertTrue(option0.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OptionBuilder.withArgName("s77u>Gs y=p74Hh8");
      OptionBuilder.withLongOpt("");
      Option option0 = OptionBuilder.create();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OptionBuilder.isRequired(true);
      Option option0 = OptionBuilder.create('R');
      assertEquals(82, option0.getId());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OptionBuilder.hasArg();
      Option option0 = OptionBuilder.create("");
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OptionBuilder.isRequired();
      Option option0 = OptionBuilder.create("");
      assertTrue(option0.isRequired());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.withDescription((String) null);
      // Undeclared exception!
      try { 
        OptionBuilder.withType((Object) optionBuilder0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.apache.commons.cli.OptionBuilder cannot be cast to class java.lang.Class (org.apache.commons.cli.OptionBuilder is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @241c91fb; java.lang.Class is in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.cli.OptionBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArgs(61);
      assertNotNull(optionBuilder0);
  }
}
