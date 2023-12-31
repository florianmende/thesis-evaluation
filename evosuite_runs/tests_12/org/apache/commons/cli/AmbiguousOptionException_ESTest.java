/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 23:43:36 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.cli.AmbiguousOptionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AmbiguousOptionException_ESTest extends AmbiguousOptionException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AmbiguousOptionException ambiguousOptionException0 = null;
      try {
        ambiguousOptionException0 = new AmbiguousOptionException("K3 ,!F%V\"MwJEw-jg", (Collection<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.AmbiguousOptionException", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      List<String> list0 = List.of("e*$t'O3MBN3(Y[U", "e*$t'O3MBN3(Y[U", "e*$t'O3MBN3(Y[U", "e*$t'O3MBN3(Y[U", "e*$t'O3MBN3(Y[U", "e*$t'O3MBN3(Y[U");
      AmbiguousOptionException ambiguousOptionException0 = new AmbiguousOptionException("e*$t'O3MBN3(Y[U", list0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      AmbiguousOptionException ambiguousOptionException0 = new AmbiguousOptionException("", linkedList0);
      Collection<String> collection0 = ambiguousOptionException0.getMatchingOptions();
      assertFalse(collection0.contains(""));
  }
}
