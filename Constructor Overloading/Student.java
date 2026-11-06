class Student{
	int id;
	String name;
	
	Student(){
		this.id = 1000;
		this.name = "Yoha";
	}
	
	Student(int id){
		this.id =id;
		this.name = "Muralee";
	}
	
	Student(String name){
		this.id = 3000;
		this.name = name;
		
	}
	
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	Student(String name, int id){
		this.id=id;
		this.name=name;
	}
	
	void getStudent(){
		System.out.println("ID: " + this.id);	
		System.out.println("Name: " + this.name);	
	}
}
