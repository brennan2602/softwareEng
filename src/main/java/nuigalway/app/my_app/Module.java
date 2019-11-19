package nuigalway.app.my_app;

import java.util.ArrayList;
	
	public class Module {
	private ArrayList students=new ArrayList();
	private ArrayList courses=new ArrayList();
	private String moduleName;
	private String moduleID;
	
	//constructor
	public Module(ArrayList students, ArrayList courses, String moduleName, String moduleID) {
		this.students=students;
		this.courses=courses;
		this.moduleName=moduleName;
		this.moduleID=moduleID;
	}
	
	//getters and setters
	public ArrayList getStudents() {
		return students;
	}
	
	public void setStudents(ArrayList students) {
		this.students = students;
	}
	
	public ArrayList getCourses() {
		return courses;
	}
	public void setCourses(ArrayList courses) {
		this.courses = courses;
	}
	
	public String getModuleName() {
		return moduleName;
	}
	
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	public String getModuleID() {
		return moduleID;
	}
	
	public void setModuleID(String moduleID) {
		this.moduleID = moduleID;
	}
	
	

}
