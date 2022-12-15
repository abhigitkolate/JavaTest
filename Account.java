package abhi;

import java.util.Scanner;

public class Account 
{
	public static void main(String[] args)
	{
		int i;
		int pin = 12345;
		int user_pin;
		int count = 0;
		
		Scanner s = new Scanner(System.in);
		
		for(i=0;i<3;i++)
		{
			System.out.println("Enter pin of account:");
			user_pin = s.nextInt();
		
			if(user_pin == pin)
			{
				System.out.println("Correct, welcome back");
				break;
			}
		
			else
			{
				System.out.println("Incorrect, try again");
				count++;
			}
		}
		if(count >= 3)
		{
			System.out.println("Sorry, you have been locked out");
		}
		
		s.close();
		
}
}
			
