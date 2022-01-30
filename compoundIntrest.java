package exam_two;

import java.util.Scanner;

public class compoundIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
		
		
		int principal,n,ci,amount;
		float rate,time;
		System.out.println("Enter principal:");
		principal = sc.nextInt();
		
		System.out.println("Enter rate:");
		rate=sc.nextFloat();
		
		System.out.println("enter time");
		time=sc.nextFloat();
		
		System.out.println("Enter number of times that interest is :");
		n=sc.nextInt();
		
		amount=(int)(principal*Math.pow((1+(rate/n)),(n*time)));
		System.out.println("Amount is:="+amount);
		
		ci=amount-principal;
		System.out.println("ci is:"+ci);
	}
		
		
}
	



		

	


