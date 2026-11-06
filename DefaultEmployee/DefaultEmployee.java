class DefaultEmployee{
	int id;
	String name;
	double basicSalary;
	double bonus;
	
	void setEmployee(){
		id = 1001;
		name = "Thamilpriyan";
		basicSalary = 120000;
	}
	
	void calcBonus(){
		if(basicSalary > 100000){
			bonus = (basicSalary / 100) * 10;
		}
		else{
			bonus = (basicSalary / 100) * 5;
		}
	}
	
	void displayDetails(){
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Basic Salary : " + basicSalary);
		System.out.println("Bonus : " + bonus);
		System.out.println("Total Salary : " + (basicSalary + bonus));
	}
}