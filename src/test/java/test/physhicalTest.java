  package test;
	import static org.junit.Assert.*; 

	import org.junit.After; 

	import org.junit.Before; 

	import org.junit.Test; 

	import org.junit.runner.JUnitCore; 

	import org.junit.runner.Result; 


	import Calc.physhicalCalc; 


	public class physhicalTest {

		private physhicalCalc test;
		
		@Before

		public void init() { test = new physhicalCalc(); } 
		
	    @After

	    public void tearDown() { test = null; } 
	    
	    @Test

	    public void testGet(){ 

	    	test = new physhicalCalc(); 

	    	assertEquals("5.8",test.getK(6, 36, 27.5)); 
		 }
	    
	    
		private physhicalCalc test1;
		
		@Before

		public void init1() { test1 = new physhicalCalc(); } 
		
	    @After

	    public void tearDown1() { test1 = null; } 
	    
	    @Test

	    public void testGet1(){ 

	    	test1 = new physhicalCalc(); 

	    	assertEquals("3.5",test1.getK(40, 16, 5.6)); 
		 }
	    
		private physhicalCalc test2;
		
		@Before

		public void init2() { test2 = new physhicalCalc(); } 
		
	    @After

	    public void tearDown2() { test2 = null; } 
	    
	    @Test

	    public void testGet2(){ 

	    	test2 = new physhicalCalc(); 

	    	assertEquals("3.4",test2.getK(9, 7, 55)); 
		 }
	    
		private physhicalCalc test3;
		
		@Before

		public void init3() { test3 = new physhicalCalc(); } 
		
	    @After

	    public void tearDown3() { test3 = null; } 
	    
	    @Test

	    public void testGet3(){ 

	    	test3 = new physhicalCalc(); 

	    	assertEquals("10.6",test3.getK(36, 11, 27.5)); 
		 }
}