class Main{
	public static void main(String[] args){
		Computer C;
		
		C = new Computer();
		
		C.brand = "Hp";
		C.processor="13th Gen Intel(R)Core(TM) i5-13420H";
		C.ramSize=16;
		C.storageSize=512;
		C.price=333000.00;
		
		C.powerOn();
		C.powerOff();
		C.displayDetails();
	}
}