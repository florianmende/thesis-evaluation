/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 23:01:26 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.cli.UnrecognizedOptionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UnrecognizedOptionException_ESTest extends UnrecognizedOptionException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnrecognizedOptionException unrecognizedOptionException0 = new UnrecognizedOptionException("Z@MYvO:M8dzJj*{", "^$*().unu");
      String string0 = unrecognizedOptionException0.getOption();
      assertEquals("^$*().unu", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnrecognizedOptionException unrecognizedOptionException0 = new UnrecognizedOptionException("", "");
      String string0 = unrecognizedOptionException0.getOption();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UnrecognizedOptionException unrecognizedOptionException0 = new UnrecognizedOptionException(":l6gp@*#VtF>AB*X");
      String string0 = unrecognizedOptionException0.getOption();
      assertNull(string0);
  }
}
