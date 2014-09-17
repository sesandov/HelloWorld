import java.util.Scanner;
	
public class Welcome2 
{
	
		public static void main(String[] args) {
			Scanner input  = new Scanner(System.in);
				
			int num1, num2, sum, difference, product;
			
			
			System.out.print("Enter first number: ");
			num1 = input.nextInt();
			System.out.print("Enter second number: ");
			num2 = input.nextInt();
			
			sum = num1 + num2;
			difference = num1 - num2;
			product = num1 * num2;
			float quotient = (float) num1 / num2;
			
			System.out.printf("The sum is %d\n" , sum);
			System.out.printf("The difference is %d\n" , difference);
			System.out.printf("The product is %d\n" , product);
			System.out.printf("The quotient is %.2f\n" , quotient);
			
				
		}

}
	