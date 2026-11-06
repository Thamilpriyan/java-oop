class Main{
	public static void main(String[] args){
		A a1 = new A();
		a1.setStudent();
		a1.getStudent();
		
		System.out.println();
		
		A a2 = new A();
		a2.setStudent(2000);
		a2.getStudent();
		
		System.out.println();
		
		A a3 = new A();
		a3.setStudent("Thamil");
		a3.getStudent();
		
		System.out.println();
		
		A a4 = new A();
		a4.setStudent(4000,"Priyan");
		a4.getStudent();
		
		
		System.out.println();
		
		A a5 = new A();
		a5.setStudent("Thamilpriyan", 5000);
		a5.getStudent();
	}
}