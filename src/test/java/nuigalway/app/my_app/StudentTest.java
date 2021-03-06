package nuigalway.app.my_app;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void test() 
	{
		//setting up student class and testing get methods
		Student s = new Student("Pete",20,"02/02/99");
		assertEquals("Pete20",s.getUsername());
		assertEquals("Pete",s.getName());
		assertEquals("02/02/99",s.getDOB());
		assertEquals(20,s.getAge());
		
		//using the set methods and then getting details from getters this check tests both setters/getters
		s.setAge(19);
		s.setName("Peter");
		s.setDOB("02/02/00");
		assertEquals("Peter19",s.getUsername());
		assertEquals("Peter",s.getName());
		assertEquals("02/02/00",s.getDOB());
		assertEquals(19,s.getAge());
	}

}
