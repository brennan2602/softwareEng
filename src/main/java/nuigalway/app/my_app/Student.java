package nuigalway.app.my_app;

public class Student {
	private String name;
	private int age;
	private String DOB;
	
	//constructor 
	public Student(String name, int age, String DOB) 
	{
	this.name=name;
	this.age=age;
	this.DOB=DOB;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	
	public String getDOB() {
		return DOB;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setDOB(String DOB) {
		this.DOB=DOB;
	}
	
	public int getAge() {
		return age;
	}
	
	//making a username by concatenating name and age variables
	public String getUsername() {
		return name+age;
	}

}
