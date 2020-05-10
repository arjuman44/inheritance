package multilevel;

public class Runner {
	
	public static void main(String[] args) {
		
		Student S = new Student();
		
		System.out.println("University name is :"+S.universityName);
		System.out.println("College name is :"+S.collegename);
		System.out.println("Student name is :"+S.studentname);
		
		System.out.println("--------");
		
		S.noOfColleges();
		S.noOfStudents();
		S.study();
	}

}
