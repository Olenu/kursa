  package test;
/**
 *импортирование классов из библиотеки junit 
 */
	import static org.junit.Assert.*; 

/**
 * Импортирование класса для создания метода, который будет выполняться после каждого тестирования 
 */
	import org.junit.After; 
/**
 * Импортирование класса для создания метода, который будет выполняться до каждого тестирования
 */
	import org.junit.Before; 
/**
 * Импортирование класса для создания теста 
 */
	import org.junit.Test; 
/**
 * Импортирование класса для получения результата 
 */
	import org.junit.runner.JUnitCore; 
/**
 * Импортирование класса для вывода результата 
 */
	import org.junit.runner.Result; 

/**
 * импортирование класса 
 */
	import Calc.physhicalCalc; 

/**
 *описание класса 
 */
	public class physhicalTest {
/**
 *указание на класс для тестирования 
 */
		private physhicalCalc test;
		
		@Before
/**
 * указание на то, что метод будет выполняться перед каждым тестируемым методом 
 */
		public void init() { test = new physhicalCalc(); } 
		
	    @After
/**
 * указание на то, что метод будет выполняться после каждого тестируемого метода  
 */
	    public void tearDown() { test = null; } 
	    
	    @Test
/**
 * создание метода для теста 
 */
	    public void testGet(){ 
/**
 * тестируемый класс 
 */
	    	test = new physhicalCalc(); 
/**
 * Проведение верного теста для входных значений время работы 6 часов, время хранения файлов 36 дней, формат сжатия 27.5 и предположение результата 5.8 
 */
	    	assertEquals("5.8",test.getK(6, 36, 27.5)); 
		 }
	    
	    
		private physhicalCalc test1;
		
		@Before
/**
 * указание на то, что метод будет выполняться перед каждым тестируемым методом 
 */
		public void init1() { test1 = new physhicalCalc(); } 
		
	    @After
/**
 * указание на то, что метод будет выполняться после каждого тестируемого метода  
 */
	    public void tearDown1() { test1 = null; } 
	    
	    @Test
/**
 * создание метода для теста 
 */
	    public void testGet1(){ 
/**
 * тестируемый класс 
 */
	    	test1 = new physhicalCalc(); 
/**
 * Проведение верного теста для входных значений 40 часов, время хранения файлов 16 дней, формат сжатия 5.6 и предположение результата 3.5 
 */
	    	assertEquals("3.5",test1.getK(40, 16, 5.6)); 
		 }
	    
		private physhicalCalc test2;
		
		@Before
/**
 * указание на то, что метод будет выполнятся перед каждым тестируемым методом 
 */
		public void init2() { test2 = new physhicalCalc(); } 
		
	    @After
/**
 * указание на то, что метод будет выполняться после каждого тестируемого метода  
 */
	    public void tearDown2() { test2 = null; } 
	    
	    @Test
/**
 * создание метод для теста 
 */
	    public void testGet2(){ 
/**
 * тестируемый класс 
 */
	    	test2 = new physhicalCalc(); 
/**
 * Проведение верного теста для входных значений время работы 9 часов, время хранения файлов 7 дней, формат сжатия 55 и предположение результата 3.4 
 */
	    	assertEquals("3.4",test2.getK(9, 7, 55)); 
		 }
	    
		private physhicalCalc test3;
		
		@Before
/**
 * указание на то, что метод будет выполняться перед каждым тестируемым методом 
 */
		public void init3() { test3 = new physhicalCalc(); } 
		
	    @After
/**
 * указание на то, что метод будет выполнятся после каждого тестируемого метода  
 */
	    public void tearDown3() { test3 = null; } 
	    
	    @Test
/**
 * создание метода для теста 
 */
	    public void testGet3(){ 
/**
 * тестируемый класс 
 */
	    	test3 = new physhicalCalc(); 
/**
 * Проведение верного теста для входных значений время работы 36 часов, время хранения файлов 11 дней, формат сжатия 27.5 и предположение результата 10.6  
 */
	    	assertEquals("10.6",test3.getK(36, 11, 27.5)); 
		 }
}