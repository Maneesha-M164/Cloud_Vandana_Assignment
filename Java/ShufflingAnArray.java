package Java;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ShufflingAnArray {
  /*
    Question: Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
  */
	public static void main (String[] args) throws java.lang.Exception {
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (int i = 1; i <= 7; i++) {
			arr.add(i);
		}
		
		System.out.println("Array before shuffling: " + arr);
	
		Collections.shuffle(arr);
	
		System.out.println("Array after shuffling: " + arr);
	}
}
