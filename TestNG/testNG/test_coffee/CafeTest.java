package test_coffee;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;


import coffee.Cafe;
import coffee.Coffee;
import coffee.CoffeeType;

public class CafeTest {
	
	/* Use constants because e.g. if enum's types changed their states it 
	   does not affect your test code (Suppose that espresso now need more 
	   required beans from 7 increase up to 8 beans, with constants 
	   you do not have to change anything in your test code)
	*/
	public static final int ESPRESSO_BEANS = CoffeeType.Espresso.getRequiredBeans();
	public static final int NO_MILK = 0;
	public static final int NO_BEANS = 0;
	
	private Cafe cafe;
	
	// Use @BeforeTest annotation to remove duplication in test methods
	@BeforeTest
	public void before(){
		cafe = new Cafe();
	}
	
	private void withBeans(){
		cafe.restockBeans(ESPRESSO_BEANS);
	}
	
	@Test
	public void canBrewEspresso(){
		
		withBeans();
		
		Coffee coffee = cafe.brew(CoffeeType.Espresso);
		
		// test there is no milk
		AssertJUnit.assertEquals("Wrong amount of milk", NO_MILK, coffee.getMilk());
		// test that we got enough coffee 
		AssertJUnit.assertEquals("Wrong number of beans", ESPRESSO_BEANS, coffee.getBeans());	
		// testing if it is an espresso
		AssertJUnit.assertEquals("Wrong coffee type",CoffeeType.Espresso, coffee.getType());
	} 
	
	@Test
	public void brewingEspressoConsumesBeans(){
		
		withBeans();
		
		Coffee coffee = cafe.brew(CoffeeType.Espresso);
		
		AssertJUnit.assertEquals(NO_BEANS, cafe.getBeansInStock());
	}
	@Test
	public void canBrewLatte(){
		
		withBeans();
		cafe.restockMilk(CoffeeType.Latte.getRequiredMilk());
		
		Coffee coffee = cafe.brew(CoffeeType.Latte);
		
		// assertTrue(CoffeeType.Latte == coffee.getType());
		// This Assert method get better diagnostic (than assertTrue), when test is failed
		AssertJUnit.assertEquals("Wrong coffee type", CoffeeType.Latte, coffee.getType());
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class)
	// @Test
	public void mustRestockMilk(){
		
		cafe.restockMilk(NO_MILK);
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class)
	// @Test
	public void mustRestockBeans(){

		cafe.restockBeans(NO_BEANS);
	}
	
	 
	@Test(expectedExceptions = IllegalStateException.class)
	// @Test
	public void lattesRequiresMilk(){
		
		withBeans();
		
		cafe.brew(CoffeeType.Latte);
		
	}

}