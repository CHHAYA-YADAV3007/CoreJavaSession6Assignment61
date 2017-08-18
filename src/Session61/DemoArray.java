/**
 * DemoArray.java
 * version 1.1
 * Compiled on 16th Aug 2017
 */

//package declaration
package Session61;

//importing the Scanner from inbuilt package to take user input
import java.util.Scanner ;
/**
 * This class will illustrate the various ways of declaration , instantiation and initialization of one-dimensional arrays.
 * This class will show how to pass array as an argument to method and display the array elements.
 * @author chhaya yadav
 *
 */
//Class declaration
public class DemoArray{

//Static method declaration  for displaying Array elements and receiving an array instance as an argument
	
public static void dispEven(int arr[]){
		
		int i = 0;
		
//display the array element via for loop
		
		for (i = 0; i < arr.length ; i++){
			
//determining the  even number for each element,if number is totally divisible by 2 , then it is an even number
			
			if (arr[i] % 2 == 0)
				
//print the even array elements
				
				System.out.println( arr[i] + " Even Number in Array is at Index Position "+ i +".");
		}
}


//method declaration to take an array as an input

public static void inputArrayElement(int arr[]){
	
//Scanner class object declaration and instantiation for user input
	
		Scanner sc = new Scanner(System.in);
		
//take  user input for all array elements  for the declared array size	
		
		for(int j = 0 ; j < arr.length ; j++) {
		
			System.out.println("Enter the element a[" +j+"]: ");
			
			arr[j] = sc.nextInt();
			
			
		}

//closure of Scanner class instance
		sc.close();
}



//Main method declaration for array declaration, instantiation and initialization

public static void main(String[] args) {
		
//declaration and instantiation of an integer array for size 10
	
	int[] a = new int[10] ;
	
//method calling to take array elements as user input	
	
	inputArrayElement(a);
		
	System.out.println("Array 1 Display the Even Numbers !");

//display the elements of array instance a	
	
	dispEven(a);
	
	
	
	
    
    
//integer array c declaration, instantiation and initialization
    
    int[] c = new int[]{45 , 65 , 81 , 56 , 67 , 79 , 52 , 64 , 71 , 90 };
    
    System.out.println("Array 2 Display the Even Numbers !");
    
//method calling to display elements of array c   
  
    dispEven(c);
    
    
    
//array b declaration and instantiation   
    
    int[] b = new int[10] ;
    
//array b initialization
    
    b[0] = 10 ;
    
    b[1] = 11 ;
    
    b[2] = 12 ;
    
    b[3] = 13 ;
    
    b[4] = 14 ;
    
    b[5] = 15 ;
    
    b[6] = 16 ;
    
    b[7] = 17 ;
    
    b[8] = 18 ;
    
    b[9] = 19 ;
    
    System.out.println("Array 3 Display the Even Numbers !");
    
//display the elements of array b    
    
    dispEven(b) ;
    
    		

	}

}
