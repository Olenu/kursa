/**
 * указание принадлежности класса пакету 
 */
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
import Calc.korporateCalc; 

/**
 *описание класса 
 */
public class korporateTest {
/**
 *указание на класс для тестирования 
 */
	private korporateCalc test;
	
	@Before
/**
 * указание на то, что метод будет выполняться перед каждым тестируемым методом 
 */
	public void init() { test = new korporateCalc(); } 
	
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
    	test = new korporateCalc(); 
/**
 * Проведение верного теста для входных значений время работы 12 часов, количество телефонных линий 16,время хранения файлов 16 дней, формат сжатия 5.6 и предположение результата 47.25 
 */
    	assertEquals("47.25",test.getP(12, 16, 45, 5.6)); 
	 }
    
/**
 *указание на класс для тестирования	 
 */
    private korporateCalc test1;
	
	@Before
/**
 * указание на то, что метод будет выполняться перед каждого тестируемого метода  
 */
	public void init1() { test1 = new korporateCalc(); } 
	
    @After
/**
 * указание на то, что метод будет выполнятся после каждого тестируемого метода 
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
    	test1 = new korporateCalc(); 
/**
 * Проведение верного теста для входных значений время работы 10 часов, количество телефонных линий 14,время хранения файлов 52 дней, формат сжатия 55 и предположение результата 391.02 
 */
    	assertEquals("391.02",test1.getP(10, 14, 52, 55)); 
	 }
/**
 *указание на класс для тестирования		 
 */
    private korporateCalc test2;
	
	@Before
/**
 * указание на то, что метод будет выполняться перед каждого тестируемого метода 
 */
	public void init2() { test2 = new korporateCalc(); } 
	
    @After
/**
 * указание на то, что метод будет выполнятся после каждого тестируемого метода 
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
    	test2 = new korporateCalc(); 
/**
 * Проведение верного теста для входных значений время работы 14 часов, количество телефонных линий 2, время хранения файлов 90 дней, формат сжатия 27.5 и предположение результата 67.68 
 */
    	assertEquals("67.68",test2.getP(14, 2, 90, 27.5)); 
	 }
    
/**
 * указание на класс для тестирования	 
 */
    private korporateCalc test3;
	
	@Before
/**
 * указание на то, что метод будет выполнятся перед каждым тестируемым методом 
 */
	public void init3() { test3 = new korporateCalc(); } 
	
    @After
/**
 * указание на то, что метод будет выполнятся после каждого тестируемого метода 
 */
    public void tearDown3() { test3 = null; } 
    
    @Test
/**
 * создание метод для теста 
 */
    public void testGet3(){ 
/**
 * тестируемый класс 
 */
    	test3 = new korporateCalc(); 
/**
 * Проведение верного теста для входных значений время работы 8 часов, количество телефонных линий 1, время хранения файлов 30 дней, формат сжатия 27.5 и предположение результата 6.45 
 */
    	assertEquals("6.45",test3.getP(8, 1, 30, 27.5)); 
	 }
}
