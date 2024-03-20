package BasicMath;
import java.util.Scanner;

public class PalindromeInteger {
	
	public static boolean isPalindrome(int x) {
	       if(x < 0) return false;

	       int y = x; int revInt = 0;
	       while(y!=0)
	       {
	        revInt = (revInt*10) + y%10;
	        y = y/10;
	       }
	       return (revInt==x) ? true: false;
	        
	    }

	public static void main(String[] args) {
		
			Scanner userinput = new Scanner(System.in);
			System.out.println("Enter an Integer: ");
			int x = userinput.nextInt();
			
			System.out.println(isPalindrome(x));
			
			System.out.println(Math.pow(x, 3));
	}

}
