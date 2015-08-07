
import static org.junit.Assert.*;

import org.junit.*;


public class CalcTest {

	@Test
	 public void test_division() {
	      System.out.println("Test if 120/10 returns 12...") ;
	      Calc calc = new Calc() ;
	      double testValue = 12.0;
	      System.out.println("Test " + calc.division(120,10) +"test valus" + testValue) ;
	      assertEquals(testValue, calc.division(120,10), 00);
	   }
	
	@Test
	 public void test_multiplication() {
	      System.out.println("Test if 33*3 returns 99...") ;
	      Calc calc = new Calc() ;
	      double testValue = 99;
	      assertEquals(testValue,calc.multiplication(33,3),00);
	   }
	
	@Test
	 public void test_mod() {
	      System.out.println("Test if 100%3 returns 1...") ;
	      Calc calc = new Calc() ;    
	      double testValue = 1;
	     assertEquals(testValue,calc.modulus(100,3),00);
	   }
	
	@Test
	 public void test_subtraction() {
	      System.out.println("Test if 100 - 5- returns 50...") ;
	      Calc calc = new Calc() ;     
	      double testValue = 50;
	      assertEquals(testValue,calc.subtraction(100,50),00);
	   }
	
	@Test
	 public void test_addition() {
	      System.out.println("Test if 100 + 50 returns 150...") ;
	      Calc calc = new Calc() ;     
	      double testValue = 150;
	      assertEquals(testValue,calc.addition(100,50),00);
	   }

}
