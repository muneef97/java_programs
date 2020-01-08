import java.util.Scanner;

class prime{
	public static void main(String args[]){
		Scanner myObj= new Scanner(System.in);
		System.out.println("Enter the input :");
		int number = myObj.nextInt();
		for(int i=1;i<=number;i++){
			int count = 0;
			for (int j=1;j<=i;j++){				
				if (i%j == 0 && i!=j){
					count ++;
				}
			}
			if (count == 1){
				System.out.println(i);
			}	
		}
	}
}
