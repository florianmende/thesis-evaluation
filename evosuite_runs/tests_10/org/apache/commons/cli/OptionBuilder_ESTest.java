/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 02:33:55 GMT 2023
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OptionBuilder_ESTest extends OptionBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.withType((Object) null);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptionBuilder.isRequired();
      Option option0 = OptionBuilder.create("");
      assertEquals((-1), option0.getArgs());
      assertTrue(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptionBuilder.withValueSeparator('N');
      Option option0 = OptionBuilder.create((String) null);
      assertEquals('N', option0.getValueSeparator());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptionBuilder.hasOptionalArgs((-2342));
      Option option0 = OptionBuilder.create("");
      assertTrue(option0.hasOptionalArg());
      assertEquals((-2342), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptionBuilder.withLongOpt("b],@*5P,D'");
      Option option0 = OptionBuilder.create("f0k");
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OptionBuilder.withArgName("*xfolr");
      Option option0 = OptionBuilder.create("");
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionBuilder.hasArgs(0);
      Option option0 = OptionBuilder.create("");
      assertEquals(0, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionBuilder.withValueSeparator();
      Option option0 = OptionBuilder.create('Z');
      assertEquals('=', option0.getValueSeparator());
      assertEquals((-1), option0.getArgs());
      assertEquals("Z", option0.getOpt());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionBuilder.withLongOpt("GSG a_EVT%Z#p*7");
      Option option0 = OptionBuilder.create('4');
      assertEquals("4", option0.getOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionBuilder.hasOptionalArgs((-2));
      Option option0 = OptionBuilder.create('U');
      assertEquals((-2), option0.getArgs());
      assertTrue(option0.hasOptionalArg());
      assertEquals(85, option0.getId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OptionBuilder.withArgName("fRt5'KS<}wt^:ka}/");
      Option option0 = OptionBuilder.create('U');
      assertEquals((-1), option0.getArgs());
      assertEquals("U", option0.getOpt());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OptionBuilder.hasArgs(0);
      Option option0 = OptionBuilder.create('T');
      assertEquals(0, option0.getArgs());
      assertEquals(84, option0.getId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OptionBuilder.withLongOpt("_x");
      OptionBuilder.withArgName("AX");
      Option option0 = OptionBuilder.create();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OptionBuilder.withLongOpt("_x");
      OptionBuilder.hasOptionalArgs(0);
      Option option0 = OptionBuilder.create();
      assertEquals(0, option0.getArgs());
      assertTrue(option0.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      try { 
        OptionBuilder.create("b{iYA{Q=7Ftj4OLo");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'b{iYA{Q=7Ftj4OLo' contains an illegal character : '{'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        OptionBuilder.create('}');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '}'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OptionBuilder.hasArg(true);
      Option option0 = OptionBuilder.create((String) null);
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArg(false);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.withDescription("o(!=%^QtVxL!)");
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OptionBuilder.hasOptionalArgs();
      OptionBuilder.withLongOpt("p@B?>4;!C7<F)T");
      Option option0 = OptionBuilder.create();
      assertEquals((-2), option0.getArgs());
      assertTrue(option0.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OptionBuilder.hasArgs();
      Option option0 = OptionBuilder.create("_x");
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OptionBuilder.withValueSeparator();
      OptionBuilder.withLongOpt("_x");
      Option option0 = OptionBuilder.create();
      assertEquals((-1), option0.getArgs());
      assertEquals('=', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OptionBuilder optionBuilder0 = OptionBuilder.withType(class0);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OptionBuilder.hasOptionalArg();
      OptionBuilder.withLongOpt("");
      Option option0 = OptionBuilder.create();
      assertEquals(1, option0.getArgs());
      assertTrue(option0.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OptionBuilder.isRequired(true);
      OptionBuilder.withLongOpt("_x");
      Option option0 = OptionBuilder.create();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OptionBuilder.hasArg();
      Option option0 = OptionBuilder.create('3');
      assertEquals(1, option0.getArgs());
      assertEquals(51, option0.getId());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OptionBuilder.isRequired();
      Option option0 = OptionBuilder.create('Z');
      assertEquals((-1), option0.getArgs());
      assertTrue(option0.isRequired());
      assertEquals(90, option0.getId());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        OptionBuilder.withType((Object) "=6WGxdz)Dbh\"");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.cli.OptionBuilder", e);
      }
  }
}
