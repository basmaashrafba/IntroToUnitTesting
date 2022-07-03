import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {
	/*@Test
	public void TestMainProgram1() {
		String input ="1\n";
		
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args ={};
		Demo.main(args);
		
		String consoleOutput = "Enter side 1: ";
		consoleOutput += "Enter side 2: ";
		consoleOutput += "Enter side 3: ";
		consoleOutput += "This is a triangle. ";
	    assertEquals(consoleOutput, out.toString());
	    }*/
	    
	@Test
	public void TestIsTriangle1() {
        assertTrue(Demo.isTriangle(9, 9, 9));
    }
	@Test
	public void TestISTriangle2() {
        assertTrue(Demo.isTriangle(45, 30, 60));
    }
	@Test
	public void TestISTriangle3() {
       assertTrue(Demo.isTriangle(7, 9, 5));
   }
	@Test
	public void TestISTriangle4() {
       assertTrue(Demo.isTriangle(13, 12, 5));
   }
	@Test
	public void TestISTriangle5() {
       assertTrue(Demo.isTriangle(16, 18, 4));
   }
	
	@Test
	public void TestISTriangle6() {
       assertTrue(Demo.isTriangle(598, 340, 660));
   }
	@Test
	public void TestISTriangle7() {
       assertTrue(Demo.isTriangle(660, 598, 340));
   }
	@Test
	public void TestISTriangle8() {
       assertTrue(Demo.isTriangle(340, 660, 598));
   }
	//invalid scenarios
	@Test
	public void TestIsNOTTriangle1() {
		assertFalse(Demo.isTriangle(40, 20, 60));
   }
	@Test
	public void TestIsNOTTriangle2() {
		assertFalse(Demo.isTriangle(60, 20, 40));
   }
	
	@Test
	public void TestIsNOTTriangle3() {
		assertFalse(Demo.isTriangle(0, 0, 0));
   }
	@Test
	public void TestIsNOTTriangle4() {
		assertFalse(Demo.isTriangle(3, 5, 10));
   }
	@Test
	public void TestIsNOTTriangle5() {
		assertFalse(Demo.isTriangle(130, 72, 50));
   }
	@Test
	public void TestIsNOTTriangle6() {
		assertFalse(Demo.isTriangle(16, 2, -5));
   }
	@Test 
	public void TestIsNotTriangles7() {
		assertFalse(Demo.isTriangle(5, 12, 7));
	}
	@Test
	public void TestIsNotTriangle8() {
		assertFalse(Demo.isTriangle(16, 18, 48));
	}
}




