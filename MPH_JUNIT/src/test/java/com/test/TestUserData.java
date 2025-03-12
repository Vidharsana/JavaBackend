package com.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
//import java.lang.reflect.Executable;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.rules.ExpectedException;

public class TestUserData {

	@Test
	public void testUserNameIsNull() {
		assertThrows(IllegalArgumentException.class, new Executable() {

			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				User data = new User();
				data.setName(null);
			}
		});
	}
	
	@Test
	public void testNameIssNull() {
		Throwable exception = assertThrows(IllegalArgumentException.class, ()->{
			User obj = new User();
			obj.setName(null);
		});
		assertEquals("username can't be blank" , exception.getMessage());
	}
	
	@Test
	public void testNameIsShort() {
		Throwable exception = assertThrows(IllegalArgumentException.class, ()->{
			User obj = new User();
			obj.setName("ro");
		});
		assertEquals("username is too short" , exception.getMessage());
	}
	
	@Test
	public void testNameIsLong() {
		Throwable exception = assertThrows(IllegalArgumentException.class, ()->{
			User obj = new User();
			obj.setName("sdfghj98uyghfdc9iujhrfdxvc9ikjmfdcxvolkjmerdfvco0ikjrefedscijkhefdscikjfdsocikjfdickjrfodkcjwokedsjff");
		});
		assertEquals("username is to long" , exception.getMessage());
	}
	@Rule
	public ExpectedException exception = ExpectedException.none();
	//@Test(expected = IllegalArgumentException.class)
	public void testNameValues() {
		User obj = new User();
		obj.setName(null);
	}
}
