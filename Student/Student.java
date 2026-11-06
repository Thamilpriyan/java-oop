class Student{
	int id;
	String name;
	
	void setStudent(int id, String name){
		id=10;
		this.id = id;
		this.name = name;
		System.out.println(id);
	}
	
	void getStudent(){
		System.out.println("Id: " + this.id);
		System.out.println("Name: "+ this.name);
	}
}
