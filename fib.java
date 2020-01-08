import java.util.Scanner;

class fib{
	public static void main(String args[]){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = myObj.nextInt();
		int temp;
		int prev_sum = 1;
		int sum = 0;
		int count = 0;
		while(count != number){
			System.out.println(sum);
			temp = sum;
			sum = sum + prev_sum;
			prev_sum = temp;
			count++;
		}
	}
}
			
