package org.myprog.Java;

public class Fibonacii {

	public static void main(String[] args) {
		
		int f=0;
		int s=1;
		for(int i=0;i<=11;i++)
		{
			System.out.println(f);
			int sum=f+s;
			f=s;
			s=sum;
			
		}

	}

}
