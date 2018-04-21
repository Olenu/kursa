package test;
 
import static org.junit.Assert.*; 


import org.junit.After; 

import org.junit.Before; 

import org.junit.Test; 

import org.junit.runner.JUnitCore; 

import org.junit.runner.Result; 

import Calc.korporateCalc; 

public class korporateTest {

	private korporateCalc test;
	
	@Before

	public void init() { test = new korporateCalc(); } 
	
    @After

    public void tearDown() { test = null; } 
    
    @Test

    public void testGet(){ 

    	test = new korporateCalc(); 

    	assertEquals("47.25",test.getP(12, 16, 45, 5.6)); 
	 }
    

    private korporateCalc test1;
	
	@Before

	public void init1() { test1 = new korporateCalc(); } 
	
    @After

    public void tearDown1() { test1 = null; } 
    
    @Test

    public void testGet1(){ 

    	test1 = new korporateCalc(); 

    	assertEquals("391.02",test1.getP(10, 14, 52, 55)); 
	 }

    private korporateCalc test2;
	
	@Before

	public void init2() { test2 = new korporateCalc(); } 
	
    @After

    public void tearDown2() { test2 = null; } 
    
    @Test

    public void testGet2(){ 

    	test2 = new korporateCalc(); 

    	assertEquals("67.68",test2.getP(14, 2, 90, 27.5)); 
	 }
    

    private korporateCalc test3;
	
	@Before

	public void init3() { test3 = new korporateCalc(); } 
	
    @After

    public void tearDown3() { test3 = null; } 
    
    @Test

    public void testGet3(){ 

    	test3 = new korporateCalc(); 

    	assertEquals("6.45",test3.getP(8, 1, 30, 27.5)); 
	 }
}