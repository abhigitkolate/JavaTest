package abhi;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
        int count = 0;
		
		System.out.println("Enter a number:");
		long num = s.nextLong();
		while(num != 0 )
		{
			num = num/10;
			count++;
		}
		System.out.println("Number of digits in given number:"+count);
		
	}

}
