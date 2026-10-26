class Main{
	public static void main(String [] args){
		Pen P;
		P = new Pen(); //new -- memory allocation  , Pen() -- Constructor
		
		System.out.println(P.color);
		System.out.println(P.height);
		
		P.color = "Red";  //p. -- member acceess operator 
		P.height = 10.5;
		P.weight = 9.3;
		P.brand = "Ten";
		P.price = 85;
		P.madeIn = "Sri Lanka";
		P.write();
	}
}

