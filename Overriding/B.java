class B extends A{
	int y;
	int x=100;
	
	B(){
		this.y=70;
	}
	
	void getY(){
		System.out.println("By : " + this.y);
		super.getX();
	}
	
	void getX(){
		int x = 500;
		System.out.println("Bx : " + this.x);
		System.out.println("Ax : " + super.x);
		System.out.println("Local x : " + x);
	}
}
