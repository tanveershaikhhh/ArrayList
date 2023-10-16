package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class DefineArrayList {
	public static void main(String[] args) {
		
		// ArrayList is in non continuous form 
		//size is variable
		/*
		 Array can store premitive datatypes, objects 
		 but in ArrayList we can only store OBJECTS
		*/	
		// ArrayList stored in HEAP
		 
		/*
		 *  1. ADD
		 *  2. GET
		 *  3. MODIFY
		 *  4. DELETE/REMOVE
		 *  5. ITERATE/OPERATIONS
		 */
	
		
		/*
		we cant use datatype in syntax as we know it can only store objects 
		so we will use class of datatypes
		 Integer | String |  Float | Boolean
		 */
		
		//SYNTAX
		// arraylistDeclaration nameOfArrayList = newKeyword arraylistDeclaration
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList <String> stringList = new ArrayList<>();
		
		// add elements
		list.add(0);
		list.add(1);
		list.add(2);
		System.out.println("Printing ArrayList");
		System.out.println(list+ "\n");
		
		// get elements
		int element = list.get(0);
		System.out.println("Printing Element at 0 index");
		System.out.println(element+ "\n");
		
		// add element in between
		list.add(1,55);
		System.out.println("Adding Element at 1 index");
		System.out.println(list + "\n");
		
		// set element
		System.out.println("Set Element at 0 index");
		list.set(0, 50);
		System.out.println(list+ "\n");
		
		// Delete element
		System.out.println("Delete Element at 0 index");
		list.remove(0);
		System.out.println(list+ "\n");
		
		//size
		System.out.print("Size of ArrayList -->  ");
		int size = list.size();
		System.out.println(size+ "\n");
		
		//loops
		System.out.println("Printing using loops");
		  for (int i=0; i<list.size(); i++) {
			  System.out.print(list.get(i) + " ");
		  }
		  System.out.println("\n");
		  
		  //sorting
		  System.out.println("Sorting using Collection class");
		  Collections.sort(list);
		  System.out.println(list);
	}
		
}
