package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random rand = new Random();
		   
        

		//1. make an array of 5 Strings
		String[] myArr = {"deez", "nuts", "was", "here", "!"};
		
		//2. print the third element in the array
		System.out.println(myArr[2]);
		//3. set the third element to a different value
		myArr[2] = "wasn't";
		//4. print the third element again
		System.out.println(myArr[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i =0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
			
		}
		
		//6. make an array of 50 integers
		int[] myArr2 = new int[50];
		
		
		//7. use a for loop to make every value of the integer array a random number
		int min = 0;
		int max =0;
		for (int i=0;i < 50;i++) {
			int random = rand.nextInt(1000);
		     myArr2[i] = random;
		     
		     if (min > myArr2[i]) {
		    	 min = myArr2[i];
		     }
		     if (max < myArr2[i]) {
		    	 max = myArr2[i];
		     }
		     System.out.println(myArr2[i]);
		     
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(min);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		System.out.println(max);
	}
}
