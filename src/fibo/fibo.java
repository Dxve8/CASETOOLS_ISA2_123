package fibo;
import java.util.Scanner;

public class fibo {
	int n1=0,n2=1,n3;
	fibo(int num){
		System.out.println(n1+"\n"+n2);
		for(int i=2;i<num;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
		
	}
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number how many numbers to be displayed from Fibonacci Series");
		int num=scan.nextInt();
		fibo fib = new fibo(num);
	}
}
