//Computer class 3 methods 5 properties 1 object


class Computer{
	String brand;
	String processor;
	int ramSize;
	int storageSize;
	double price;
	
	void powerOn(){
		System.out.println("The laptop is powerOn");
	}
	
	void powerOff(){
		System.out.println("The laptop is shutdown");
	}
	
	void displayDetails(){
		System.out.println("=== Show Computer Details ===");
		System.out.println("1. Brand : " + this.brand);
		System.out.println("2. Processor : " + this.processor);
		System.out.println("3. Ram Size : " + this.ramSize);
		System.out.println("4. Storage size : " + this.storageSize);
		System.out.println("5. Price : " + this.price);
		
	}
} 