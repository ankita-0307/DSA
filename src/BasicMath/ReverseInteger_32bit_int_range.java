package BasicMath;

import java.util.Scanner;

public class ReverseInteger_32bit_int_range {
	
   // problem: Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
	
	public static int ReverseInt(int x)
	{
		 int y = x;
	        int rev = 0;
	        while(y!=0)
	        {
	            int z = y%10;    // extract last digit
	            
	            // comparing rev to 32 bit max int range. if edge case is reached then checking edge case before adding last int to reverse variable to avoid overflow . checking in both positive and negative range. if true return zero
	            
	            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && z > 7)) 
	                return 0;
	            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && z < -8))
	                return 0;
	            
	            rev = rev*10 + z;   // adding digits in reverse order
	            y = y/10;   // reducing digit for next iteration
	        }
	        return rev; 
	}

	public static void main(String[] args) {
		
		 Scanner userinput = new Scanner(System.in);
		 System.out.println("Enter an Integer: ");
		 int x = userinput.nextInt();
		
		 System.out.println(ReverseInt(x));

	}

}
