package abhi;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args)
	{
		int i,num1,num2,even_sum=0,odd_sum=0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		num1 = s.nextInt();
		
		System.out.println("Enter second number:");
		num2 = s.nextInt();
		
		if(num1 < num2)
		{
			for(i=num1; i<num2; i++)
			{
				if(num1 %2 == 0)
				{
					System.out.println(num1+" is even");
					even_sum = even_sum + num1;
				}
				
				else
				{
					System.out.println(num1+" is odd");
					odd_sum = odd_sum + num2;
				}
				num1++;
			}
			System.out.println("Sum of all even number is "+even_sum);
			
			System.out.println("Sum of all odd number is "+odd_sum);
				
		}
	}

}
