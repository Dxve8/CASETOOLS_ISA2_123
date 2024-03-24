package vehicle;

public class car extends vehicle {
     int HP;
	
	car(int HP1,int HP){
		super(HP);
		this.HP=HP1;	
	}

	@Override
	void drive() {
		super.drive();
		System.out.println("This cars horsepower is:"+HP);
	}
	
	
}
