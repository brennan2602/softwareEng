package nuigalway.app.my_app;

public class Student {
private String name;
private int age;
private String DOB;

public Student(String name, int age, String DOB) {
this.name=name;
this.age=age;
this.DOB=DOB;
}

public String getName() {
	return name;
}

public String getDOB() {
	return DOB;
}

public int getAge() {
	return age;
}

public String getUsername() {
	return name+age;
}

}
