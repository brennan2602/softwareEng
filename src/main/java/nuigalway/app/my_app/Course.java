package nuigalway.app.my_app;
import org.joda.time.DateTime;
import java.util.ArrayList;
public class Course {
	private ArrayList modules;
	private ArrayList students;
	private DateTime start;
	private DateTime end;
	
	public Course(ArrayList modules, ArrayList students, DateTime start, DateTime end) {
		this.modules = modules;
		this.students = students;
		this.start = start;
		this.end = end;
	}

	public ArrayList getModules() {
		return modules;
	}

	public void setModules(ArrayList modules) {
		this.modules = modules;
	}

	public ArrayList getStudents() {
		return students;
	}

	public void setStudents(ArrayList students) {
		this.students = students;
	}

	public DateTime getStart() {
		return start;
	}

	public void setStart(DateTime start) {
		this.start = start;
	}

	public DateTime getEnd() {
		return end;
	}

	public void setEnd(DateTime end) {
		this.end = end;
	}
	
	
	

}
