package com.lti.demo;




import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.lti.entity.Calculator;
import com.lti.entity.Product;
import com.lti.entity.ProductService;
import com.lti.entity.User;

class TestCases {
    @Test
    public void testAddProduct()
    {
    	Product p=new Product(101,"Mobile",5000);
    	ProductService ps=new ProductService();
    	Assertions.assertEquals("Product Added",ps.addProduct(p));
    }
    @Test
    public void testIcard()
    {
    	Product p=new Product(101,"Mobile",3000);
    	Assertions.assertEquals("LTI",p.getCompanyName());
    	
    }
	@BeforeAll
    static void setUp() {
    	System.out.println("@BeforeALL Executed");
    	
    }
    @BeforeEach
    void setupMethod() {
    	System.out.println("@beforeEach executed");
    }
	
	@Test

	void test() {
//		Scanner sc=new Scanner(System.in);
//		String s=sc.next();
//	fail("not yet implemented");
//		Assertions.assertEquals("LTI","Lti");
	
	}
//	@Test
//	void testCalculatorSumMethod() {
//		Calculator c=new Calculator();
//		int r=c.sum(100, 200);
//		Assertions.assertEquals(300, r);
//        
////	}
	@Test
	public void testUsernameIsNull() {
		assertThrows(IllegalArgumentException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				User user = new User();
				user.setName(null);
			}
		});
	}

	// same can be written using lambda
	
	@Test
	public void testUsernameIsNull2() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			User user = new User();
			user.setName(null);
		});
		Assertions.assertEquals("Username cannot be blank", exception.getMessage());
	}


	 
	@Test
    @Disabled
	public void testAry() {
		ArrayList<String> myList=new ArrayList<>();
		myList.add("hello");
		Assertions.assertFalse(myList.isEmpty());
		//Assertions.assertTrue(myList.isEmpty());;
		
	}
	@Test
	void testCalculatorSumMethod() {
		Calculator c=new Calculator();
		int r=c.sum(100, -200);
		Assertions.assertEquals(-100, r);
        
	}
	@AfterEach
	void tearMethods() {
		System.out.println("@AfterEach method");
		
	}
    @AfterAll
    static void tearAll() {
    	System.out.println("\n @AfterAll executed");
    }
    @Test
	public void testUserNameIsTooShort()
	{
		Throwable exception = assertThrows(
				IllegalArgumentException.class, () -> {
					User user = new User();
					user.setName("Om");
				}
		);
		Assertions.assertEquals("Username is too short", exception.getMessage());
	}
    
	
	@Test
	public void testUserNameIsTooLong()
	{
		Throwable exception = assertThrows(
				IllegalArgumentException.class, () -> {
					User user = new User();
					user.setName("1234567890123456789012345678901234567890");
				}
		);
		Assertions.assertEquals("Username is too long", exception.getMessage());
	}
  
    }

