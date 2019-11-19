package nuigalway.app.my_app;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import org.joda.time.DateTime;

public class CourseTest {

	@Test
	public void test() {
		
		//setting up variables for course class
		Student s = new Student("Pete",20,"02/02/99");
		Student s1 = new Student("Gary",21,"02/04/98");
		Student s2 = new Student("Tom",22,"23/03/97");
		ArrayList students = new ArrayList();
		students.add(s);
		students.add(s1);
		ArrayList modules = new ArrayList();
		modules.add("EE432");
		modules.add("EE401");
		DateTime start= new DateTime(2018,8,8,0,0);
		DateTime end= new DateTime(2019,5,8,0,0);
		Course c = new Course(modules,students,start,end,"Engineering");
		
		//testing get methods
		assertEquals(modules,c.getModules());
		assertEquals(students,c.getStudents());
		assertEquals(start,c.getStart());
		assertEquals(end,c.getEnd());
		assertEquals("Engineering",c.getName());
		
		
		//using the set methods and then getting details from getters this check tests both setters/getters
		
		modules.add("CT401");
		c.setModules(modules);
		assertEquals(modules,c.getModules());
		
		students.add(s2);
		c.setStudents(students);
		assertEquals(students,c.getStudents());
		
		start= new DateTime(2019,8,8,0,0);
		c.setStart(start);
		assertEquals(start,c.getStart());
		
		end= new DateTime(2020,5,8,0,0);
		c.setEnd(end);
		assertEquals(end,c.getEnd());
		
		c.setName("Computer Engineering");
		assertEquals("Computer Engineering",c.getName());
		
		
	}

}
