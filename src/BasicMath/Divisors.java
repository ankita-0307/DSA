package BasicMath;

import java.util.Scanner;

public class Divisors {

	
	// problem: Find the sum of ‘sumOfDivisors(i)’ for all ‘i’ from 1 to ‘n’.  sum of all divisors of 1 to n , if n=3 then sum of all divisors of 1,2 and 3.
	//
	
	public static int sumOfAllDivisors(int n){
        // Write your code here.
        int sum = 0;
        for(int j=1; j<=n; j++)
        {
             for(int i=1; i<=(int)Math.sqrt(j); i++)
            {
                if(j%i==0)
                {
                    sum+=i;
                    if(j/i!=i)
                    {
                        sum+=j/i;
                    }
                }
            }
        }
       
        return sum;
    }
	
public static void main(String[] args){
		
	Scanner userinput = new Scanner(System.in);
	 System.out.println("Enter an Integer: ");
	 int x = userinput.nextInt();
	
	 System.out.println(sumOfAllDivisors(x));
		
	}

	
	
}
