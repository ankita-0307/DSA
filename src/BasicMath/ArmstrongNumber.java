package BasicMath;
import java.util.Scanner;


public class ArmstrongNumber {
	
	public static boolean Armstrong(int x)
	{
		int y = x; int sum =0;
	    int count = (int) Math.floor(Math.log10(x)+1);
		
		while(y!=0)
		{
			int z = y%10;
			sum = (int) (sum + Math.pow(z,count));
			y=y/10;
		}
		return (sum==x);

	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int x = userinput.nextInt();
		
		System.out.print(Armstrong(x));

	}

}
