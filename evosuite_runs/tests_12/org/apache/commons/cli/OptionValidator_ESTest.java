/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 23:54:39 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.OptionValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OptionValidator_ESTest extends OptionValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      try { 
        OptionValidator.validate("!");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '!'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      try { 
        OptionValidator.validate("a9O5$Jw6M!.OfZ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'a9O5$Jw6M!.OfZ' contains an illegal character : '!'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = OptionValidator.validate("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = OptionValidator.validate((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      try { 
        OptionValidator.validate("[");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '['
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = OptionValidator.validate("?");
      assertEquals("?", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = OptionValidator.validate("X");
      assertEquals("X", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      OptionValidator optionValidator0 = new OptionValidator();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String string0 = OptionValidator.validate("@");
      assertEquals("@", string0);
  }
}
