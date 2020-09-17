 import java.util.*;
public class Q15{   
public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the gender and age: ");
		char gender = sc.next().charAt(0);
                //char s = gender.charAt(0);
		int age = sc.nextInt();
		if((gender=='F' && age>=18) || (gender=='M' && age>=21)) {
			System.out.println("Eligible for marriage");
		}
		else
		{
			System.out.println("Not Eligible for marriage");
		}
	}
}