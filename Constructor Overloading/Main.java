class Main{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.getStudent();
		
		System.out.println();
		
		Student s2 = new Student(2000);
		s2.getStudent();
		
		System.out.println();
		
		Student s3 = new Student("Thamil");
		s3.getStudent();
		
		System.out.println();
		
		Student s4 = new Student(4000,"Priyan");
		s4.getStudent();
		
		
		System.out.println();
		
		Student s5 = new Student("Thamilpriyan", 5000);
		s5.getStudent();
	}
}
