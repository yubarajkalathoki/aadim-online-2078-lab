
public class Student{
	int rollNo = 10;
	
	String getName() {
		String name = "Milan Parajuli";
		return name;
	}
	
	public static void main(String[] args) {
		Student milan = new Student();
		String name = milan.getName();
		System.out.println("Student name: "+name);
		
		
		Teacher teacher = new Teacher();
		
		teacher.setName("Lokesh Gupta");
		
		System.out.println("Teacher name: "+teacher.getName());
	}
}

