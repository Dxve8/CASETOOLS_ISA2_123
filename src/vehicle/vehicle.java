package vehicle;

public class vehicle {
   
int HP;
	
	vehicle(int HP){
		this.HP=HP;
	}
	
	void drive() {
		System.out.println("This vehicle Horsepower is:"+HP);
	}

	public static void main(String[] args) {
		
		car c = new car(80,50);
		c.drive();
	}
	
}
