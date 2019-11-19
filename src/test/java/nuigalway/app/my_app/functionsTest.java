package nuigalway.app.my_app;

import static org.junit.Assert.*;

import org.junit.Test;

public class functionsTest {

	@Test
	public void test() 
	{
		Student s = new Student("Pete",20,"02/02/99");
		assertEquals("Pete20",s.getUsername());
	}

}
