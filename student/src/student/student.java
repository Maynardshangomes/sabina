package student;

public class student {
	
	String name,rollno;
	int age;
	
	student(String name,String rollno,int age)
	{
		this.name=name;
		this.rollno=rollno;
		this.age=age;
	}
	String getName() {
		return name;
	}

	String getRollno() {
		return rollno;
	}
	
	int getAge() {
		return age;
	}

}
