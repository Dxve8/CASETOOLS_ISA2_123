package teacher;

import java.util.Scanner;

public class teaches extends teacher {
String name;
	
	teaches(String name,String type){
		super(type);
		this.name=name;
	}
	
	void subject() {
		System.out.println("Teacher name is:"+name);
		super.teaches();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter teacher name");
		String name = scan.nextLine();
		System.out.println("Enter teacher subject");
		String type = scan.nextLine();
		
		teaches t = new teaches(name,type);
		t.subject();
	}
}
