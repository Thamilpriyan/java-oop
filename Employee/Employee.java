class Employee{
	int id;
	String name;
	double basicSalary;
	//double bonus;

	void setEmployee(int id, String name, double basicSalary){
		this.id = id;
		this.name = name;
		this.basicSalary= basicSalary;
	}
	
	double calcBonus(){
		double bonus =0.0;
		if (this.basicSalary > 100000){
			bonus = (this.basicSalary / 100) * 10;
		}
		else {
			bonus = (this.basicSalary / 100) * 5;
		}
		return bonus;	
	}
	
	void displayDetails(){
		System.out.println("Id : " + this.id);
		System.out.println("Name : " + this.name);
		System.out.println("Basic Salary : " + this.basicSalary);
		
		double b = this.calcBonus();
		System.out.println("Bonus : " + b);
		System.out.println("Net Salary : " + (b + this.basicSalary));
	}
}

