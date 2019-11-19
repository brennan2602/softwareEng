package nuigalway.app.my_app;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class ModuleTest {

	@Test
	public void test() {
		
		//setting up variables for module class
		Student s = new Student("Pete",20,"02/02/99");
		Student s1 = new Student("Gary",21,"02/04/98");
		Student s2 = new Student("Tom",22,"23/03/97");
		ArrayList students = new ArrayList();
		students.add(s);
		students.add(s1);
		ArrayList courses = new ArrayList();
		courses.add("ECE");
		courses.add("EEE");
		
		Module m = new Module(students,courses,"stats","EE341");
		
		//testing get methods
		assertEquals(students,m.getStudents());
		assertEquals(courses,m.getCourses());
		assertEquals("stats",m.getModuleName());
		assertEquals("EE341",m.getModuleID());
		
		
		//using the set methods and then getting details from getters this check tests both setters/getters
		students.add(s2);
		m.setStudents(students);
		assertEquals(students,m.getStudents());
		
		courses.add("CS");
		m.setCourses(courses);
		assertEquals(courses,m.getCourses());
		
		m.setModuleName("Maths");
		assertEquals("Maths",m.getModuleName());
		
		m.setModuleID("EE431");
		assertEquals("EE431",m.getModuleID());
		
		
	}

}
