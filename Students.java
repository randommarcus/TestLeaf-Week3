package week3.day1;

public class Students {

	public static void main(String[] args) {
		
		Students st = new Students();
		
		st.getStudentInfo(9160059);
		st.getStudentInfo(9160059, "Sudarshan");
		st.getStudentInfo("sudu@gmail.com", 123456789);
	}
	
	public void getStudentInfo(int id) {
		System.out.println("Student ID: "+id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Stduent ID: "+id +" and Stduent Name: "+name);
	}
	
	public void getStudentInfo(String email, long num) {
		System.out.println("Student Email: "+email +" and Stduent Number: "+num);
	}

}
