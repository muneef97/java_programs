import java.util.*;
import java.lang.*;
import java.io.*;

class string_reverse{
	public static void main(String args[]){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = myObj.nextLine();
		char[] try1 = name.toCharArray();
		for (int i=try1.length-1; i>=0; i--)
			System.out.print(try1[i]);
	}
}
