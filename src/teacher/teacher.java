package teacher;

public class teacher {
   

	String type;
	
	teacher(String type){
		this.type=type;
	}
	
	void teaches() {
		System.out.println("Teacher is Teaching:"+type);
	}
	
}
