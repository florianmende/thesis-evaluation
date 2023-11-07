/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:19:20 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BasicParser_ESTest extends BasicParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BasicParser basicParser0 = new BasicParser();
      Options options0 = new Options();
      String[] stringArray0 = basicParser0.flatten(options0, (String[]) null, true);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicParser basicParser0 = new BasicParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[2];
      String[] stringArray1 = basicParser0.flatten(options0, stringArray0, true);
      assertSame(stringArray0, stringArray1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasicParser basicParser0 = new BasicParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      String[] stringArray1 = basicParser0.flatten(options0, stringArray0, true);
      assertSame(stringArray0, stringArray1);
  }
}
