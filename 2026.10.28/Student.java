class Student{
	int id;
	String name;
	int m1, m2, m3;
	
	void setStudent(int id, String name, int m1, int m2, int m3){
		this.id = id;
		this.name =name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	int calcTotal(){
		int total=0;
		total = this.m1+this.m2+this.m3;
		return total;
	}
	
	double calcAverage(int total){
		double average=0.0;
		average = total/3.0;
		return average;
	}
	
	char getResult(double average){
		char result='\u0000';
		if(average >= 75){
			result='A';
		}
		else if (average >= 65){
			result='B';
		}
		else if (average >= 55){
			result='C';
		}
		else if (average >= 45){
			result='D';
		}
		else{
			result = 'F';
		}
		
		return result;
	}
	
	void displayDetails(){
		System.out.println("Id : " + this.id);
		System.out.println("Name : " + this.name);
		System.out.println("Mark 1 : " + this.m1);
		System.out.println("Mark 2 : " + this.m2);
		System.out.println("Mark 3 : " + this.m3);
		int t = this.calcTotal();
		System.out.println("Total : " + t);
		double ave = this.calcAverage(t);
		System.out.println("Average : "+ ave);
		char res = this.getResult(ave);
		System.out.println("Result : " + res);
	}
}