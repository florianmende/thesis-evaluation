/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 02:37:14 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Comparator;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class HelpFormatter_ESTest extends HelpFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp(7, "arg", "--", options0, "H9]<]N;[0m{'wmWxM", true);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockFile mockFile0 = new MockFile("lf");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0);
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 1990, 1990, "");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(115);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 10, "i1", " | ", options0, 61, 1899, "/tvo(()q");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp(191, " ", "y\"c%]P*`fq,!^sEVV", options0, "O-.M}tD]q)r&i");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.rtrim("The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.rtrim("");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer("V>[}D&&:f~2T4");
      helpFormatter0.renderWrappedText(stringBuffer0, 74, 113, "ce");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.renderOptions((StringBuffer) null, (-714), options0, 32, 2);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      StringBuffer stringBuffer0 = new StringBuffer();
      helpFormatter0.renderOptions(stringBuffer0, 74, options0, 21, 96);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      StringBuffer stringBuffer0 = new StringBuffer("V>[}D&&:f~2T4");
      helpFormatter0.renderOptions(stringBuffer0, (-4471), options0, 3778, 3914);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setArgName("");
      helpFormatter0.getArgName();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.findWrapPos("                                                                          ", 3, 3);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.findWrapPos(" :: ", 2, 328);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.createPadding(2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.createPadding(0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer("Wl$/\u0004Eu^x``");
      // Undeclared exception!
      helpFormatter0.renderWrappedText(stringBuffer0, 1, 63, "Wl$/\u0004Eu^x``");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer("-");
      // Undeclared exception!
      try { 
        helpFormatter0.renderWrappedText(stringBuffer0, (-684), (-576), "?/ML@\"TfB");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.renderWrappedText((StringBuffer) null, 3, 12, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer("--");
      // Undeclared exception!
      try { 
        helpFormatter0.renderWrappedText(stringBuffer0, 1, (-684), "r]");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -684
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer("--");
      // Undeclared exception!
      try { 
        helpFormatter0.renderOptions(stringBuffer0, (-1), (Options) null, 16, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "\n");
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.renderOptions(stringBuffer0, 1009, options0, 1, (-281));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -281
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("0xP[DU<|:");
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, (-8), " ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(2291);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, true);
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, (-610), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      MockFile mockFile0 = new MockFile("%T#.|u*K1f$ ~j", "Bm");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, (-2), "~%g,", options0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      OutputStream outputStream0 = OutputStream.nullOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(outputStream0, false);
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, (-963), "Pi,C8Ne:5X", (Options) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions((PrintWriter) null, 1924, options0, 1924, 1924);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultWidth = (-33);
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("org.apache.commons.cli.Option$1", options0, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", "0DsE'<", false, (String) null);
      options1.addOption((String) null, false, "");
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("]", options0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter$OptionComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", options0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultWidth = (-3797);
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("Oh/Dq", options0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("(", (Options) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", options0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultWidth = (-33);
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("-", "+q", options0, "hRK8<X,Odvo");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((String) null, "i1", options0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("usage: ");
      // Undeclared exception!
      helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 1, "&d8{%", " ", options0, 1, 115, "\n", false);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(115);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, (-2225), "=z.,bFYq^yo\"ws6;),", "", options0, 1933, 115, "=z.,bFYq^yo\"ws6;),", false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) null, 115, "n\"zP'euX^]*ns*", "org.apache.commons.cli.Util", options0, 115, 115, "qzWwNS)at9H", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(115);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 74, "  ", "  ", options0, 64, (-1737), "usage: ", false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1737
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockFile mockFile0 = new MockFile("lf");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0);
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 1899, "v3(Gn8yK3g", "0", options0, (-1), 61, "");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((-3), "D k%(FF:S~hVr$", (String) null, options0, "usage: ", true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(1050, "E#+$A+QQ?R[F!", "E#+$A+QQ?R[F!", (Options) null, "jS:5,AM< em{B", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.defaultLeftPad = (-6032);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(3, " ", " ", options0, "+", true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -6032
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      helpFormatter0.printHelp(0, "(", "", options0, "");
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((-2), "+", "-", options0, "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(74, "-LyD22`p-'Uz`", "-LyD22`p-'Uz`", (Options) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.setLeftPadding((-102));
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(61, "-", ".i-Eko)R+wS", options0, "1");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -102
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.findWrapPos("y\"c%]P*`fq,!^sEVV", 1, (-2));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.createPadding((-20));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -20
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      Options options1 = options0.addOption("i1", "(", true, "arg");
      // Undeclared exception!
      helpFormatter0.printUsage((PrintWriter) null, 0, "hp", options1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, true);
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, 115, " | ", options0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockFile mockFile0 = new MockFile("org.apache.commons.cli.Util", "arg");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 44, "", "arg", (Options) null, 1, 115, "$g", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getNewLine();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("0xP[DU<|:");
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 1, " ");
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getWidth();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getLeftPadding();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(115);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions(mockPrintWriter0, (-1), options0, 1142, (-5791));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -5791
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getLongOptPrefix();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getArgName();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getSyntaxPrefix();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) null, (-80), (-80), "U");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp("7MlZ>ZDYiS?j,", "", options0, "", false);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockFile mockFile0 = new MockFile(" ");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, 2822, "9 ZOP9;cJ,50\"{.CP[");
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getOptPrefix();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getDescPadding();
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.rtrim((String) null);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp(3, "\n", "\n", options0, "-", true);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("arg", "usage: ", false, "-");
      Options options2 = options1.addOption("l", false, "(");
      helpFormatter0.printHelp(1640, "$}v*%H+", "i1", options2, "+", false);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      Options options1 = options0.addOption("arg", true, "");
      helpFormatter0.printHelp(4391, "usage: ", "-9Nn", options1, " ", true);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      MockFile mockFile0 = new MockFile("EXon5", "usage: ");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 4164, "usage: ", "EXon5", options0, 865, 1, "", true);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(115);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 3, "org.apache.commons.cli.HelpFormatter$OptionComparator", "", options0, 2, 1, "\n", false);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((-1181), "", "", options0, "org.apache.commons.cli.ParseException", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.defaultLongOptPrefix = "\n";
      options0.addOption("arg", "ewv8vK),EM", true, "OSw@");
      helpFormatter0.printHelp(3, "y\"c%]P*`fq,!^sEVV", "y\"c%]P*`fq,!^sEVV", options0, "-", true);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      options0.addOption((String) null, "]\u0002+8*#st\"n`r", true, (String) null);
      helpFormatter0.printHelp(1019, "org.apache.commons.cli.OptionGroup", "}S-3k(ez", options0, "' contains an illegal character : '", true);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("arg", "usage: ", false, "-");
      Options options2 = options1.addOption("i1", "", true, "arg");
      // Undeclared exception!
      helpFormatter0.printHelp(0, "(", "aq&F dxl", options2, "(", true);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      helpFormatter0.setOptionComparator(comparator0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(3, helpFormatter0.defaultDescPad);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setDescPadding(3);
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp("xODVn.Wl'5d", "-", options0, "-");
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(1, helpFormatter0.getLeftPadding());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(115);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, (-1216), (String) null, "usage: ", options0, 1, 23, "\n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      options0.addRequiredOption("arg", "usage: ", true, "-");
      helpFormatter0.printHelp("(", options0, true);
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setOptPrefix("sRpy)aD");
      assertEquals("sRpy)aD", helpFormatter0.getOptPrefix());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setWidth(2);
      assertEquals(2, helpFormatter0.defaultWidth);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = helpFormatter0.getLongOptSeparator();
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(" ", string0);
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(3, helpFormatter0.defaultDescPad);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp("+", options0);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(74, helpFormatter0.getWidth());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setSyntaxPrefix("du");
      assertEquals("du", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(1314, (String) null, (String) null, (Options) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setNewLine("]Co'S>Qa[1U");
      assertEquals("]Co'S>Qa[1U", helpFormatter0.getNewLine());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setLongOptSeparator("org.apache.commons.cli.ParseException");
      assertEquals("org.apache.commons.cli.ParseException", helpFormatter0.getLongOptSeparator());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setLongOptPrefix(",J");
      assertEquals(",J", helpFormatter0.getLongOptPrefix());
  }
}